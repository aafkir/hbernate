-- mysql -h prodpeda-mysql2.infra.umontpellier.fr -u p00000009432 -p p00000009432

-- xxxx
drop table personne;
drop table ville;

create table Ville (nom varchar(12), pays varchar(15), primary key(nom)) engine=INNODB;
insert into Ville values ('Montpellier','France');
insert into Ville values ('Paris','France');
insert into Ville values ('Berlin','Allemagne');
insert into Ville values ('Angers','France');

create table Personne (numSS varchar(12), nom varchar(15), dateN date, genre varchar(1), primary key (numSS)) engine=INNODB;

alter table Personne add localisation varchar(12);
alter table Personne add constraint personne_fk foreign key (localisation) references Ville (nom);

insert into Personne values ('1234','Marie','1988-06-02','F','Montpellier');
insert into Personne values ('2345','Paul','1998-06-06','M','Paris');
insert into Personne values ('3456','Elise','2008-06-02','F','Berlin');
insert into Personne values ('1123','Eloi','1978-09-02','M','Angers');

create table Club_Sportif (codeClub varchar(12) primary key, nom varchar(12), localisation varchar(12)) engine=INNODB;
alter table Club_Sportif add constraint club_fk foreign key (localisation) references Ville (nom);

insert into Club_Sportif values ('K1','Karate Cat','Montpellier');
insert into Club_Sportif values ('T1','TC Jalad','Montpellier');
insert into Club_Sportif values ('F1','FC Paillad','Montpellier');

create table Inscrit_Dans (numSS varchar(12), codeClub varchar(12), constraint id_pk primary key (numSS,codeClub)) engine=INNODB;
alter table Inscrit_Dans add constraint id_fk1 foreign key (numSS) references Personne (numSS);
alter table Inscrit_Dans add constraint id_fk2 foreign key (codeClub) references Club_Sportif (codeClub);

insert into Inscrit_Dans values ('1234','K1');
insert into Inscrit_Dans values ('2345','K1');
insert into Inscrit_Dans values ('1123','K1');
insert into Inscrit_Dans values ('1234','T1');
insert into Inscrit_Dans values ('2345','T1');
insert into Inscrit_Dans values ('1123','F1');
insert into Inscrit_Dans values ('3456','F1');
insert into Inscrit_Dans values ('2345','F1');

CREATE TABLE Car (id int PRIMARY KEY NOT NULL AUTO_INCREMENT, make varchar(100) NOT NULL, 
	model varchar(100) NOT NULL );

