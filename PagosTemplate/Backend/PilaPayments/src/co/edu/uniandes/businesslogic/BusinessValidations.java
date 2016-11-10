package co.edu.uniandes.businesslogic;

import co.edu.uniandes.entity.PilaEntity;

public class BusinessValidations {
	
	PilaEntity entity;
	
	public BusinessValidations(PilaEntity entity) {
		this.entity = entity;
		
	}
	
	public String validations() {
		String errorCondition = "";
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
