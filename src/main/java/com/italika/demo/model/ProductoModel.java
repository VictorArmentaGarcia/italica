package com.italika.demo.model;

import com.italika.demo.entity.ProductoEntity;

import lombok.Data;

/**
 * The Class ProductoModel.
 */
@Data
public class ProductoModel {

	/**
	 * Instantiates a new producto model.
	 */
	public ProductoModel() {}
	
	/**
	 * Instantiates a new producto model.
	 *
	 * @param prod the prod
	 */
	public ProductoModel(ProductoEntity prod) {
		this.setIdProducto(prod.getId());
		this.setNombre(prod.getNombre());
		this.setDescripcion(prod.getDescripcion());
		this.setPrecio(prod.getPrecio());
		this.setCantidad(prod.getCantidad());
		this.setBloqueado(prod.isBloqueado());
	}
	
	/** The id producto. */
	private long idProducto;
	
	/** The nombre. */
	private String nombre;
	
	/** The descripcion. */
	private String descripcion;
	
	/** The precio. */
	private double precio;
	
	/** The cantidad. */
	private int cantidad;
	
	/** The bloqueado. */
	private boolean bloqueado;
	
}
