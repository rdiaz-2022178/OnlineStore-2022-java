create database db_store;
use db_store;

create table if not exists tbl_departamento
(
	id_departamento int not null auto_increment,
    departamento varchar(40),
    primary key (id_departamento),
    unique (id_departamento)
);

create table if not exists tbl_usuario
(
	id_usuario int not null auto_increment,
    usuario varchar(50) not null,
    contraseña varchar(50) not null,
    rol_usuario boolean,
    primary key (id_usuario),
    unique (id_usuario)
);

create table if not exists tbl_cliente
(
	id_cliente int not null auto_increment,
    nombre_cliente varchar(40) not null,
    apellido_cliente varchar(40)not null,
    telefono_cliente varchar(20),
    email_cliente varchar(40),
    direccion_cliente varchar(40),
	id_departamento_cliente int not null,
    dpi_cliente varchar(15),
    estado_activo boolean,
    primary key (id_cliente),
    unique (id_cliente),
    foreign key (id_departamento_cliente) references tbl_departamento (id_departamento)
);

alter table tbl_cliente add column rol boolean;
select * from tbl_cliente;
create table if not exists tbl_proveedor
(
	id_proveedor int not null auto_increment,
    proveedor varchar(40),
    estado_activo boolean,
    primary key (id_proveedor),
    unique (id_proveedor)
);

create table if not exists tbl_categoria
(
	id_categoria int not null auto_increment,
    categoria varchar(40),
    estado_activo boolean,
    primary key (id_categoria),
    unique (id_categoria)
);

create table if not exists tbl_marca
(
	id_marca int not null auto_increment,
    marca varchar(40),
    primary key (id_marca),
    unique (id_marca)
);

create table if not exists tbl_producto
(
	id_producto int not null auto_increment,
    nombre_producto varchar(40),
    id_proveedor_producto int not null,
    id_categoria_producto int not null,
    modelo varchar(40),
    id_marca_producto int not null,
    precio_producto double,
    primary key (id_producto),
    unique (id_producto),
    foreign key (id_proveedor_producto) references tbl_proveedor(id_proveedor),
    foreign key (id_categoria_producto) references tbl_categoria(id_categoria),
    foreign key (id_marca_producto) references tbl_marca(id_marca)
);

create table if not exists tbl_compra
(
	id_compra int not null auto_increment,
    fecha_compra date,
    fecha_entrega_compra date,
    nit varchar(15),
    precio_total double,
    primary key (id_compra),
    unique (id_compra)
);

create table if not exists tbl_detalle_compra
(
	id_detalle_compra int not null auto_increment,
    id_compra_detalle int not null,
    id_producto_detalle int not null,
    primary key (id_detalle_compra),
    foreign key (id_compra_detalle) references tbl_compra (id_compra),
    foreign key (id_producto_detalle) references tbl_producto(id_producto)
    
);