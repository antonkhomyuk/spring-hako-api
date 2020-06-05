insert into controller_type(id, type) values (0, 'lock'), (1, 'light_bulb'), (2, 'rosette');
insert into controller_state(id, state) values (0, 'off'), (1, 'on');

insert into colors(id, red, green, blue) values(1, 100, 100, 100);
INSERT INTO controllers (type_id, state_id, name, turned_on, color_id, energy_consumption) values (0, 0, 'r2-d2', null, null, null),
(1, 0, 'light-r2-d2', null, 1, null), (2, 0, 'sock-r2-d2', null, 1, 54.2);

insert into users (first_name, last_name, password) values ('john', 'black', '12345'), ('jack', 'black', 'qwertyuiop');

-- DROP ALL OBJECTS;
--
-- CREATE TABLE users
-- (
--     id       INT AUTO_INCREMENT PRIMARY KEY,
--     first_name    VARCHAR(250)  NOT NULL,
--     last_name    VARCHAR(250)  NOT NULL,
--     password VARCHAR(250)        NOT NULL
-- );
--
-- CREATE TABLE colors
-- (
--     id      INT AUTO_INCREMENT PRIMARY KEY,
--     red    SMALLINT,
--     green    SMALLINT,
--     blue   SMALLINT
-- );
--
-- CREATE TABLE controllers
-- (
--     id      INT AUTO_INCREMENT PRIMARY KEY,
--     type    INT,
--     state   INT,
--     turned_on TIMESTAMP
-- );
--
-- create table light_bulb_controllers
-- (
--     color_id INT,
--
--     CONSTRAINT FK_controller_color FOREIGN KEY (color_id) references colors (id)
-- );
--
-- create table lock_controllers
-- (
--     energy_consumption DOUBLE
-- );
--
-- create table rosette_controllers
-- (
--
-- );
