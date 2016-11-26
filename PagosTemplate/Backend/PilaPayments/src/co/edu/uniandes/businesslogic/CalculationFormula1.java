package co.edu.uniandes.businesslogic;

import co.edu.uniandes.dao.EntityDAO;
import co.edu.uniandes.dao.RiesgoDAOImpl;
import co.edu.uniandes.entity.PilaEntity;

public class CalculationFormula1 {
	
	private long entityId;
	PilaEntity entity;
	
	
	private short novedadesMes = 0;
	private short diasLaborables = 0;
	private String tipoNovedad = "";
	
	public CalculationFormula1(PilaEntity entity) {
		this.entity = entity;
		processNovedadesSinProcesar();
	}
	
	public long getEntityId() {
		return entityId;
	}
	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}
	
	public double getFormula1() {
		double impuesto = 0.12;
		if (entity.getPaisGrupoFamiliar() != 12 && entity.getPais() != 12)
			return 0;
		else 
			return this.entity.getSalario() * impuesto;
	}
	
	public double getFormula2() {
		double pensionNormal = 0.16;
		int riesgoLaboral = 0; 
		
		riesgoLaboral = getRiegoTabla2(entity.getSuperEntidad().getActividad().getId());
		//Calculo por labor
		if (riesgoLaboral == 4 && riesgoLaboral == 5) 
			return this.entity.getSalario() * 0.26;
		else
		if (entity.getProfesion().equals("Congresista")) 	
			return this.entity.getSalario() * 0.255;
		else
			if (entity.getProfesion().equals("CTI")) 	
				return this.entity.getSalario() * 0.35;
			else
				if (entity.getProfesion().equals("Aviador")) 	
					return this.entity.getSalario() * 0.21;
		//Novedades
		if (novedadesMes == 0)
			return this.entity.getSalario() * pensionNormal;
		else 
			if (diasLaborables >=3 && diasLaborables < 20 && tipoNovedad.equals("SLN"))
				return this.entity.getSalario() * 0.12;
			else
				return 0;
	}
	
	public double getFormula3() {
		int riesgoLaboral = 0;
		riesgoLaboral = getRiegoTabla2(entity.getSuperEntidad().getActividad().getId());
		
		double calculo = 0;
		
		double RiesgoI = 0.522/100; 
		double RiesgoII = 1.044/100;
		double RiesgoIII = 2.436/100;
		double RiesgoIV = 4.350/100;
		double RiesgoV = 6.960/100;
		
		if (riesgoLaboral == 1)
		{
			calculo = this.entity.getSalario() * RiesgoI;
		}
		if (riesgoLaboral == 2) 
		{
			calculo = this.entity.getSalario() * RiesgoII;
		}	
		if (riesgoLaboral == 3) 
		{
			calculo = this.entity.getSalario() * RiesgoIII;
		}	
		if (riesgoLaboral == 4) 
		{
			calculo = this.entity.getSalario() * RiesgoIV;
		}
		if (riesgoLaboral == 5) 
		{
			calculo = this.entity.getSalario() * RiesgoV;
		}
		return calculo;
	}
	
	//DesarrollarRiesgo tabla 2
	private int getRiegoTabla2(Long activity) {
		
		return RiesgoLogic.getRiesgoLogic().findByActividadEconomica(activity).getClaseRiesgo();

	}
	
	void processNovedadesSinProcesar() {
		//Contar los dias habiles de todas las novedades en estado no procesado que son de tipo SLN
		this.tipoNovedad = "SLN";
		this.diasLaborables = 0; //La suma de los dias habiles de las novedades sin procesar tipo SLN
		this.novedadesMes = 0; // Numero de novedades SLN sin procesar
		
	}
	
}
