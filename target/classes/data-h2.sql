-- movie table--
insert into movie values (1,'Action','English','2023-10-07','MEG');
insert into movie values (2,'Action','English','2023-10-15','MEG2');
insert into movie values (3,'Action','English','2023-10-07','SCREAM');
insert into movie values (4,'Action','Hindi','2023-10-07','RAAZ');


insert into cinema values (1,'Street 1','Bangalore','CINEPOL1');
insert into cinema values (2,'Street 1','Bangalore','CINEPOL2');

insert into cinema_hall values (60,1,1,'HALL1');
insert into cinema_hall values (62,2,2,'HALL2');

--    -- show table --
--INSERT INTO show VALUES (1,'2023-10-17 09:00:00',1,1,'2023-10-17 07:00:00');
INSERT INTO show VALUES (2,'2023-10-17 11:00:00',1,2,'2023-10-17 09:00:00');
INSERT INTO show VALUES (2,'2023-10-17 09:00:00',2,3,'2023-10-17 07:00:00');

-- seats
insert into seat values (1,1);
insert into seat values (1,2);
insert into seat values (1,3);
insert into seat values (1,4);
insert into seat values (1,5);

----seatcinemahall
insert into CINEMA_HALL_SEATS values (1,1);
insert into CINEMA_HALL_SEATS values (1,2);
insert into CINEMA_HALL_SEATS values (1,3);
insert into CINEMA_HALL_SEATS values (1,4);
insert into CINEMA_HALL_SEATS values (1,5);