package com.italika.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italika.demo.exception.BusinessException;
import com.italika.demo.model.ProductoModel;
import com.italika.demo.service.ProductoService;

/**
 * The Class ProductoController.
 */
@RestController
@RequestMapping("/italika/rest/v1.0/privado")
@CrossOrigin
public class ProductoController {

	/** The producto service. */
	private ProductoService productoService;
	
	/**
	 * Instantiates a new producto controller.
	 *
	 * @param prodService the prod service
	 */
	public ProductoController(ProductoService prodService) {
		this.productoService = prodService;
	}
	
	/**
	 * Save.
	 *
	 * @param productoModel the producto model
	 * @return the object
	 */
	@PostMapping(value = "/producto", produces = { "application/json" })
	public Object save(@RequestBody ProductoModel productoModel){
		try {
			return this.productoService.saveProducto(productoModel);
		} catch (BusinessException e) {
			return getBusines(e);
		}
	}
	
	/**
	 * Update.
	 *
	 * @param id the id
	 * @param productoModel the producto model
	 * @return the object
	 */
	@PutMapping(value = "/producto/{id}", produces = { "application/json" })
	public Object update(@PathVariable int id, @RequestBody ProductoModel productoModel){
		try {
			return this.productoService.updateProducto(id, productoModel);
		} catch (BusinessException e) {
			return getBusines(e);
		}
	}
	
	/**
	 * Gets the producto.
	 *
	 * @return the producto
	 * @throws BusinessException the business exception
	 */
	@GetMapping(value = "/producto" , produces = { "application/json" })
	public Object getProducto() throws BusinessException{
		return this.productoService.getProductos();
	}

	/**
	 * Gets the producto.
	 *
	 * @param id the id
	 * @return the producto
	 */
	@GetMapping(value = "/producto/{id}", produces = { "application/json" })
	public Object getProducto(@PathVariable int id) {
		try {
			return this.productoService.getProducto(id);
		} catch (BusinessException e) {
			return getBusines(e);
		}
	}
	
	/**
	 * Gets the busines.
	 *
	 * @param be the be
	 * @return the busines
	 */
	private Object getBusines(BusinessException be) {
		int numberHTTPDesired = Integer.parseInt(be.getErrorResponse().getCode());
		return new ResponseEntity<>(be.getErrorResponse(), HttpStatus.valueOf(numberHTTPDesired));
	}
}
