    --ActividadEconomica
    insert into ActividadEconomica (codigo, descripcion) values('8022','Establecimientos de educaci�n media');
	insert into ActividadEconomica (codigo, descripcion) values('8513','Empresas dedicadas a practicas de odontologia');
	insert into ActividadEconomica (codigo, descripcion) values('0117','Empresas dedicadas a la producci�n especializada de frutas, nueces, plantas bebestibles, y especias. Incluye el tostado y beneficio del cacao');
	insert into ActividadEconomica (codigo, descripcion) values('1541','Empresa dedicada a la elaboracion de productos de molineria, de almidones,productos derivados del almidon y alimentos preparados para animales. Incluye el tostado de semillas y granos');
	insert into ActividadEconomica (codigo, descripcion) values('1592','Empresa dedicada a la elaboracion de bebidas fermentadas no destiladas');
	insert into ActividadEconomica (codigo, descripcion) values('1743','Empresa dedicada a la fabricaci�n de cuerdas, cordeles, cables, bramantes y redes');
	insert into ActividadEconomica (codigo, descripcion) values('2101', 'Empresa dedicada a la fabricaci�n de papel, carton, y productos de papel y carton');
	insert into ActividadEconomica (codigo, descripcion) values('2322', 'Empresa dedicada a la fabricaci�n de productos derivados del petroleo, fuera de refineria como asfalto');
	insert into ActividadEconomica (codigo, descripcion) values('1431', 'Extraccion de esmeraldas');
	insert into ActividadEconomica (codigo, descripcion) values('2321','Fabricacion de productos de la refinaci�n del petroleo, elaborados en refineria');

    --TipoPension
	insert into TipoPension (description) values('Vejez');
	insert into TipoPension (description) values('Sobrevivencia vitalicia riesgo comun');
	insert into TipoPension (description) values('Sobrevivencia temporal riesgo comun');
	insert into TipoPension (description) values('Sobrevivencia temporal riesgo comun, Conyugue o compañera(o) menor de 30 años sin hijos');
	insert into TipoPension (description) values('Sobrevivencia vitalicia por riesgo laboral');
	insert into TipoPension (description) values('Sobrevivencia temporal por riesgo laboral');
	insert into TipoPension (description) values('Sobrevivencia temporal por riesgo laboral, Conyugue o compañera(o) menor de 30 años sin hijos');
	insert into TipoPension (description) values('Invalidez riesgo común');
	insert into TipoPension (description) values('Invalidez resgo laboral');
	insert into TipoPension (description) values('Jubilacion');
	insert into TipoPension (description) values('Jubilacion para compartir');
	insert into TipoPension (description) values('Sanción');
	insert into TipoPension (description) values('Convencional');
	insert into TipoPension (description) values('Convencional para compartir');
	insert into TipoPension (description) values('Gracia');
	insert into TipoPension (description) values('Por convenio internacional');
	insert into TipoPension (description) values('Sentencia Judicial');
	insert into TipoPension (description) values('Conciliaciones');


    --TipoPensionado
    insert into TipoPensionado (description) values('Pensionado de régimen de prima media. Tope máximo de pensión 25 smlmv');
	insert into TipoPensionado (description) values('Pensionado de régimen de prima media. Sin tope máximo de pensión');
	insert into TipoPensionado (description) values('Pensionado de régimen de ahorro individual. No aplica tope máximo de pensión');
	insert into TipoPensionado (description) values('Pensionado de riesgos laborales. Tope máximo de 25 smlmv');
	insert into TipoPensionado (description) values('Pensionado de régimen de ahorro individual. No aplica tope máximo de pensión');
	insert into TipoPensionado (description) values('Pensionado de entidades de los regimenes especial y de excepción, con tope máximo de pensión de 25 smlmv');
	insert into TipoPensionado (description) values('Pensionado de entidades de los regimenes especial y de excepción, sin tope máximo de pensión');
	insert into TipoPensionado (description) values('Beneficiario UPC adicional');

    --TipoNovedad
	insert into TipoNovedad (description) values('Traslado');
	insert into TipoNovedad (description) values('Variación transitoria del salario');
	insert into TipoNovedad (description) values('Suspension temporal, licencia no remunerada o comosión de servicios');
	insert into TipoNovedad (description) values('Incapacidad temporal por enfermedad');
	insert into TipoNovedad (description) values('Licencia de maternidad o paternidad');
	insert into TipoNovedad (description) values('Vacaciones');
	insert into TipoNovedad (description) values('Licencia remunerada');
	insert into TipoNovedad (description) values('Aporte voluntario a pensiones');
	insert into TipoNovedad (description) values('Suspension');

