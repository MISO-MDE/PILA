package co.edu.uniandes.staticmodel;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Tipo de novedades
 * @author jorge perea
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoNovedad {
	
	TRASLADO("Traslado"),
	VARIACION_TRANSITORIA_SALARIO("Variación transitoria del salario"),
	SLN("Suspension temporal, licencia no remunerada o comosión de servicios"),
	INCAPACIDAD_ENFERMEDAD("Incapacidad temporal por enfermedad"),
	LICENCIA_MATERNIDAD_PATERNIDAD("Licencia de maternidad o paternidad"),
	VACACIONES("Vacaciones"),
	LICENCIA_REMUNERADA("Licencia remunerada"),
	APORTE_VOLUNTARIO("Aporte voluntario a pensiones"),
	SUSPENSION("Suspension");
	
	private final String text;

    /**
     * @param text
     */
    TipoNovedad(final String text) {
        this.text = text;
    }

    /**
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
    
  //devuelve el texto del enum
    public String getName() {
    	return this.text;
    }
    
    static public TipoNovedad getEnumbyDesc(String desc)
    {
        for(TipoNovedad act : TipoNovedad.values())
        {
            if(act.getName().equals(desc)) {
            	return act;
            }
        }
        return null;
    }
    
}
