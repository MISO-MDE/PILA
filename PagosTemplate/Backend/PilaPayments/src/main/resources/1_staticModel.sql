
    --Estos son los datos de los parametros
    --ActividadEconomica
    insert into ActividadEconomica (id, codigo, descripcion) values(1,'8022','Establecimientos de educación media');
	insert into ActividadEconomica (id, codigo, descripcion) values(2,'8513','Empresas dedicadas a practicas de odontologia');
	insert into ActividadEconomica (id, codigo, descripcion) values(3,'0117','Empresas dedicadas a la producción especializada de frutas, nueces, plantas bebestibles, y especias. Incluye el tostado y beneficio del cacao');
	insert into ActividadEconomica (id, codigo, descripcion) values(4,'1541','Empresa dedicada a la elaboracion de productos de molineria, de almidones,productos derivados del almidon y alimentos preparados para animales. Incluye el tostado de semillas y granos');
	insert into ActividadEconomica (id, codigo, descripcion) values(5,'1592','Empresa dedicada a la elaboracion de bebidas fermentadas no destiladas');
	insert into ActividadEconomica (id, codigo, descripcion) values(6,'1743','Empresa dedicada a la fabricación de cuerdas, cordeles, cables, bramantes y redes');
	insert into ActividadEconomica (id, codigo, descripcion) values(7,'2101', 'Empresa dedicada a la fabricación de papel, carton, y productos de papel y carton');
	insert into ActividadEconomica (id, codigo, descripcion) values(8,'2322', 'Empresa dedicada a la fabricación de productos derivados del petroleo, fuera de refineria como asfalto');
	insert into ActividadEconomica (id, codigo, descripcion) values(9,'1431', 'Extraccion de esmeraldas');
	insert into ActividadEconomica (id, codigo, descripcion) values(10,'2321','Fabricacion de productos de la refinación del petroleo, elaborados en refineria');

    --TipoPension
	insert into TipoPension (id, codigo, descripcion) values(1,'01','Vejez');
	insert into TipoPension (id, codigo, descripcion) values(2,'02','Sobrevivencia vitalicia riesgo comun');
	insert into TipoPension (id, codigo, descripcion) values(3,'03','Sobrevivencia temporal riesgo comun');
	insert into TipoPension (id, codigo, descripcion) values(4,'04','Sobrevivencia temporal riesgo comun, Conyugue o compañera(o) menor de 30 años sin hijos');
	insert into TipoPension (id, codigo, descripcion) values(5,'05','Sobrevivencia vitalicia por riesgo laboral');
	insert into TipoPension (id, codigo, descripcion) values(6,'06','Sobrevivencia temporal por riesgo laboral');
	insert into TipoPension (id, codigo, descripcion) values(7,'07','Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos');
	insert into TipoPension (id, codigo, descripcion) values(8,'08','Invalidez riesgo común');
	insert into TipoPension (id, codigo, descripcion) values(9,'09','Invalidez resgo laboral');
	insert into TipoPension (id, codigo, descripcion) values(10,'10','Jubilacion');
	insert into TipoPension (id, codigo, descripcion) values(11,'11','Jubilacion para compartir');
	insert into TipoPension (id, codigo, descripcion) values(12,'12','Sanción');
	insert into TipoPension (id, codigo, descripcion) values(13,'13','Convencional');
	insert into TipoPension (id, codigo, descripcion) values(14,'14','Convencional para compartir');
	insert into TipoPension (id, codigo, descripcion) values(15,'15','Gracia');
	insert into TipoPension (id, codigo, descripcion) values(16,'16','Por convenio internacional');
	insert into TipoPension (id, codigo, descripcion) values(17,'17','Sentencia Judicial');
	insert into TipoPension (id, codigo, descripcion) values(18,'18','Conciliaciones');


    --TipoPensionado
    insert into TipoPensionado (id, codigo, descripcion) values(1,'01','Pensionado de régimen de prima media. Tope máximo de pensión 25 smlmv');
	insert into TipoPensionado (id, codigo, descripcion) values(2,'02','Pensionado de régimen de prima media. Sin tope máximo de pensión');
	insert into TipoPensionado (id, codigo, descripcion) values(3,'03','Pensionado de régimen de ahorro individual. No aplica tope máximo de pensión');
	insert into TipoPensionado (id, codigo, descripcion) values(4,'04','Pensionado de riesgos laborales. Tope máximo de 25 smlmv');
	insert into TipoPensionado (id, codigo, descripcion) values(5,'05','Pensionado por el empleador. Con tope maximo de pension de 25 smlmv');
	insert into TipoPensionado (id, codigo, descripcion) values(6,'06','Pensionado por el empleador sin tope máximo de pensión');
	insert into TipoPensionado (id, codigo, descripcion) values(7,'07','Pensionado de entidades de los regimenes especial y de excepción, con tope máximo de pensión de 25 smlmv');
	insert into TipoPensionado (id, codigo, descripcion) values(8,'08','Pensionado de entidades de los regimenes especial y de excepción, sin tope máximo de pensión');
	insert into TipoPensionado (id, codigo, descripcion) values(9,'09','Beneficiario UPC adicional');

    --Riesgo
	insert into Riesgo (id, claseRiesgo) values(1,1);
	insert into Riesgo (id, claseRiesgo) values(2,2);
	insert into Riesgo (id, claseRiesgo) values(3,3);
	insert into Riesgo (id, claseRiesgo) values(4,4);
	insert into Riesgo (id, claseRiesgo) values(5,5);

	--TipoPagador
	insert into TipoPagador (id, codigo, descripcion) values(1,'01','Empleador');
	insert into TipoPagador (id, codigo, descripcion) values(2,'02','Administración de pensiones');
	insert into TipoPagador (id, codigo, descripcion) values(3,'03','Pagador de pensiones');
	insert into TipoPagador (id, codigo, descripcion) values(4,'04','Pensiones de entidades de los regimenes especial y de excepción');

    commit;

	select count(*) from ActividadEconomica;
	select count(*) from TipoPension;
	select count(*) from TipoPensionado;
	select count(*) from TipoPagador;


