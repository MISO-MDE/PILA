package co.edu.uniandes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ValidacionPensionPensionado {
	
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * tipo de pension
	 */
	private PilaTipoPension tipoPension;
	
	/**
	 * tipo pensionado
	 */
	private PilaTipoPensionado tipoPensionado;
	
	/**
	 * Constructor
	 */
	public ValidacionPensionPensionado() {
		
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	 * @return the tipoPension
	 */
	@OneToOne
	@JoinColumn(name="pension_id")
	public PilaTipoPension getTipoPension() {
		return tipoPension;
	}

	/**
	 * @param tipoPension the tipoPension to set
	 */
	public void setTipoPension(PilaTipoPension tipoPension) {
		this.tipoPension = tipoPension;
	}

	/**
	 * @return the tipoPensionado
	 */
	@OneToOne
	@JoinColumn(name="pensionado_id")
	public PilaTipoPensionado getTipoPensionado() {
		return tipoPensionado;
	}

	/**
	 * @param tipoPensionado the tipoPensionado to set
	 */
	public void setTipoPensionado(PilaTipoPensionado tipoPensionado) {
		this.tipoPensionado = tipoPensionado;
	}
}
