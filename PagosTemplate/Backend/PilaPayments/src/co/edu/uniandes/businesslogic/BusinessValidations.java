package co.edu.uniandes.businesslogic;

import co.edu.uniandes.entity.PilaEntity;

public class BusinessValidations {
	
	private PilaEntity entity;
	
	private ValidacionLogic logic;
	
	public BusinessValidations(PilaEntity entity, ValidacionLogic logic) {
		this.entity = entity;
		this.logic = logic;
	}
	
	public String validations() {

		String errorCondition = "";

		String tipoPension = entity.getTipoPension().toString();
		String tipoPensionado = entity.getTipoPensionado().toString();
		String tipoPagador = "";
		
		String error1 = "";
		String error2 = "";
		
		String header =  "," +
				"\"" + "errorCondition\":" + //Si las validacines no pasan entonces se crea esta seccion
				"[";
		
		String footer = "]";
		
		String retorno = "";
		if(logic.validarPensionPensionado(tipoPension, tipoPensionado) == null) {
			error1 =	"{" +    
								"\"" + "Validacion\":" + "\"Tipo Pension vs Tipo Pensionado inconsistente\"," +
								"\"" + "valor1\":" + "\""+ tipoPension +"\"," +
								"\"" + "valor2\":" + "\""+ tipoPensionado +"\"" +
							"}";
		}
		
		if(logic.validarPensionadoPagador(tipoPensionado, tipoPagador) == null) {
			error2 = "{" + 
					"\"" + "Validacion\":" + "\"Tipo Pensionado vs Tipo Pagador inconsistente\"," +
					"\"" + "valor1\":" + "\"Vejez\"," +
					"\"" + "valor2\":" + "\"Empleador\"" +
				"}";
		}
		
//		if(!error1.isEmpty() || !error2.isEmpty()) {
//			
//			retorno = header + (error1.isEmpty()) ? + ","
//		}

		/*"," +
		"\"" + "errorCondition\":" + //Si las validacines no pasan entonces se crea esta seccion
			"[" + 
					"{" +    
						"\"" + "Validacion\":" + "\"Tipo Pension vs Tipo Pensionado inconsistente\"," +
						"\"" + "valor1\":" + "\"Vejez\"," +
						"\"" + "valor2\":" + "\"Pension Voluntaria\"" +
					"}," + 
					"{" + 
						"\"" + "Validacion\":" + "\"Tipo Pension vs Tipo Pagador inconsistente\"," +
						"\"" + "valor1\":" + "\"Vejez\"," +
						"\"" + "valor2\":" + "\"Empleador\"" +
					"}" +
			"]" +
		 */
		return errorCondition;
	}
}
