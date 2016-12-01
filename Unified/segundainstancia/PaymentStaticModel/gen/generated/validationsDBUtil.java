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

	       //Inserts tabla  Tipo Pensionado;			    
			
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(1,'1','Pensionado de régimen de prima media. Tope máximo de pensión 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(2,'2','Pensionado de régimen de prima media. Sin tope máximo de pensión')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(3,'3','Pensionado de régimen de ahorro individual. No aplica tope máximo de pensión')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(4,'4','Pensionado de riesgos laborales. Tope máximo de 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(5,'5','Pensionado por el empleador. Con tope maximo de pension de 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(6,'6','Pensionado por el empleador sin tope máximo de pensión')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(7,'7','Pensionado de entidades de los regimenes especial y de excepción, con tope máximo de pensión de 25 smlmv')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(8,'8','Pensionado de entidades de los regimenes especial y de excepción, sin tope máximo de pensión')");	
			st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(9,'9','Beneficiario UPC adicional')");	
	       //Inserts tabla  Tipo Pagador;			    
			
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(1,'1','Empleador')");	
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(2,'2','Administración de pensiones')");	
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(3,'3','Pagador de pensiones')");	
			st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(4,'4','Pensiones de entidades de los regimenes especial y de excepción')");	
	       //Inserts tabla  Tipo Pension;			    
			
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(1,'1','Vejez')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(2,'2','Sobrevivencia vitalicia riesgo comun')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(3,'3','Sobrevivencia temporal riesgo comun')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(4,'4','Sobrevivencia temporal riesgo comun, Conyugue o compañera(o) menor de 30 años sin hijos')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(5,'5','Sobrevivencia vitalicia por riesgo laboral')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(6,'6','Sobrevivencia temporal por riesgo laboral')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(7,'7','Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(8,'8','Invalidez riesgo común')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(9,'9','Invalidez resgo laboral')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(10,'10','Jubilacion')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(11,'11','Jubilacion para compartir')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(12,'12','Sanción')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(13,'13','Convencional')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(14,'14','Convencional para compartir')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(15,'15','Gracia')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(16,'16','Por convenio internacional')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(17,'17','Sentencia Judicial')");	
			st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(18,'18','Conciliaciones')");	

            st.executeUpdate("commit");
            //Relations           
 
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 1  --  id: 1       				       		
       		 * Pensionado de régimen de prima media. Tope máximo de pensión 25 smlmv   --   Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(1,1,1)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 1  --  id: 2       				       		
       		 * Pensionado de régimen de prima media. Tope máximo de pensión 25 smlmv   --   Administración de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(2,1,2)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 1  --  id: 3       				       		
       		 * Pensionado de régimen de prima media. Tope máximo de pensión 25 smlmv   --   Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(3,1,3)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 2  --  id: 2       				       		
       		 * Pensionado de régimen de prima media. Sin tope máximo de pensión   --   Administración de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(4,2,2)");
			      					      		
       		/**  
       		 * TipoPensionado vs TipoPagador
       		 * id: 2  --  id: 3       				       		
       		 * Pensionado de régimen de prima media. Sin tope máximo de pensión   --   Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(5,2,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 2       				       		
       		 * Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos   --   Administración de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pensionado_id, pagador_id) values(1,7,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 1       				       		
       		 * Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos   --   Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pensionado_id, pagador_id) values(2,7,1)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 3       				       		
       		 * Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos   --   Pagador de pensiones	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pensionado_id, pagador_id) values(3,7,3)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 7  --  id: 4       				       		
       		 * Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos   --   Pensiones de entidades de los regimenes especial y de excepción	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pensionado_id, pagador_id) values(4,7,4)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPensionado
       		 * id: 7  --  id: 2       				       		
       		 * Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos   --   Pensionado de régimen de prima media. Sin tope máximo de pensión	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpensionado (id, pensionado_id, pagador_id) values(1,7,2)");
			      					      		
       		/**  
       		 * TipoPension vs TipoPagador
       		 * id: 18  --  id: 1       				       		
       		 * Conciliaciones   --   Empleador	
       		 */			       				       		
	       	 st.executeUpdate("insert into validacionpensionpagador (id, pensionado_id, pagador_id) values(5,18,1)");
            

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

