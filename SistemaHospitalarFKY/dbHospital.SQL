create database dbHospital;

use dbHospital;

Create table enfermeiro(
id integer not null,
nome varchar(68) not null,
constraint PK_enfermeiro primary key (id));

create table medico (
id integer not null,
nome varchar(68) not null,
especialidade varchar(68) not null,
constraint PK_medico primary key (id));

create table pessoa (
id integer not null,
nome varchar(68) not null,
cpf varchar(68) not null,
idade varchar(68) not null,
tipoSanguineo varchar(68) not null,
sexo varchar(68) not null,
statusDePessoa varchar(68) not null,
constraint PK_pessoa primary key (id));

create table paciente (
id integer not null,
nome varchar(68) not null,
constraint PK_paciente primary key (id));

create table Atendente (
id integer not null,
nome varchar(68) not null,
constraint PK_atendente primary key (id));

create table Atendimento (
id integer not null,
comentarioEnfermeiro varchar(68) not null,
comentarioEnfermeiro varchar(68) not null,
comentarioMedico varchar(68) not null,
peso integer not null,
altura integer not null,
data date not null,
doenca integer not null,
constraint PK_atendimento primary key (id));

insert into Atendente(id,nome) values
(1, 'Jose'),
(2, 'Paulo'),
(3, 'Silvia');

insert into Atendente(id,nome) values
(1, 'Jose'),
(2, 'Paulo'),
(3, 'Silvia');

insert into Enfermeiro(id,nome) values
(1, 'Joao'),
(2, 'Marcos'),
(3, 'Silvio');

insert into Medico(id, nome, especialidade) values
(1, 'Paulo' , 'Clinico'),
(2, 'Diego' , 'Ortopedista'),
(3, 'Walter' , 'Cardiologista');

insert into pessoa(id,nome) values
(1, 'Sergio'),
(2, 'Luis'),
(3, 'Carlos');

insert into paciente(id,nome) values
(1, 'Fernando'),
(2, 'Ricardo'),
(3, 'Erico');



