insert into pilasuperentity
values(1, 900539845, 'ESTABLECIMIENTO_EDUCACION_MEDIA', 'Oracle');


insert into pilauser
values (1, 'peter@oracle.com', null, 1123, 'Peter');

insert into pilausersuperentity
values (1, 1);

insert into pilaentity
values (1, 'ESTABLECIMIENTO_EDUCACION_MEDIA', 'Gomez',79132132, 'Jorge', 12, 12, 17000000, 'VEJEZ', 'BENEFICIARIO_UPC_ADICIONAL', null );

insert into pilaentity
values (2, 'ESTABLECIMIENTO_EDUCACION_MEDIA', 'Gomez',72000000, 'Jorge', 12, 12, 17000000, 'VEJEZ', 'BENEFICIARIO_UPC_ADICIONAL', null );





commit;



select * from pilasuperentity;

select * from pilauser;


select * from pilausersuperentity;

select * from pilaentity;



select pilaentity0_.id as 
id1_1_, pilaentity0_.actividad as 
activida2_1_, pilaentity0_.apellido as 
apellido3_1_, pilaentity0_.cedula as 
cedula4_1_, pilaentity0_.nombre as nombre5_1_, pilaentity0_.pais as pais6_1_, pilaentity0_.paisGrupoFamiliar as 
paisGrup7_1_, pilaentity0_.salario as salario8_1_, pilaentity0_.pilaSuperEntity_id as pilaSup11_1_, pilaentity0_.tipoPension as 
tipoPens9_1_, pilaentity0_.tipoPensionado as tipoPen10_1_ from PilaEntity pilaentity0_ 
where pilaentity0_.cedula=79132132


select *
from PilaEntity pilaentity0_ where pilaentity0_.cedula=?
2016-11-09 18:24:09 [http-nio-8080-exec-5]


Tabla Tipo Pension
Codigo integer
Desc

Tabla Tipo Pensionado
Codigo integer
Desc

Tabla Tipo Pagador
Codigo integer
Desc

Tabla 8
id
Codigo de Tabla Tipo Pension
Codigo de Tabla Tipo Pensionado

Tabla 6
id
Codigo de Tabla Tipo Pension
Codigo de Tabla Tipo Pagador

Tabla 3
id
Codigo de Tabla Tipo Pensionado
Codigo de Tabla Tipo Pagador

insert into tabla3
(1, 1, 1)

insert into tabla3
(2, 1, 2)

insert into tabla3
(3, 1, 3)

insert into tabla3
(4, 2, 2)

insert into tabla3
(5, 2, 3)

insert into tabla3
(6, 2, 3)


Entonces las validaciones son asi

Select * from tabla3 
where Tipo Pensionado=1 and
Tipo Pagador=04

Si el query regresa nulo entonces creamos un error tipo: A

Hacemos el query para las tablas 3, 6, 8










