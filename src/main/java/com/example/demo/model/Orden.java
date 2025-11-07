package com.example.demo.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fecahcreacion;
	private Double total;

	@ManyToOne
	private Usuario usuario;

	@OneToMany(mappedBy = "orden")
	private List<DetalleOrden> detalles;

	public Orden() {

	}

	public Orden(Integer id, String numero, Date fecahcreacion, Double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fecahcreacion = fecahcreacion;
		this.total = total;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFecahcreacion() {
		return fecahcreacion;
	}

	public void setFecahcreacion(Date fecahcreacion) {
		this.fecahcreacion = fecahcreacion;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<DetalleOrden> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleOrden> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fecahcreacion=" + fecahcreacion + ", total=" + total + "]";
	}

}
