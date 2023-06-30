DROP DATABASE IF EXISTS ejemplo_RecursoHumano;
CREATE DATABASE ejemplo_RecursoHumano;
USE ejemplo_RecursoHumano;

CREATE TABLE RH_T_Puesto
  (
   id int,
   Nombre varchar(50) not null,
   EstaActivo int,
   Constraint RH_T_Puesto_PK primary key(id)   
  );

CREATE TABLE RH_T_Departamento
  (
   id int,
   Nombre varchar(50) not null,
   EstaActivo int,
   Constraint RH_T_Departamento_PK primary key(id)     
  );
  
CREATE TABLE RH_T_Estado
 (
  id int,
  Nombre varchar(50) not null,
  EstaActivo int,
  Constraint RH_T_Estado_PK primary key(id)     
 );

create table RH_T_RecursoHumano
  (
    id int,
    nombre varchar(50) not null,
	PrimerApellido varchar(50),
	SegundoApellido varchar(50),
	CURP char(18),
	RH_T_Puesto_id int,
	RH_T_Departamento_id int,
	RH_T_Estado_id int,
    Constraint RH_T_RecursoHumano_PK primary key(id),
	Constraint RH_T_RecursoHumano_FK_RH_T_Puesto_id
	   foreign key (RH_T_Puesto_id) 
	   references RH_T_Puesto(id) 
	   on delete Restrict 
	   on update cascade,
	Constraint RH_T_RecursoHumano_FK_RH_T_Departamento_id
	   foreign key (RH_T_Departamento_id) 
	   references RH_T_Departamento(id) 
	   on delete Restrict 
	   on update cascade,
	Constraint RH_T_RecursoHumano_FK_RH_T_Estado_id
	   foreign key (RH_T_Estado_id) 
	   references RH_T_Estado(id)
	   on delete Restrict 
	   on update cascade	  
  );
  
-- ------------------------------------------
--
-- ------------------------------------------

insert into RH_T_Puesto(id, Nombre, EstaActivo)
  values (1, 'Desarrollador Front', 1);

insert into RH_T_Puesto(id, Nombre, EstaActivo)
  values (2, 'Desarrollador Back', 1);

insert into RH_T_Puesto(id, Nombre, EstaActivo)
  values (3, 'Analista', 1);
  
-- RH_T_Departamento

insert into RH_T_Departamento(id, Nombre, EstaActivo)
  values (1, 'D1', 1);

insert into RH_T_Departamento(id, Nombre, EstaActivo)
  values (2, 'D2', 1);

insert into RH_T_Departamento(id, Nombre, EstaActivo)
  values (3, 'D3', 1);
  
-- RH_T_Estado

insert into RH_T_Estado(id, Nombre, EstaActivo)
  values (1, 'Activo', 1);

insert into RH_T_Estado(id, Nombre, EstaActivo)
  values (2, 'Inactivo', 1);

insert into RH_T_Estado(id, Nombre, EstaActivo)
  values (3, 'Suspendido', 1);

