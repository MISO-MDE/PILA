package co.edu.uniandes.db;
import java.sql.*;
import java.util.Properties;
public class DBUtil {
/**
  Plantilla para hacer la insersion de datos
**/
	 public static void main (String[] args) { 
        try {
            String url = "jdbc:postgresql://localhost:5432/pila?useUnicode=true&characterEncoding=UTF-8";
            Connection conn; //= DriverManager.getConnection(url,"postgres","root");

            Properties props = new Properties();
            props.setProperty("user","postgres");
            props.setProperty("password","root");
            conn = DriverManager.getConnection(url, props);

            Statement st = conn.createStatement();
            st.executeUpdate("insert into userpayments (user_id, email, password, userid, username, rol) values (1, 'pagos@deuna.com', null, 'M00UYKY5EReZlnhzsHeEWG0Mhpn1', 'PagosAdmin', 'Intermediary')");
            st.executeUpdate("insert into userintermediary values (1)");

            //Estos son los datos de los parametros
            //ActividadEconomica
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(1,'8022','Establecimientos de educación media')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(2,'8513','Empresas dedicadas a practicas de odontologia')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(3,'0117','Empresas dedicadas a la producción especializada de frutas, nueces, plantas bebestibles, y especias. Incluye el tostado y beneficio del cacao')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(4,'1541','Empresa dedicada a la elaboracion de productos de molineria, de almidones,productos derivados del almidon y alimentos preparados para animales. Incluye el tostado de semillas y granos')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(5,'1592','Empresa dedicada a la elaboracion de bebidas fermentadas no destiladas')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(6,'1743','Empresa dedicada a la fabricación de cuerdas, cordeles, cables, bramantes y redes')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(7,'2101', 'Empresa dedicada a la fabricación de papel, carton, y productos de papel y carton')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(8,'2322', 'Empresa dedicada a la fabricación de productos derivados del petroleo, fuera de refineria como asfalto')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(9,'1431', 'Extraccion de esmeraldas')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(10,'2321','Fabricacion de productos de la refinación del petroleo, elaborados en refineria')");


            //Inserts de riesgo
            st.executeUpdate("insert into Riesgo (id, claseRiesgo) values(1,1)");
            st.executeUpdate("insert into Riesgo (id, claseRiesgo) values(1,2)");
            st.executeUpdate("insert into Riesgo (id, claseRiesgo) values(1,3)");
            st.executeUpdate("insert into Riesgo (id, claseRiesgo) values(1,4)");
            st.executeUpdate("insert into Riesgo (id, claseRiesgo) values(1,5)");

	       //Inserts tabla  Tipo Pensionado;			    
			
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(1,'1','T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(2,'2','T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(3,'3','T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(4,'4','T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(5,'5','T5 Pensionado por el empleador. Con tope maximo de pension de 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(6,'6','T5 Pensionado por el empleador sin tope m�ximo de pensi�n')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(7,'7','T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(8,'8','T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(9,'9','T5 Beneficiario UPC adicional')");	
	       //Inserts tabla  Tipo Pagador;			    
			
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(1,'1','T4 Empleador')");	
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(2,'2','T4 Administraci�n de pensiones')");	
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(3,'3','T4 Pagador de pensiones')");	
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(4,'4','T4 Pensiones de entidades de los regimenes especial y de excepci�n')");	
	       //Inserts tabla  Tipo Pension;			    
			
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(1,'1','T7 Vejez')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(2,'2','T7 Sobrevivencia vitalicia riesgo comun')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(3,'3','T7 Sobrevivencia temporal riesgo comun')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(4,'4','T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(5,'5','T7 Sobrevivencia vitalicia por riesgo laboral')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(6,'6','T7 Sobrevivencia temporal por riesgo laboral')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(7,'7','T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(8,'8','T7 Invalidez riesgo com�n')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(9,'9','T7 Invalidez resgo laboral')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(10,'10','T7 Jubilacion')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(11,'11','T7 Jubilacion para compartir')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(12,'12','T7 Sanci�n')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(13,'13','T7 Convencional')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(14,'14','T7 Convencional para compartir')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(15,'15','T7 Gracia')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(16,'16','T7 Por convenio internacional')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(17,'17','T7 Sentencia Judicial')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(18,'18','T7 Conciliaciones')");	

            st.executeUpdate("commit");
            //Relations           
 
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 1  --  id: 1       				       		
       		 * T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(1,1,1)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 1  --  id: 2       				       		
       		 * T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(2,1,2)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 1  --  id: 3       				       		
       		 * T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(3,1,3)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 2  --  id: 2       				       		
       		 * T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(4,2,2)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 2  --  id: 3       				       		
       		 * T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(5,2,3)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 3  --  id: 2       				       		
       		 * T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(6,3,2)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 4  --  id: 3       				       		
       		 * T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(7,4,3)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 5  --  id: 1       				       		
       		 * T5 Pensionado por el empleador. Con tope maximo de pension de 25 smlmv   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(8,5,1)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 6  --  id: 1       				       		
       		 * T5 Pensionado por el empleador sin tope m�ximo de pensi�n   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(9,6,1)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 7  --  id: 4       				       		
       		 * T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(10,7,4)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 8  --  id: 4       				       		
       		 * T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(11,8,4)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 9  --  id: 1       				       		
       		 * T5 Beneficiario UPC adicional   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(12,9,1)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 9  --  id: 2       				       		
       		 * T5 Beneficiario UPC adicional   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(13,9,2)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 9  --  id: 3       				       		
       		 * T5 Beneficiario UPC adicional   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(14,9,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 1  --  id: 1       				       		
       		 * T7 Vejez   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(1,1,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 1  --  id: 3       				       		
       		 * T7 Vejez   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(2,1,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 1  --  id: 9       				       		
       		 * T7 Vejez   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(1,1,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 1  --  id: 7       				       		
       		 * T7 Vejez   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(2,1,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 1  --  id: 8       				       		
       		 * T7 Vejez   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(3,1,8)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 2  --  id: 2       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(3,2,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 2  --  id: 1       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(4,2,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 2  --  id: 3       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(5,2,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 2  --  id: 4       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(6,2,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 2  --  id: 9       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(4,2,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 2  --  id: 7       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(5,2,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 2  --  id: 8       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(6,2,8)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 2  --  id: 2       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(7,2,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 2  --  id: 1       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(8,2,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 2  --  id: 4       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(9,2,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 2  --  id: 6       				       		
       		 * T7 Sobrevivencia vitalicia riesgo comun   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(10,2,6)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 3  --  id: 2       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(7,3,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 3  --  id: 1       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(8,3,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 3  --  id: 3       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(9,3,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 3  --  id: 4       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(10,3,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 3  --  id: 9       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(11,3,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 3  --  id: 7       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(12,3,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 3  --  id: 8       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(13,3,8)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 3  --  id: 2       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(14,3,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 3  --  id: 1       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(15,3,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 3  --  id: 4       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(16,3,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 3  --  id: 6       				       		
       		 * T7 Sobrevivencia temporal riesgo comun   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(17,3,6)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 4  --  id: 2       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(11,4,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 4  --  id: 1       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(12,4,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 4  --  id: 3       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(13,4,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 4  --  id: 4       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(14,4,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 4  --  id: 9       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(18,4,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 4  --  id: 7       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(19,4,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 4  --  id: 8       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(20,4,8)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 4  --  id: 2       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(21,4,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 4  --  id: 1       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(22,4,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 4  --  id: 4       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(23,4,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 4  --  id: 6       				       		
       		 * T7 Sobrevivencia temporal riesgo comun, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(24,4,6)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 5  --  id: 3       				       		
       		 * T7 Sobrevivencia vitalicia por riesgo laboral   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(15,5,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 5  --  id: 3       				       		
       		 * T7 Sobrevivencia vitalicia por riesgo laboral   --   T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(25,5,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 5  --  id: 2       				       		
       		 * T7 Sobrevivencia vitalicia por riesgo laboral   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(26,5,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 5  --  id: 1       				       		
       		 * T7 Sobrevivencia vitalicia por riesgo laboral   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(27,5,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 6  --  id: 3       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(16,6,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 6  --  id: 3       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral   --   T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(28,6,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 6  --  id: 2       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(29,6,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 6  --  id: 1       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(30,6,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 2       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(17,7,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 1       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(18,7,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 3       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(19,7,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 4       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(20,7,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 7  --  id: 3       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(31,7,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 7  --  id: 2       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(32,7,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 7  --  id: 1       				       		
       		 * T7 Sobrevivencia temporal por riesgo laboral, Conyugue o compa�era(o) menor de 30 a�os sin hijos   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(33,7,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 8  --  id: 3       				       		
       		 * T7 Invalidez riesgo com�n   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(21,8,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 8  --  id: 9       				       		
       		 * T7 Invalidez riesgo com�n   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(34,8,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 8  --  id: 7       				       		
       		 * T7 Invalidez riesgo com�n   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(35,8,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 8  --  id: 8       				       		
       		 * T7 Invalidez riesgo com�n   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(36,8,8)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 8  --  id: 2       				       		
       		 * T7 Invalidez riesgo com�n   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(37,8,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 8  --  id: 1       				       		
       		 * T7 Invalidez riesgo com�n   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(38,8,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 8  --  id: 4       				       		
       		 * T7 Invalidez riesgo com�n   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(39,8,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 8  --  id: 6       				       		
       		 * T7 Invalidez riesgo com�n   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(40,8,6)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 9  --  id: 2       				       		
       		 * T7 Invalidez resgo laboral   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(22,9,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 9  --  id: 1       				       		
       		 * T7 Invalidez resgo laboral   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(23,9,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 9  --  id: 3       				       		
       		 * T7 Invalidez resgo laboral   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(24,9,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 9  --  id: 4       				       		
       		 * T7 Invalidez resgo laboral   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(25,9,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 9  --  id: 3       				       		
       		 * T7 Invalidez resgo laboral   --   T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(41,9,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 10  --  id: 2       				       		
       		 * T7 Jubilacion   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(26,10,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 10  --  id: 3       				       		
       		 * T7 Jubilacion   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(27,10,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 10  --  id: 4       				       		
       		 * T7 Jubilacion   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(28,10,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 10  --  id: 2       				       		
       		 * T7 Jubilacion   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(42,10,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 10  --  id: 1       				       		
       		 * T7 Jubilacion   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(43,10,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 10  --  id: 4       				       		
       		 * T7 Jubilacion   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(44,10,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 10  --  id: 6       				       		
       		 * T7 Jubilacion   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(45,10,6)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 11  --  id: 2       				       		
       		 * T7 Jubilacion para compartir   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(29,11,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 11  --  id: 3       				       		
       		 * T7 Jubilacion para compartir   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(30,11,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 11  --  id: 9       				       		
       		 * T7 Jubilacion para compartir   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(46,11,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 11  --  id: 7       				       		
       		 * T7 Jubilacion para compartir   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(47,11,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 11  --  id: 2       				       		
       		 * T7 Jubilacion para compartir   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(48,11,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 11  --  id: 1       				       		
       		 * T7 Jubilacion para compartir   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(49,11,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 11  --  id: 4       				       		
       		 * T7 Jubilacion para compartir   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(50,11,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 11  --  id: 6       				       		
       		 * T7 Jubilacion para compartir   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(51,11,6)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 12  --  id: 2       				       		
       		 * T7 Sanci�n   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(31,12,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 12  --  id: 2       				       		
       		 * T7 Sanci�n   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(52,12,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 12  --  id: 1       				       		
       		 * T7 Sanci�n   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(53,12,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 13  --  id: 2       				       		
       		 * T7 Convencional   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(32,13,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 13  --  id: 3       				       		
       		 * T7 Convencional   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(33,13,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 13  --  id: 2       				       		
       		 * T7 Convencional   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(54,13,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 13  --  id: 1       				       		
       		 * T7 Convencional   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(55,13,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 14  --  id: 2       				       		
       		 * T7 Convencional para compartir   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(34,14,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 14  --  id: 3       				       		
       		 * T7 Convencional para compartir   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(35,14,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 14  --  id: 9       				       		
       		 * T7 Convencional para compartir   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(56,14,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 14  --  id: 7       				       		
       		 * T7 Convencional para compartir   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(57,14,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 14  --  id: 2       				       		
       		 * T7 Convencional para compartir   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(58,14,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 14  --  id: 1       				       		
       		 * T7 Convencional para compartir   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(59,14,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 15  --  id: 3       				       		
       		 * T7 Gracia   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(36,15,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 15  --  id: 9       				       		
       		 * T7 Gracia   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(60,15,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 15  --  id: 7       				       		
       		 * T7 Gracia   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(61,15,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 16  --  id: 1       				       		
       		 * T7 Por convenio internacional   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(37,16,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 16  --  id: 9       				       		
       		 * T7 Por convenio internacional   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(62,16,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 17  --  id: 2       				       		
       		 * T7 Sentencia Judicial   --   T4 Administraci�n de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(38,17,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 17  --  id: 1       				       		
       		 * T7 Sentencia Judicial   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(39,17,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 17  --  id: 3       				       		
       		 * T7 Sentencia Judicial   --   T4 Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(40,17,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 17  --  id: 4       				       		
       		 * T7 Sentencia Judicial   --   T4 Pensiones de entidades de los regimenes especial y de excepci�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(41,17,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 9       				       		
       		 * T7 Sentencia Judicial   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(63,17,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 7       				       		
       		 * T7 Sentencia Judicial   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(64,17,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 8       				       		
       		 * T7 Sentencia Judicial   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(65,17,8)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 3       				       		
       		 * T7 Sentencia Judicial   --   T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(66,17,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 2       				       		
       		 * T7 Sentencia Judicial   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(67,17,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 1       				       		
       		 * T7 Sentencia Judicial   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(68,17,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 4       				       		
       		 * T7 Sentencia Judicial   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(69,17,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 17  --  id: 6       				       		
       		 * T7 Sentencia Judicial   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(70,17,6)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 18  --  id: 1       				       		
       		 * T7 Conciliaciones   --   T4 Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(42,18,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 18  --  id: 9       				       		
       		 * T7 Conciliaciones   --   T5 Beneficiario UPC adicional	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(71,18,9)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 18  --  id: 7       				       		
       		 * T7 Conciliaciones   --   T5 Pensionado de entidades de los regimenes especial y de excepci�n, con tope m�ximo de pensi�n de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(72,18,7)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 18  --  id: 3       				       		
       		 * T7 Conciliaciones   --   T5 Pensionado de r�gimen de ahorro individual. No aplica tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(73,18,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 18  --  id: 2       				       		
       		 * T7 Conciliaciones   --   T5 Pensionado de r�gimen de prima media. Sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(74,18,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 18  --  id: 1       				       		
       		 * T7 Conciliaciones   --   T5 Pensionado de r�gimen de prima media. Tope m�ximo de pensi�n 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(75,18,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 18  --  id: 4       				       		
       		 * T7 Conciliaciones   --   T5 Pensionado de riesgos laborales. Tope m�ximo de 25 smlmv	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(76,18,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 18  --  id: 6       				       		
       		 * T7 Conciliaciones   --   T5 Pensionado por el empleador sin tope m�ximo de pensi�n	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(77,18,6)");
            

    System.out.println("Insersion finalizada");
    st.executeUpdate("commit");

	            conn.close(); 
	        } catch (Exception e) { 
	            System.err.println("Got an exception! "); 
	            System.err.println(e.getMessage()); 
	            System.err.println(e.getCause()); 
	        } 
	  
	    }

}

