package co.edu.uniandes.businesslogic;

import java.util.List;

import co.edu.uniandes.entity.Novedad;
import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.staticmodel.EstadoNovedad;
import co.edu.uniandes.staticmodel.TipoNovedad;

public class CalculationFormula {
	
	private long entityId;
	
	PilaEntity entity;
	
	public CalculationFormula(PilaEntity entity) {
		this.entity = entity;
	}
	
	public long getEntityId() {
		return entityId;
	}
	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}
	public double calculateEPS {
		double impuesto=0.12;
		int pais=entity.getPais();
		int grupoFamiliar=entity.getGrupofamiliar();
		double salario=entity.getSalario();
				
		if (pais !=12 &&grupoFamiliar !=12){
		
			return 0;
		}
		else {
	
			return salario*impuesto;
		}
	}
	public double calculatePension {
		List<Novedad> novedades = EventLogic.getEventLogic().findByEntityTipo(entityId, TipoNovedad.SLN);
		processNovedadesSinProcesar(novedades);
		double pensionNormal=0.16;
		int riesgoLaboral=0;
		String TipoNovedad=novedades.getTipoNovedad();
		int diasLaborables= 20-DiasNovedad;
		double salario=entity.getSalario();
		String profesion=entity.getProfesion();
		String novedadAbierta=novedades.size();
		riesgoLaboral = getRiegoTabla2(entity.getSuperEntidad().getActividad().getId());
				
		if (riesgoLaboral ==4 ||riesgoLaboral ==5){
		
			return salario*0.26;
		}
		else {
				
		if (profesion.equals("Congresista")){
		
			return salario*0.255;
		}
		else {
				
		if (profesion.equals("CTI")){
		
			return salario*0.35;
		}
		else {
				
		if (profesion.equals("Aviador")){
		
			return salario*0.21;
		}
		}
		}
		}
				
		if (novedadAbierta ==0){
		
			return salario*pensionNormal;
		}
		else {
				
		if (diasLaborables >=7 &&diasLaborables <=20){
		
			return salario*pensionNormal;
		}
		else {
				
		if (diasLaborables >=3 &&diasLaborables <7){
		
			return salario*0.12;
		}
		else {
	
			return 0;
		}
		}
		}
	}
	public double calculateRiesgosLaborales {
		double RiesgoI=0.522/100;
		double RiesgoII=1.044/100;
		double RiesgoIII=2.436/100;
		double RiesgoIV=4.350/100;
		double RiesgoV=6.960/100;
			riesgoLaboral = getRiegoTabla2(entity.getSuperEntidad().getActividad().getId());
				
		if (RiesgoLaboral ==1){
		
			return salario*RiesgoI;
		}
				
		if (RiesgoLaboral ==2){
		
			return salario*RiesgoII;
		}
				
		if (RiesgoLaboral ==3){
		
			return salario*RiesgoIII;
		}
				
		if (RiesgoLaboral ==4){
		
			return salario*RiesgoIV;
		}
				
		if (RiesgoLaboral ==5){
		
			return salario*RiesgoV;
		}
	}
	public double getTotal {
	
			return   					ePS+					pension+					riesgosLaborales;
	}

	
}


