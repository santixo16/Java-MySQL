/*
PROYECTO INTEGRADOR

INTEGRANTES: 
SANTIAGO ENRIQUE HERNANDEZ CONTRERAS
DAVID NICOLAS CHILITO
SANTIAGO BAQUERO
VERSION 6
*/

/*CREACION DEL PROYECTO INTEGRADOR*/
DROP DATABASE IF EXISTS techcare; --BORRAMOS LA BASE DE DATOS SI YA EXISTE PARA QUE CADA VEZ QUE SE EJECUTE EL SCRIPT NO SE DUPLIQUEN LOS VALORES
CREATE DATABASE techcare;/*CREAMOS UNA TABLA PARA ALAMCENAR TODAS LAS DEMAS TABLAS QUE SE VAN A ALMACENAR*/
USE techcare;/*ABRIMOS NUESTRO TABLA O ENTRAMOS */

CREATE TABLE usuarios(
    id_user INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30) NOT NULL UNIQUE,
    password CHAR(64) NOT NULL
);

CREATE table empleados(/*CREAREMOS UNA TABLA PARA EL EMPLEADO DONDE TENDREMOS LA INFORMACION DE ESTE */
    id_empleado INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    primer_nombre_empleado VARCHAR(20) NOT NULL,/*SE GUARDA EL PRIMER NOMBRE PARA MEJORAR EL RENDIMIENTO DE ALMACENAMIENTO*/
    segundo_nombre_empleado VARCHAR(20) NOT NULL,/*SE GUARDA EL SEGUNDO NOMBRE PARA MEJORAR EL RENDIMIENTO DE ALMACENAMIENTO*/
    primer_apellido_empleado VARCHAR(20) NOT NULL,/*SE GUARDA EL PRIMER APELLIDO PARA MEJORAR EL RENDIMIENTO DE ALMACENAMIENTO*/
    segundo_apellido_empleado VARCHAR(20) NOT NULL,/*SE GUARDA EL SEGUNDO APELLIDO PARA MEJORAR EL RENDIMIENTO DE ALMACENAMIENTO*/
    telefono_empleado VARCHAR(13) NOT NULL,/*SE SOLICITARA EL NUMERO DEL EMPLEADOS POR POSIBLES LLAMADAS DE ATENCION O INFORMACION*/
    direccion_empleado CHAR(30) NOT NULL,/*LA ZONA DONDE VIVE NUESTRO EMPLEADO PARA LLAMARLO*/
    email_empleado VARCHAR(50) NOT NULL,
    salario_empleado FLOAT NOT NULL
);/*CERRAMOS NUESTRA TABLA DE EMPLEADOS CON SUS CONTENIDOS */

/*INSERT INTO usuarios (username, password) VALUES ('santi', SHA2('prueba', 256));*/
INSERT INTO usuarios (username, password) VALUES ('santi', 'prueba'),('admin', 'admin');


CREATE TABLE clientes(
    id_cliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    primer_nombre_cliente VARCHAR(20) NOT NULL,
    segundo_nombre_cliente VARCHAR(20) NOT NULL,
    primer_apellido_cliente VARCHAR(20) NOT NULL,
    segundo_apellido_cliente VARCHAR(20) NOT NULL,
    telefono_cliente VARCHAR(13) NOT NULL,
    direccion_cliente VARCHAR(30) NOT NULL,
    correo_electronico VARCHAR(50) NOT NULL,
    fecha_cita DATE NOT NULL
);

SHOW COLUMNS FROM empleados;/*SE MOSTRARA LA TABLA CON SU CONTENIDO DE EMPLEADOS*/
SHOW COLUMNS FROM clientes;/*SE MOSTRARA LA TABLA DE CLIENTES DONDE LE PEDIMOS SU INFORMACION*/

INSERT INTO empleados (primer_nombre_empleado, segundo_nombre_empleado, primer_apellido_empleado, 
    segundo_apellido_empleado, telefono_empleado, direccion_empleado, email_empleado, salario_empleado) VALUES
    ('Santiago', 'Enrique', 'Hernandez', 'Contreras', '5555555', 'direccion 1', 'sehernandezc@sanmateo.edu.co', 2200000),
    ('David', 'Nicolas', 'Chilito', 'Joaqui', '5545555', 'direccion 2', 'dnchilito@sanmateo.edu.co', 2200000),
    ('Santiago', '', 'Baquero', 'Hurtado', '22244444', 'Desconocida', 'sbaquero@sanmateo.edu.co', 2200000);


SELECT * FROM empleados;

INSERT INTO clientes (primer_nombre_cliente, segundo_nombre_cliente, primer_apellido_cliente, 
                      segundo_apellido_cliente, telefono_cliente, direccion_cliente, correo_electronico, fecha_cita) 
VALUES ('Enrique', 'Leonardo', 'Martinez', 'Correa', '3013247112', 'direccion 1', 'enrique@mail.com', '2022-12-02'),
       ('Cristo', 'David', 'Manchado', 'Fulano', '3016267412', 'direccion 2', 'cristo@mail.com', '2022-12-03'),
       ('Abel', 'Fernando', 'Jurado', 'Zabaleta', '3003546114', 'direccion 3', 'abel@mail.com', '2022-12-04'), 
       ('William', 'Jose', 'Mendoza', 'Uribe', '45528902', 'direccion 4', 'william@mail.com', '2022-12-02');


SELECT * FROM clientes;