package co.edu.uniandes.staticmodel;

/**
 * Enum con los valores para el tipo de pensionado
 * @author jorge perea
 */
public enum TipoPensionado {
	REGIMEN_PRIMA_MEDIA("Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv"),
	REGIMEN_PRIMA_MEDIA_SIN_TOPE("Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n"),
	REGIMEN_AHORRO_INDIVIDUAL("Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n"),
	RIESGOS_LABORALES("Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv"),
	PENSIONADO_EMPLEADOR("Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n"),
	ENTIDADES_REGIMEN_ESPECIAL("Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de "
			+ "25 smlmv"),
	ENTIDADES_REGIMEN_ESPECIAL_SIN_TOPE("Pensionado de entidades de los regimenes especial y de excepci�n, "
			+ " sin tope m�ximo de pensi�n"),
	BENEFICIARIO_UPC_ADICIONAL("Beneficiario UPC adicional");
	
	private final String text;

    /**
     * @param text
     */
    TipoPensionado(final String text) {
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
