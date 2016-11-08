package co.edu.uniandes.to;

import java.util.Date;

import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.PilaSuperEntity;
import co.edu.uniandes.staticmodel.EstadoNovedad;
import co.edu.uniandes.staticmodel.TipoNovedad;

/**
 * To para la novedad
 * @author Rafa
 */

public class PilaNovedadTO {
	
	/**
	 * id de la novedad
	 */
	private Long id;
	
	/**
	 * Fecha de creacion de la novedad
	 */
	private Date fechaCreacion;
	
	/**
	 * Fecha de inicio de la novedad
	 */
	private Date fechaInicio;
	
	/**
	 * Fecha de fin de la novedad
	 */
	private Date fechaFin;
	
	/**
	 * Variacion del salario
	 */
	private Long variacionSalario;
	
	/**
	 * tipo de novedad
	 */
	private TipoNovedad tipoNovedad;
	
	/**
	 * estado de novedad
	 */
	private EstadoNovedad estado;
	
	/**
	 * entity al cual se le aplica la novedad
	 */
	private PilaEntity entity;
	
	/**
	 * Super entity que crea la novedad
	 */
	private PilaSuperEntity superEntity;
	
	/**
	 * Constructor
	 */
	public PilaNovedadTO() {
		
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	/**
	 * @return the tipoNovedad
	 */
	public TipoNovedad getTipoNovedad() {
		return tipoNovedad;
	}

	/**
	 * @param tipoNovedad the tipoNovedad to set
	 */
	public void setTipoNovedad(TipoNovedad tipoNovedad) {
		this.tipoNovedad = tipoNovedad;
	}

	/**
	 * @return the variacionSalario
	 */
	public Long getVariacionSalario() {
		return variacionSalario;
	}

	/**
	 * @param variacionSalario the variacionSalario to set
	 */
	public void setVariacionSalario(Long variacionSalario) {
		this.variacionSalario = variacionSalario;
	}

	/**
	 * @return the estado
	 */
	public EstadoNovedad getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoNovedad estado) {
		this.estado = estado;
	}

	/**
	 * @return the entity
	 */
	public PilaEntity getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(PilaEntity entity) {
		this.entity = entity;
	}

	/**
	 * @return the superEntity
	 */
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
