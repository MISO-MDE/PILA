insert into pilasuperentity
values(1, 900539845, 'ESTABLECIMIENTO_EDUCACION_MEDIA', 'Oracle');


insert into pilauser
values (1, 'peter@oracle.com', 1123, 'Peter');

insert into pilausersuperentity
values (1, 1);

insert into pilaentity
values (1, 'ESTABLECIMIENTO_EDUCACION_MEDIA', 'Gomez',79132132, 'Jorge', 12, 12, 17000000, 'VEJEZ', 'BENEFICIARIO_UPC_ADICIONAL', null );




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