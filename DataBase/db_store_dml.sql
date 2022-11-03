use db_store;

show tables;

select * from tbl_categoria;
describe tbl_categoria;

insert into tbl_categoria(categoria, estado_activo)
values
('OBD0',true),
('OBD1',true),
('OBD2',true),
('OBD3',true);


select * from tbl_marca;
describe tbl_marca;

insert into tbl_marca(marca)
values
('Launch'),
('Ancel'),
('Foxwell'),
('Bluedriver'),
('Autel'),
('Thinkcar'),
('Thinkdiag'),
('Injetech'),
('Motopower'),
('Ediag');


select * from tbl_proveedor;
describe tbl_proveedorProveedor;

insert into tbl_proveedor(proveedor, estado_activo)
values
('Toyota',true),
('ChineseLogic',true),
('Cemaco',true),
('RSR',true),
('JAVAZ',true),
('TectoTools',true),
('Autel',true),
('LTH',true),
('Excel',true),
('Daiway',true);

select * from tbl_departamento;

insert into tbl_departamento(departamento)
values
('Alta Verapaz'),
('Baja Verapaz'),
('Chimaltenango'),
('Chiquimula'),
('El Progreso'),
('Escuintla'),
('Guatemala'),
('Huehuetenango'),
('Izabal'),
('Jalapa'),
('Jutiapa'),
('Peten'),
('Quetzaltenango'),
('Quiche'),
('Retalhuleu'),
('Sacatepequez'),
('San Marcos'),
('Santa Rosa'),
('Solola'),
('Suchitepequez'),
('Totonicapan'),
('Zacapa');

select * from tbl_producto;
describe tbl_producto;
insert into tbl_producto(nombre_producto, id_proveedor_producto, id_categoria_producto, modelo, id_marca_producto, precio_producto)
values
('Scanner', 2,2, '300X', 4, 3000 ),
('AutelSOl', 5,3, '405th', 2, 500 );

show tables;

select * from tbl_cliente;
describe tbl_cliente;

insert into tbl_cliente(nombre_cliente, apellido_cliente, telefono_cliente, email_cliente, direccion_cliente, id_departamento_cliente, dpi_cliente, estado_activo, usuario, contraseña, rol)
values
('Carlos', 'Altan', '166464646', 'caltan@gmail.com', '11 av B 15-85 zona 12', 4, '546646466464600', true, 'altan', '123', false),
('David', 'Barcarcel', '6546464', 'bBArcarcel@gmail.com', '12 18-81 zona 18', 7, '464646464646', true, 'dako', '123', true) ;


select * from tbl_compra;
insert into tbl_compra(fecha_compra, fecha_entrega_compra, nit, precio_total)
values
('2022-09-27', '2022-10-27', '464664666', 3500),
('2022-09-27', '2022-10-25', '48622168', 700);

select * from tbl_detalle_compra;

insert into tbl_detalle_compra(id_compra_detalle, id_producto_detalle)
values 
(2,1),
(1,2);



