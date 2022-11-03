use db_store;

-- USUARIO

select * from tbl_usuario;

DELIMITER //
create procedure sp_iniciarSesionCliente(u varchar(40), c varchar(40))
begin
select usuario, contraseña from tbl_usuario where usuario = u and contraseña = c and rol_usuario = false;
end //
DELIMITER ;


DELIMITER //
create procedure sp_agregarUsuario(u varchar(40), c varchar(40), r boolean)
begin
insert into tbl_usuario(usuario, contraseña, rol_usuario)
values(u,c,r);
end //
DELIMITER ;


DELIMITER //
create procedure sp_iniciarSesionAdmin(u varchar(40), c varchar(40))
begin
select usuario, contraseña from tbl_usuario where usuario = u and contraseña = c and rol_usuario = true;
end //
DELIMITER ;

call sp_iniciarSesionAdmin('rodro', 'holamundo');

call sp_agregarUsuario('ana', '123', false);

-- END USUARIO

select * from tbl_categoria;

DELIMITER //
create procedure sp_verCategoria()
begin
select * from tbl_categoria;
end //
DELIMITER ;

call sp_verCategoria();

select * from tbl_producto;

DELIMITER //
create procedure sp_verProducto()
begin
select * from tbl_producto;
end //
DELIMITER ;

call sp_verProducto();

DELIMITER //
create procedure sp_verCliente()
begin
select * from tbl_cliente;
end //
DELIMITER ;

call sp_verCliente();

DELIMITER //
create procedure sp_verCompra()
begin
select * from tbl_compra;
end //
DELIMITER ;

call sp_verCompra();

show tables;

DELIMITER //
create procedure sp_iniciarSesionC2(u varchar(40), c varchar(40))
begin
select usuario, contraseña from tbl_cliente where usuario = u and contraseña = c and rol = false;
end //
DELIMITER ;

DELIMITER //
create procedure sp_iniciarSesionA2(u varchar(40), c varchar(40))
begin
select usuario, contraseña from tbl_cliente where usuario = u and contraseña = c and rol = true;
end //
DELIMITER ;
drop procedure sp_iniciarSesionC2;
call sp_iniciarSesionA2('dako', '123');

DELIMITER //
create procedure sp_agregarCliente(nombre varchar(40), apellido varchar(40), telefono varchar(20), 
email varchar(40), direccion varchar(40), idD int, dpi varchar(15), estado boolean, usu varchar(40), contra varchar(40), rol_cliente boolean)
begin
insert into tbl_cliente(nombre_cliente, apellido_cliente, telefono_cliente, email_cliente, direccion_cliente, id_departamento_cliente, dpi_cliente, estado_activo, usuario, contraseña, rol)
values(nombre, apellido, telefono, email, direccion, idD, dpi, estado, usu, contra, rol_cliente);
end //
DELIMITER ;

drop procedure sp_agregarCliente;
call sp_agregarCliente('Rodrigo', 'Diaz', '6464665', 'r@jasdf', '11 av b zona 1', 1, '46654646', true, 'rodro', '123', true);

select * from tbl_cliente;
describe tbl_cliente;

DELIMITER //
create procedure sp_verMarcas()
begin
select * from tbl_marca;
end //
DELIMITER ;

call sp_verMarcas;

DELIMITER //
create procedure sp_verCLiente()
begin
select * from tbl_cliente;
end //
DELIMITER ;

call sp_verCLiente();

-- curdate()

select * from tbl_producto;

DELIMITER //
create procedure sp_agregarProducto(nombre varchar(40), idP int, idC int, model varchar(40), idM int, precio double)
begin
insert into tbl_producto(nombre_producto, id_proveedor_producto, id_categoria_producto, modelo, id_marca_producto, precio_producto)
values (nombre, idP, idC, model, idM, precio);
end //
DELIMITER ;

call sp_agregarProducto('Asfault', '1', 2, 'wrx', 2, 568);

select * from tbl_proveedor;
select * from tbl_categoria;

select * from tbl_marca;




DELIMITER //
create procedure sp_buscarProducto(id int)
begin
select* from tbl_producto where id_producto = id;
end //
DELIMITER ;

DELIMITER //
create procedure sp_actualizarProducto(id int, n varchar(40), idP int, idC int, mo varchar(40), idM int, p double )
begin
update tbl_producto set id_producto = id, nombre_producto = n, id_proveedor_producto = idP, id_categoria_producto = idC, modelo = mo, id_marca_producto = idM, precio_producto = p
where id_producto = id; 
end //
DELIMITER ;

call sp_actualizarProducto(1, 'Slow', 2, 1, 'qwe', 3, 45);


DELIMITER //
create procedure sp_eliminarProducto(id int)
begin
delete from tbl_producto where id_producto = id;
end //
DELIMITER 

select * from tbl_compra;
select * from tbl_detalle_compra;
DELIMITER //
create procedure sp_agregarCompra(fecha date, nit varchar(40), precio double)
begin
insert into tbl_compra(fecha_compra, fecha_entrega_compra, nit, precio_total)
values(curdate(), fecha, nit, precio  );
end //
DELIMITER ;

call sp_agregarCompra('2022-07-09', '46546646', 45.26);

DELIMITER //
create procedure sp_buscarCompra
DELIMITER ;

call sp_agregarCliente();

select * from tbl_cliente;

DELIMITER //
create procedure sp_agregarMarca(m varchar(40))
begin
insert into tbl_marca(marca)
values (m);
end //
DELIMITER ;

call sp_agregarMarca('Dell');

select * from tbl_marca;

DELIMITER //
create procedure sp_buscarMarca(id int)
begin
select * from tbl_marca where id_marca = id;
end //
DELIMITER ;

call sp_buscarMarca(1);

DELIMITER //
create procedure sp_actualizarMarca(id int, m varchar(40))
begin
update tbl_marca set id_marca = id, marca = m where id_marca = id;
end //
DELIMITER ;

call sp_actualizarMarca(11, 'locos');

DELIMITER //
create procedure sp_eliminarMarca(id int)
begin
delete from tbl_marca where id_marca = id;
end //
DELIMITER ;

call sp_eliminarMarca(12);

select * from tbl_categoria;

DELIMITER //
create procedure sp_agregarCategoria(c varchar(40), e boolean)
begin
insert into tbl_categoria(categoria, estado_activo)
values(c, e);
end //
DELIMITER ;

DELIMITER //
create procedure sp_buscarCategoria(id int)
begin
select * from tbl_categoria where id_categoria = id;
end //
DELIMITER ;

call sp_buscarCategoria(1);

DELIMITER //
create procedure sp_actualizarCategoria(id int, c varchar(40), e boolean)
begin
update tbl_categoria set id_categoria = id, categoria = c, estado_activo = e where id_categoria = id;
end //
DELIMITER ;

DELIMITER //
create procedure sp_ocultarCategoria(id int)
begin
update tbl_categoria set estado_activo = false where id_categoria = id;
end //
DELIMITER ;
