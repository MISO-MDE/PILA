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
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(1,'8022','Establecimientos de educaci贸n media')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(2,'8513','Empresas dedicadas a practicas de odontologia')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(3,'0117','Empresas dedicadas a la producci贸n especializada de frutas, nueces, plantas bebestibles, y especias. Incluye el tostado y beneficio del cacao')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(4,'1541','Empresa dedicada a la elaboracion de productos de molineria, de almidones,productos derivados del almidon y alimentos preparados para animales. Incluye el tostado de semillas y granos')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(5,'1592','Empresa dedicada a la elaboracion de bebidas fermentadas no destiladas')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(6,'1743','Empresa dedicada a la fabricaci贸n de cuerdas, cordeles, cables, bramantes y redes')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(7,'2101', 'Empresa dedicada a la fabricaci贸n de papel, carton, y productos de papel y carton')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(8,'2322', 'Empresa dedicada a la fabricaci贸n de productos derivados del petroleo, fuera de refineria como asfalto')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(9,'1431', 'Extraccion de esmeraldas')");
            st.executeUpdate("insert into ActividadEconomica (id, codigo, descripcion) values(10,'2321','Fabricacion de productos de la refinaci贸n del petroleo, elaborados en refineria')");

	        
			//Inserts tabla  Tipo Pensionado;
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(1,'1','Pensionado de r間imen de prima media. Tope m醲imo de pensi髇 25 smlmv");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(2,'2','Pensionado de r間imen de prima media. Sin tope m醲imo de pensi髇");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(3,'3','Pensionado de r間imen de ahorro individual. No aplica tope m醲imo de pensi髇");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(4,'4','Pensionado de riesgos laborales. Tope m醲imo de 25 smlmv");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(5,'5','Pensionado por el empleador. Con tope maximo de pension de 25 smlmv");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(6,'6','Pensionado por el empleador sin tope m醲imo de pensi髇");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(7,'7','Pensionado de entidades de los regimenes especial y de excepci髇, con tope m醲imo de pensi髇 de 25 smlmv");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(8,'8','Pensionado de entidades de los regimenes especial y de excepci髇, sin tope m醲imo de pensi髇");		
					st.executeUpdate("insert into TipoPensionado (id, codigo, descripcion) values(9,'9','Beneficiario UPC adicional");		
		
			//Inserts tabla  Tipo Pagador;
					st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(1,'1','Empleador");		
					st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(2,'2','Administraci髇 de pensiones");		
					st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(3,'3','Pagador de pensiones");		
					st.executeUpdate("insert into TipoPagador (id, codigo, descripcion) values(4,'4','Pensiones de entidades de los regimenes especial y de excepci髇");		
		
			//Inserts tabla  Tipo Pension;
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(1,'1','Vejez");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(2,'2','Sobrevivencia vitalicia riesgo comun");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(3,'3','Sobrevivencia temporal riesgo comun");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(4,'4','Sobrevivencia temporal riesgo comun, Conyugue o compa馿ra(o) menor de 30 a駉s sin hijos");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(5,'5','Sobrevivencia vitalicia por riesgo laboral");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(6,'6','Sobrevivencia temporal por riesgo laboral");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(7,'7','Sobrevivencia temporal por riesgo laboral, Conyugue o compa馿ra(o) menor de 30 a駉s sin hijos");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(8,'8','Invalidez riesgo com鷑");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(9,'9','Invalidez resgo laboral");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(10,'10','Jubilacion");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(11,'11','Jubilacion para compartir");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(12,'12','Sanci髇");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(13,'13','Convencional");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(14,'14','Convencional para compartir");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(15,'15','Gracia");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(16,'16','Por convenio internacional");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(17,'17','Sentencia Judicial");		
					st.executeUpdate("insert into TipoPension (id, codigo, descripcion) values(18,'18','Conciliaciones");		
		


            st.executeUpdate("commit");
            
			//Relations Tipo Pensionado;
			       		TipoPensionado--TipoPagador --- 1--1 --Pensionado de r間imen de prima media. Tope m醲imo de pensi髇 25 smlmv--Empleador
				
			       		TipoPensionado--TipoPagador --- 1--2 --Pensionado de r間imen de prima media. Tope m醲imo de pensi髇 25 smlmv--Administraci髇 de pensiones
				
			       		TipoPensionado--TipoPagador --- 1--3 --Pensionado de r間imen de prima media. Tope m醲imo de pensi髇 25 smlmv--Pagador de pensiones
				
				
			       		TipoPensionado--TipoPagador --- 2--1 --Pensionado de r間imen de prima media. Sin tope m醲imo de pensi髇--Administraci髇 de pensiones
				
			       		TipoPensionado--TipoPagador --- 2--2 --Pensionado de r間imen de prima media. Sin tope m醲imo de pensi髇--Pagador de pensiones
				
				
				
				
				
				
				
				
				
		
			//Relations Tipo Pagador;
				
				
				
				
		
			//Relations Tipo Pension;
				
				
				
				
				
				
			       		TipoPension--TipoPagador --- 7--1 --Sobrevivencia temporal por riesgo laboral, Conyugue o compa馿ra(o) menor de 30 a駉s sin hijos--Administraci髇 de pensiones
				
			       		TipoPension--TipoPagador --- 7--2 --Sobrevivencia temporal por riesgo laboral, Conyugue o compa馿ra(o) menor de 30 a駉s sin hijos--Empleador
				
			       		TipoPension--TipoPagador --- 7--3 --Sobrevivencia temporal por riesgo laboral, Conyugue o compa馿ra(o) menor de 30 a駉s sin hijos--Pagador de pensiones
				
			       		TipoPension--TipoPagador --- 7--4 --Sobrevivencia temporal por riesgo laboral, Conyugue o compa馿ra(o) menor de 30 a駉s sin hijos--Pensiones de entidades de los regimenes especial y de excepci髇
				
				
				
				
				
				
				
				
				
				
				
				
				
		


            //Este archivo se debe autogenerar con el modelo   de las validaciones
            //validacionpensionadopagador
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(1,1,1)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(2,1,2)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(3,1,3)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(4,2,2)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(5,2,3)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(6,3,2)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(7,4,3)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(8,5,1)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(9,6,1)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(10,7,4)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(11,8,4)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(12,9,1)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(13,9,2)");
            st.executeUpdate("insert into validacionpensionadopagador (id, pensionado_id, pagador_id) values(14,9,3)");

            //validacionpensionpagador,
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(1,1,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(2,1,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(3,2,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(4,2,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(5,2,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(6,2,4)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(7,3,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(8,3,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(9,3,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(10,3,4)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(11,4,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(12,4,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(13,4,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(14,4,4)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(15,5,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(16,6,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(17,7,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(18,8,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(19,8,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(20,8,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(21,8,4)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(22,9,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(23,10,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(24,10,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(25,10,4)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(26,11,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(27,11,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(28,12,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(29,13,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(30,13,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(31,14,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(32,14,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(33,15,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(34,16,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(35,17,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(36,17,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(37,17,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(38,17,4)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(39,18,1)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(40,18,2)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(41,18,3)");
            st.executeUpdate("insert into validacionpensionpagador (id, pension_id, pagador_id) values(42,18,4)");

            //validacionpensionpensionado
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(1,1,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(2,1,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(3,1,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(4,2,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(5,2,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(6,2,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(7,2,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(8,2,5)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(9,2,6)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(10,2,7)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(11,3,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(12,3,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(13,3,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(14,3,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(15,3,5)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(16,3,6)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(17,3,7)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(18,4,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(19,4,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(20,4,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(21,4,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(22,4,5)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(23,4,6)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(24,4,7)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(25,4,8)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(26,5,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(27,5,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(28,5,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(29,6,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(30,6,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(31,6,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(32,7,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(33,7,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(34,7,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(35,8,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(36,8,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(37,8,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(38,8,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(39,8,5)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(40,8,6)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(41,8,7)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(42,8,8)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(43,9,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(44,10,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(45,10,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(46,10,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(47,10,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(48,11,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(49,11,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(50,11,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(51,11,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(52,11,5)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(53,11,6)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(54,11,7)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(55,11,8)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(56,12,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(57,12,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(58,13,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(59,13,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(60,14,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(61,14,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(62,14,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(63,14,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(64,15,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(65,15,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(66,16,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(67,17,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(68,17,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(69,17,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(70,17,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(71,17,5)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(72,17,6)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(73,17,7)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(74,17,8)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(75,18,1)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(76,18,2)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(77,18,3)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(78,18,4)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(79,18,5)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(80,18,6)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(81,18,7)");
            st.executeUpdate("insert into validacionpensionpensionado (id, pension_id, pensionado_id) values(82,18,8)");

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

