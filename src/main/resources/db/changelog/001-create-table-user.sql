--liquibase formatted sql

--changeset lucas:1

CREATE SEQUENCE t_user_seq START 1;

create table t_user (
  id serial primary key,
  username varchar(255),
  nom varchar(255),
  prenom varchar(255),
  mail varchar(255),
  password varchar(255)
);

insert into t_user
	values (nextval('t_user_seq'), 'admin', 'fresiers', 'lucas', 'fresiers.lucas@gmail.com', 'admin');