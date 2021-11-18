create table dispatcher (id bigint generated by default as identity, address varchar(255), name varchar(255), primary key (id))
create table receiver (id bigint generated by default as identity, address varchar(255), name varchar(255), primary key (id))
create table shipment (id bigint generated by default as identity, completed boolean not null, distance integer not null, dispatcher_id bigint, receiver_id bigint, primary key (id))
create table user (id bigint generated by default as identity, cpf varchar(255), email varchar(255), name varchar(255), password varchar(255), phone varchar(255), primary key (id))

insert into dispatcher values (1, '829 Homenick Shores Apt. 582', 'Márcio Pedro Henrique Melo')
insert into receiver values (1, '555 Treutel Meadows Apt. 443', 'Benedito Samuel Sérgio Barros')
insert into shipment values (1, false, 7, 1, 1)

insert into dispatcher values (2, '555 Treutel Meadows Apt. 443', 'Alana Luciana Novaes')
insert into receiver values (2, '81550 Kessler Manor Suite 925', 'Anderson Manuel Baptista')
insert into shipment values (2, false, 3, 2, 2)

insert into dispatcher values (3, '644 Willow Road Apt. 420', 'Miguel Geraldo Brito')
insert into receiver values (3, '0950 Walsh Mill Apt. 053', 'Mariah Tânia Novaes')
insert into shipment values (3, false, 16, 3, 3)