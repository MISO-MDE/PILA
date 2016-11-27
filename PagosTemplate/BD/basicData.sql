/* Inserta Usuario principal Intermediario */
insert into userpayments
(user_id, email, password, userid, username, rol)
values (1, 'pagos@deuna.com', null, 'M00UYKY5EReZlnhzsHeEWG0Mhpn1', 'PagosAdmin', 'Intermediary');

/* Inserta Interseccion */
insert into userintermediary
values (1);



insert into superentity
values(1, 900539845, 'ESTABLECIMIENTO_EDUCACION_MEDIA',6, 1);

insert into userpayments
(user_id, email, password, userid, username, rol)
values (2, 'a@a.com', null, 'gZb2YS9yafhbPDKzTrW5MkGl92b2', 'Ivan', 'Intermediary');


insert into usersuperentity
values (1, 1);

commit;

select * from superentity;
select * from userpayments;
select * from usersuperentity;
select * from userintermediary i join userpayments u on i.intermediary_id= u.user_id