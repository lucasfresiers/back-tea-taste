--liquibase formatted sql

--changeset lucas:1
create table t_user (
  id serial primary key,
  username varchar(255),
  nom varchar(255),
  prenom varchar(255),
  mail varchar(255),
  password varchar(255)
);

insert into t_user (username, nom, prenom, mail, password)
	values ('admin', 'fresiers', 'lucas', 'fresiers.lucas@gmail.com', 'admin');