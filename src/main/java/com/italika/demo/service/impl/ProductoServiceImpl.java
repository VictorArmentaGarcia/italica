package com.italika.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.italika.demo.entity.ProductoEntity;
import com.italika.demo.enums.EnumHttpStatus;
import com.italika.demo.exception.BusinessException;
import com.italika.demo.model.GenericModel;
import com.italika.demo.model.ProductoModel;
import com.italika.demo.repository.ProductoRepo;
import com.italika.demo.service.ProductoService;

import jakarta.transaction.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepo productoRepo;
	
	private final String MENSAJE_VACIO = "No existe producto";
	
	@Override
	public ProductoModel saveProducto(ProductoModel productoModel) throws BusinessException {
		try {
			ProductoEntity prodEntity = new ProductoEntity(productoModel);
			productoRepo.save(prodEntity);
			return new ProductoModel(prodEntity);	
		} catch (Exception e) {
			throw new BusinessException(EnumHttpStatus.CLIENT_ERROR_BAD_REQUEST, "Inconveniente al guardar informacion", e.getMessage());
		}
	}

	@Override
	public Object updateProducto(int id, ProductoModel productoModel) throws BusinessException {
		try {
			Optional<ProductoEntity> prodEntity = productoRepo.findById(id);
			
			if(!prodEntity.isPresent()) {
				return new GenericModel(404, "El producto que quiere actualizar no existe", null);
			}
			
			if(prodEntity.get().isBloqueado()) {
				return new GenericModel(404, "El producto que quiere modificar esta bloqueado", null);
			}
				
			ProductoEntity prodEntityUpd = new ProductoEntity(productoModel);
			productoRepo.save(prodEntityUpd);
			return new ProductoModel(prodEntityUpd);	
		} catch (Exception e) {
			throw new BusinessException(EnumHttpStatus.CLIENT_ERROR_BAD_REQUEST, "Inconveniente al actualizar informacion", e.getMessage());
		}
	}

	@Override
	public Object getProductos() throws BusinessException {
		try {
			List<ProductoEntity> productoEntity = productoRepo.findAll();
			
			if(productoEntity.isEmpty()) {
				return new ArrayList<>();
			}
			
			return productoEntity.stream().map(p-> new ProductoModel(p)).toList();	
		} catch (Exception e) {
			throw new BusinessException(EnumHttpStatus.CLIENT_ERROR_BAD_REQUEST, "Inconveniente al consultar informacion", e.getMessage());
		}
	}

	@Override
	public Object getProducto(int idProductoModel) throws BusinessException {
		try {
			Optional<ProductoEntity> prodEntity = productoRepo.findById(idProductoModel);
			
			if(!prodEntity.isPresent()) {
				return new GenericModel(404, MENSAJE_VACIO, null);
			}
			
			return new ProductoModel(prodEntity.get());	
		} catch (Exception e) {
			throw new BusinessException(EnumHttpStatus.CLIENT_ERROR_BAD_REQUEST, "Inconveniente al consultar informacion", e.getMessage());
		}
	}

	@Override
	public GenericModel deleteProducto(int idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
