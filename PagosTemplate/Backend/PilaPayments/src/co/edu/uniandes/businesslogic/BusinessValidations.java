package co.edu.uniandes.businesslogic;

import java.util.ArrayList;

import co.edu.uniandes.entity.PilaEntity;
import co.edu.uniandes.entity.Validacion;

public class BusinessValidations {
	
	private PilaEntity entity;
	
	private ValidacionLogic logic;
	
	public BusinessValidations(PilaEntity entity, ValidacionLogic logic) {
		this.entity = entity;
		this.logic = logic;
	}
	
	public String validations() {

		String errorCondition = "";
		ArrayList validaciones = new ArrayList<Validacion>();

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
			
			Validacion validacion1 = new Validacion();
			validacion1.setName("Tipo Pension vs Tipo Pensionado inconsistente");
			validacion1.getValues().add(tipoPension);
			validacion1.getValues().add(tipoPensionado);
			
			error1 =	"{" +    
								"\"" + "Validacion\":" + "\"Tipo Pension vs Tipo Pensionado inconsistente\"," +
								"\"" + "valor1\":" + "\""+ tipoPension +"\"," +
								"\"" + "valor2\":" + "\""+ tipoPensionado +"\"" +
							"}";
			validaciones.add(validacion1);
		}
		
		if(logic.validarPensionadoPagador(tipoPensionado, tipoPagador) == null) {
			
			Validacion validacion2 = new Validacion();
			validacion2.setName("Tipo Pension vs Tipo Pensionado inconsistente");
			validacion2.getValues().add(tipoPension);
			validacion2.getValues().add(tipoPensionado);
			error2 = "{" + 
					"\"" + "Validacion\":" + "\"Tipo Pensionado vs Tipo Pagador inconsistente\"," +
					"\"" + "valor1\":" + "\"Vejez\"," +
					"\"" + "valor2\":" + "\"Empleador\"" +
				"}";
			validaciones.add(validacion2);
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
		
		System.out.println(validaciones.size());
		
		return errorCondition;
	}
}
