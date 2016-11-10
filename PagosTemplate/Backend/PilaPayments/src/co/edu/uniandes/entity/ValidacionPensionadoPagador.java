package co.edu.uniandes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ValidacionPensionadoPagador {
	
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * tipo de pension
	 */
	private PilaTipoPensionado tipoPensionado;
	
	/**
	 * tipo pensionado
	 */
	private PilaTipoPagador tipoPagador;
	
	/**
	 * Constructor
	 */
	public ValidacionPensionadoPagador() {
		
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

	/**
	 * @return the tipoPagador
	 */
	@OneToOne
	@JoinColumn(name="pagador_id")
	public PilaTipoPagador getTipoPagador() {
		return tipoPagador;
	}

	/**
	 * @param tipoPagador the tipoPagador to set
	 */
	public void setTipoPagador(PilaTipoPagador tipoPagador) {
		this.tipoPagador = tipoPagador;
	}
}
