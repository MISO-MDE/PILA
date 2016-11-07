package co.edu.uniandes.staticmodel;

/**
 * Actividad economica
 * @author jorge perea
 */
public enum ActividadEconomica {
	
	ESTABLECIMIENTO_EDUCACION_MEDIA("8022","Establecimientos de educaci�n media"),
	EMPRESA_ODONTOLOGIA("8513","Empresas dedicadas a practicas de odontologia"),
	EMPRESA_FRUTAS_BEBESTIBLES("0117","Empresas dedicadas a la producci�n especializada de frutas "
			+ ", nueces, plantas bebestibles, y especias. Incluye el tostado y beneficio del cacao"),
	EMPRESA_PRODUCTOS_ALMIDON_ANIMALES("1541","Empresa dedicada a la elaboracion de productos de molineria, de almidones, "
			+ "productos derivados del almidon y alimentos preparados para animales. Incluye el tostado de semillas y granos"),
	EMPRESA_BEBIDA_FERMENTADA("1592","Empresa dedicada a la elaboracion de bebidas fermentadas no destiladas"),
	EMPRESA_CUERDAS("1743","Empresa dedicada a la fabricaci�n de cuerdas, cordeles, cables, bramantes y redes"),
	EMPRESA_PAPEL("2101", "Empresa dedicada a la fabricaci�n de papel, carton, y productos de papel y carton"),
	EMPRESA_DERIVADOS_PETROLEO("2322", "Empresa dedicada a la fabricaci�n de productos derivados del petroleo, fuera de"
			+ " refineria como asfalto"),
	EMPRESA_ESMERALDAS("1431", "Extraccion de esmeraldas"),
	EMPRESA_PETROLEO_REFINERIA("2321","Fabricacion de productos de la refinaci�n del petroleo, elaborados en refineria");
	
	/**
	 * codigo ciu de la actividad economica
	 */
	private final String ciu;
	
	/**
	 * descripcion de la actividad
	 */
	private final String descripcion;
    
	/**
     * @param text
     */
    ActividadEconomica(String ciu, String descripcion) {
        this.ciu = ciu;
        this.descripcion= descripcion;
    }

    /**
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return ciu + " - " + descripcion;
    }
    
}
