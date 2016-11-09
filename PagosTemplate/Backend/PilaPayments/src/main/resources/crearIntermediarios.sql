insert into pilasuperentity
values(1, 900539845, 'ESTABLECIMIENTO_EDUCACION_MEDIA', 'Oracle');


insert into pilauser
values (1, 'peter@oracle.com', 1123, 'Peter');

insert into pilausersuperentity
values (1, 1);

commit;


select * from pilasuperentity;

select * from pilauser;


select * from pilausersuperentity;