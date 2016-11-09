package co.edu.uniandes.staticmodel;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Tipo de pension
 * @author jorge perea
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoPension {

	VEJEZ("Vejez"), 
	SOBREVIVENCIA_VITALICIA_RIESGO_COMUN("Sobrevivencia vitalicia riesgo comun"),
	SOBREVIVENCIA_TEMPORAL_RIESGO_COMUN("Sobrevivencia temporal riesgo comun"),
	SOBREVIVENCIA_TEMPORAL_RIESGO_COMUN_CONYUGUE("Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 "
			+ "a�os sin hijos"),
	SOBREVIVENCIA_VITALICIA_RIESGO_LABORAL("Sobrevivencia vitalicia por riesgo laboral"),
	SOBREVIVENCIA_TEMPORAL_RIESGO_LABORAL("Sobrevivencia temporal por riesgo laboral"),
	SOBREVIVENCIA_TEMPORAL_RIESGO_LABORAL_CONYUGUE("Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 "
			+ "a�os sin hijos"),
	INVALIDEZ_RIESGO_COMUN("Invalidez riesgo com�n"),
	INVALIDEZ_RIESGO_LABORAL("Invalidez resgo laboral"),
	JUBILACION("Jubilacion"),
	JUBILACION_COMPARTIR("Jubilacion para compartir"),
	SANCION("Sanci�n"),
	CONVENCIONAL("Convencional"),
	CONVENCIONAL_COMPARTIR("Convencional para compartir"),
	GRACIA("Gracia"),
	CONVENIO_INTERNACIONAL("Por convenio internacional"),
	SENTENCIA_JUDICIAL("Sentencia Judicial"),
	CONCILIACIONES("Conciliaciones");
	
	private final String text;

    /**
     * @param text
     */
    TipoPension(final String text) {
        this.text = text;
    }

    /**
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
