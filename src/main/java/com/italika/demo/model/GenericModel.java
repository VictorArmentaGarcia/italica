package com.italika.demo.model;

import lombok.Data;

/**
 * The Class GenericModel.
 */
@Data
public class GenericModel {

	/**
	 * Instantiates a new generic model.
	 */
	public GenericModel() {}
	
	/**
	 * Instantiates a new generic model.
	 *
	 * @param codigo the codigo
	 * @param descripcion the descripcion
	 * @param obj the obj
	 */
	public GenericModel(int codigo, String descripcion, Object obj) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setObject(obj);
	}
	
	/** The codigo. */
	private int codigo;

	/** The descripcion. */
	private String descripcion;
	
	/** The object. */
	private Object object;
	
}
