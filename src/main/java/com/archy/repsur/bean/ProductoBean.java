package com.archy.repsur.bean;

import java.io.Serializable;
import java.util.List;

public class ProductoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idProducto;
	private String idCategoria;
	private String idSubCategoria;
	private String nombre;
	private String descripcion;
	private String estado;
//	private String fechaCreacion;
//	private String fechaModificacion;
//	private String usuarioCreacion;
//	private String usuarioModificacion;
	private String precio;
	private String precioAntes;
	private String nombreImagen;
	private String presentaciones;
	private String oferta;
	private String marca;
	
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getIdSubCategoria() {
		return idSubCategoria;
	}
	public void setIdSubCategoria(String idSubCategoria) {
		this.idSubCategoria = idSubCategoria;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getPrecioAntes() {
		return precioAntes;
	}
	public void setPrecioAntes(String precioAntes) {
		this.precioAntes = precioAntes;
	}
	public String getNombreImagen() {
		return nombreImagen;
	}
	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}
	public String getPresentaciones() {
		return presentaciones;
	}
	public void setPresentaciones(String presentaciones) {
		this.presentaciones = presentaciones;
	}
	public String isOferta() {
		return oferta;
	}
	public void setOferta(String oferta) {
		this.oferta = oferta;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getOferta() {
		return oferta;
	}
	
}
