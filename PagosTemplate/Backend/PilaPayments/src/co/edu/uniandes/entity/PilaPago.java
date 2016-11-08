package co.edu.uniandes.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import co.edu.uniandes.staticmodel.ConceptoPago;
import co.edu.uniandes.staticmodel.EstadoPago;

/**
 * Entity que representa un pago de aportes
 * @author jorge perea
 */
@Entity
public class PilaPago {
	
	/**
	 * id del pago
	 */
	private Long id;
	
	/**
	 * valor del pago
	 */
	private Long valor;
	
	/**
	 * Concepto del pago
	 */
	private ConceptoPago concepto;
	
	/**
	 * fecha del pago
	 */
	private Date fecha;
	
	/**
	 * Entidad a la cual se le realizo el pago
	 */
	private PilaEntity pilaEntity;
	
	/**
	 * Super entidad que ha realizado el pago
	 */
	private PilaSuperEntity superEntity;
	
	/**
	 * estado del pago
	 */
	private EstadoPago estado;
	
	/**
	 * Constructor
	 */
	public PilaPago() {
		
	}
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the pilaEntity
	 */
	@ManyToOne
	@JoinColumn(name="pilaEntity_id")
	public PilaEntity getPilaEntity() {
		return pilaEntity;
	}

	/**
	 * @param pilaEntity the pilaEntity to set
	 */
	public void setPilaEntity(PilaEntity pilaEntity) {
		this.pilaEntity = pilaEntity;
	}

	/**
	 * @return the valor
	 */
	public Long getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Long valor) {
		this.valor = valor;
	}

	/**
	 * @return the concepto
	 */
	@Enumerated(EnumType.STRING)
	public ConceptoPago getConcepto() {
		return concepto;
	}

	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(ConceptoPago concepto) {
		this.concepto = concepto;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the estado
	 */
	@Enumerated(EnumType.STRING)
	public EstadoPago getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoPago estado) {
		this.estado = estado;
	}

	/**
	 * @return the superEntity
	 */
	@ManyToOne
	@JoinColumn(name="pilaSuperEntity_id")
	public PilaSuperEntity getSuperEntity() {
		return superEntity;
	}

	/**
	 * @param superEntity the superEntity to set
	 */
	public void setSuperEntity(PilaSuperEntity superEntity) {
		this.superEntity = superEntity;
	}
}
