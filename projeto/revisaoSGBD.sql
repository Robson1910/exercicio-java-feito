create database revisao;
use revisao; 

create table aluno(
	codMatricula int IDENTITY(1,1) primary key,
	turma_idturma int,
	dataMatricula date,
	nome varchar(45),
	endereco text,
	telefone int,
	dataNascimento date,
	altura float,
	peso int);

create table turma(
	idturma int IDENTITY(1,1) primary key,
	horario time,
	duracao int,
	dataInicio date,
	dataFim date,
	atividade_idatividade int,
	instrutor_idinstrutor int);

create table atividade(
	idatividade int IDENTITY(1,1) primary key,
	nome varchar(100));

create table instrutor(
	idinstrutor int IDENTITY(1,1) primary key,
	RG int,
	nome varchar(45),
	nascimento date,
	titulacao int);

create table telefone_instrutor(
	idtelefone int IDENTITY(1,1) primary key,
	numero int,
	tipo varchar(45),
	instrutor_idinstrutor int);

create table chamada(
	idchamada int IDENTITY(1,1) primary key,
	data date,
	presente bit,
	matricula_aluno_codMatricula int,
	matricula_turma_idturma int);

create table matricula(
	aluno_codMatricula int,
	turma_idturma int,
	constraint PK_Matricula PRIMARY KEY (aluno_codMatricula, turma_idturma));

ALTER TABLE telefone_instrutor
ADD CONSTRAINT fk_idinstrutor
FOREIGN KEY (instrutor_idinstrutor)
REFERENCES instrutor(idinstrutor);

ALTER TABLE turma
add constraint fk_idatividade
foreign key (atividade_idatividade)
references atividade(idatividade);

ALTER TABLE turma
ADD CONSTRAINT fk_idinstrutor_turma
FOREIGN KEY (instrutor_idinstrutor)
REFERENCES instrutor(idinstrutor);

alter table matricula
add constraint fk_codmatricula
foreign key (aluno_codMatricula)
references aluno(codMatricula);

alter table matricula
add constraint fk_idturma
foreign key (turma_idturma)
references turma(idturma);

alter table chamada
add constraint fk_chamada
foreign key (matricula_aluno_codMatricula,matricula_turma_idturma)
references matricula(aluno_codMatricula,turma_idturma);

insert into atividade (nome)
values
('Muscula��o'),
('Dan�a'),
('Pilates'),
('Ioga'),
('K2');

insert into aluno (turma_idturma,dataMatricula,nome,endereco,telefone,dataNascimento,altura,peso) 
values
(1, '2000-01-01', 'Joao de Carvalho', 'endereco', 38383838, '1986-02-25',1.76,60),
(1, '2000-01-01', 'Pedro Paulo', 'endereco', 38383838, '1990-01-25',1.76,110),
(2, '2000-01-01', 'Emanuel Joaquim', 'endereco', 38383838, '2000-02-25',1.76,60),
(2, '2000-01-01', 'Santigo Assis', 'endereco', 38383838, '1980-12-25',1.76,60),
(3, '2000-01-01', 'Sheila Lopes', 'endereco', 38383838, '1986-01-5',1.76,60);

insert into instrutor (nome, RG, titulacao, nascimento)
values
('Antonio',1234,1,'1986-01-01'),
('Maria',1324,1,'1987-01-01'),
('Jose',0001,1,'1988-01-01'),
('Miguel',01010,1,'1988-01-01'),
('Emanuel',92929, 2,'1990-01-01');

insert into telefone_instrutor (instrutor_idinstrutor,numero,tipo)
values
(2,11111111,'1'),
(2,22222222,'1'),
(5,33333333,'1'),
(3,55555555,'2'),
(3,55555551,'2');

insert into turma (instrutor_idinstrutor,atividade_idatividade,dataInicio,dataFim,duracao,horario)
values
(3,1,'01-01-2015','01-01-2016',1,'03:00:00'),
(2,2,'01-01-2015','01-01-2016',1,'03:00:00'),
(3,3,'01-01-2015','01-01-2016',1,'04:00:00'),
(4,4,'01-01-2015','01-01-2016',1,'06:00:00'),
(5,4,'01-01-2015','01-01-2016',1,'07:00:00'),
(5,5,'01-01-2015','01-01-2016',1,'08:00:00');

insert into matricula (aluno_codMatricula, turma_idturma)
values
(1,6),
(4,1),
(1,2),
(1,4),
(2,1),
(3,1);


insert into chamada (matricula_aluno_codMatricula,matricula_turma_idturma,presente,data)
values
(2,1,1,'2015-01-01'),
(2,1,1,'2015-01-02'),
(2,1,0,'2015-01-03'),
(2,1,0,'2015-01-04'),
(3,1,1,'2015-01-01'),
(3,1,0,'2015-01-02'),
(3,1,0,'2015-01-03'),
(3,1,0,'2015-01-04');