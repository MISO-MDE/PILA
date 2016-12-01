/* Inserta Usuario principal Intermediario */
insert into userpayments
(user_id, email, password, userid, username, rol)
values (1, 'pagos@deuna.com', null, 'M00UYKY5EReZlnhzsHeEWG0Mhpn1', 'PagosAdmin', 'Intermediary');

/* Inserta Interseccion */
insert into userintermediary
values (1);
commit;