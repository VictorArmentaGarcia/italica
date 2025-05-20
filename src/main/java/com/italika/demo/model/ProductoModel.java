package com.italika.demo.model;

import com.italika.demo.entity.ProductoEntity;

import lombok.Data;

@Data
public class ProductoModel {

	public ProductoModel() {}
	
	public ProductoModel(ProductoEntity prod) {
		this.setIdProducto(prod.getId());
		this.setNombre(prod.getNombre());
		this.setDescripcion(prod.getDescripcion());
		this.setPrecio(prod.getPrecio());
		this.setCantidad(prod.getCantidad());
		this.setBloqueado(prod.isBloqueado());
	}
	
	private long idProducto;
	
	private String nombre;
	
	private String descripcion;
	
	private double precio;
	
	private int cantidad;
	
	private boolean bloqueado;
	
}
