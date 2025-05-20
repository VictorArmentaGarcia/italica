package com.italika.demo.service;

import com.italika.demo.exception.BusinessException;
import com.italika.demo.model.GenericModel;
import com.italika.demo.model.ProductoModel;

/**
 * The Interface ProductoService.
 */
public interface ProductoService {

	/**
	 * Save producto.
	 *
	 * @param productoModel the producto model
	 * @return the producto model
	 * @throws BusinessException the business exception
	 */
	ProductoModel saveProducto(ProductoModel productoModel) throws BusinessException;
	
	/**
	 * Update producto.
	 *
	 * @param id the id
	 * @param productoModel the producto model
	 * @return the object
	 * @throws BusinessException the business exception
	 */
	Object updateProducto(int id, ProductoModel productoModel) throws BusinessException;
	
	/**
	 * Gets the productos.
	 *
	 * @return the productos
	 * @throws BusinessException the business exception
	 */
	Object getProductos() throws BusinessException;
	
	/**
	 * Gets the producto.
	 *
	 * @param idProductoModel the id producto model
	 * @return the producto
	 * @throws BusinessException the business exception
	 */
	Object getProducto(int idProductoModel) throws BusinessException;
	
	/**
	 * Delete producto.
	 *
	 * @param idProducto the id producto
	 * @return the generic model
	 */
	GenericModel deleteProducto(int idProducto);
}
