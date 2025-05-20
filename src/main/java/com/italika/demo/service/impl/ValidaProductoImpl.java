package com.italika.demo.service.impl;

import org.springframework.stereotype.Service;

import com.italika.demo.model.ProductoModel;
import com.italika.demo.service.ValidaProducto;
import com.italika.demo.utils.ObjectUtils;

/**
 * The Class ValidaProductoImpl.
 */
@Service
public class ValidaProductoImpl implements ValidaProducto {

	/**
	 * Valida producto.
	 *
	 * @param prodModel the prod model
	 * @param newProduct the new product
	 * @return the string
	 */
	@Override
	public String ValidaProducto(ProductoModel prodModel, boolean newProduct) {
		
		if(newProduct) {
			if(prodModel.getIdProducto() <= 0)
				return "Es necesario informar el id";
		}
		
		if(!ObjectUtils.validaString(prodModel.getNombre())){
			return "Es necesario informar de forma adecuada el nombre";
		}
		
		if(!ObjectUtils.validaString(prodModel.getDescripcion())){
			return "Es necesario informar de forma adecuada la descripcion";
		}
		
		return "ok";
	}

}
