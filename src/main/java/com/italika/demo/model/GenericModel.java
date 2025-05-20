package com.italika.demo.model;

import lombok.Data;

@Data
public class GenericModel {

	public GenericModel() {}
	
	public GenericModel(int codigo, String descripcion, Object obj) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setObject(obj);
	}
	
	private int codigo;

	private String descripcion;
	
	private Object object;
	
}
