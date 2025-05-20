package com.italika.demo.service;

import com.italika.demo.model.ProductoModel;

/**
 * The Interface ValidaProducto.
 */
public interface ValidaProducto {

	/**
	 * Valida producto.
	 *
	 * @param prodModel the prod model
	 * @param idProducto the id producto
	 * @return true, if successful
	 */
	String ValidaProducto(ProductoModel prodModel, boolean newProduct);
	
}
