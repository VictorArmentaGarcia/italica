package com.italika.demo.service;

import com.italika.demo.exception.BusinessException;
import com.italika.demo.model.GenericModel;
import com.italika.demo.model.ProductoModel;

public interface ProductoService {

	ProductoModel saveProducto(ProductoModel productoModel) throws BusinessException;
	
	Object updateProducto(int id, ProductoModel productoModel) throws BusinessException;
	
	Object getProductos() throws BusinessException;
	
	Object getProducto(int idProductoModel) throws BusinessException;
	
	GenericModel deleteProducto(int idProducto);
}
