package com.italika.demo.entity;

import com.italika.demo.model.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name =  "producto")
@Entity
public class ProductoEntity {
	
	public ProductoEntity() {}
	
	public ProductoEntity(ProductoModel prod) {
		this.setNombre(prod.getNombre());
		this.setDescripcion(prod.getDescripcion());
		this.setPrecio(prod.getPrecio());
		this.setCantidad(prod.getCantidad());
		this.setBloqueado(prod.isBloqueado());
	}
	
	public ProductoEntity(long id, ProductoModel prod) {
		this.setId(id);
		this.setNombre(prod.getNombre());
		this.setDescripcion(prod.getDescripcion());
		this.setPrecio(prod.getPrecio());
		this.setCantidad(prod.getCantidad());
		this.setBloqueado(prod.isBloqueado());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 80)
	private String nombre;
	
	@Column(name = "descripcion", nullable = false, length = 200)
	private String descripcion;
	
	@Column(name = "precio", nullable = false)
	private double precio;
	
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	
	@Column(name = "bloqueado", nullable = false)
	private boolean bloqueado;
	
}
