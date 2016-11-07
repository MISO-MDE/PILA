package co.edu.uniandes.entity;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import co.edu.uniandes.staticmodel.ActividadEconomica;

/**
 * Clasificacion del riesgo para una entidad
 * @author jorge perea
 */
@Entity
public class PilaRisk {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/**
	 * Codigo del riesgo
	 */
	private int claseRiesgo;
	
	/**
	 * Valor inicial para el calculo
	 */
	private double valorInicial;
	
	/**
	 * Actividades economicas asociadas al riesgo
	 */
	private Set<ActividadEconomica> actividadesEconomicas;
	
	/**
	 * Constructor
	 */
	public PilaRisk() {
		
	}
	
	/**
	 * @return the id
	 */
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
	 * @return the claseRiesgo
	 */
	public int getClaseRiesgo() {
		return claseRiesgo;
	}

	/**
	 * @param claseRiesgo the claseRiesgo to set
	 */
	public void setClaseRiesgo(int claseRiesgo) {
		this.claseRiesgo = claseRiesgo;
	}

	/**
	 * @return the valorInicial
	 */
	public double getValorInicial() {
		return valorInicial;
	}

	/**
	 * @param valorInicial the valorInicial to set
	 */
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	/**
	 * @return the actividadesEconomicas
	 */
	@ElementCollection
	@Enumerated(EnumType.STRING)
	public Set<ActividadEconomica> getActividadesEconomicas() {
		return actividadesEconomicas;
	}

	/**
	 * @param actividadesEconomicas the actividadesEconomicas to set
	 */
	public void setActividadesEconomicas(Set<ActividadEconomica> actividadesEconomicas) {
		this.actividadesEconomicas = actividadesEconomicas;
	}
}
