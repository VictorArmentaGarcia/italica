package com.italika.demo.entity;

import com.italika.demo.model.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * The Class ProductoEntity.
 */
@Data
@Table(name =  "producto")
@Entity
public class ProductoEntity {
	
	/**
	 * Instantiates a new producto entity.
	 */
	public ProductoEntity() {}
	
	/**
	 * Instantiates a new producto entity.
	 *
	 * @param prod the prod
	 */
	public ProductoEntity(ProductoModel prod) {
		this.setNombre(prod.getNombre());
		this.setDescripcion(prod.getDescripcion());
		this.setPrecio(prod.getPrecio());
		this.setCantidad(prod.getCantidad());
		this.setBloqueado(prod.isBloqueado());
	}
	
	/**
	 * Instantiates a new producto entity.
	 *
	 * @param id the id
	 * @param prod the prod
	 */
	public ProductoEntity(long id, ProductoModel prod) {
		this.setId(id);
		this.setNombre(prod.getNombre());
		this.setDescripcion(prod.getDescripcion());
		this.setPrecio(prod.getPrecio());
		this.setCantidad(prod.getCantidad());
		this.setBloqueado(prod.isBloqueado());
	}
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/** The nombre. */
	@Column(name = "nombre", nullable = false, length = 80)
	private String nombre;
	
	/** The descripcion. */
	@Column(name = "descripcion", nullable = false, length = 200)
	private String descripcion;
	
	/** The precio. */
	@Column(name = "precio", nullable = false)
	private double precio;
	
	/** The cantidad. */
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	
	/** The bloqueado. */
	@Column(name = "bloqueado", nullable = false)
	private boolean bloqueado;
	
}
