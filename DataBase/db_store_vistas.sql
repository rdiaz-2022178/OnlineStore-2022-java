create view view_cliente as select * from tbl_cliente;

create view view_producto as select * from tbl_producto;

create view view_proveedor as select * from tbl_proveedor;

create view view_categoria as select * from tbl_categoria;

create view view_usuario as select * from tbl_usuario;

create view view_marca as select * from tbl_marca;

create view view_precio as select * from tbl_compra where precio_total >= 300;

select * from view_precio;

create view view_PM as select * from tbl_producto as p inner join tbl_marca as m group by(p.id_producto); 

select * from view_PM;

create view view_DC as select * from tbl_detalle_compra as d inner join tbl_cliente as c on id_detalle_compra = id_cliente;

create view view_DCc as select * from tbl_detalle_compra as d inner join tbl_cliente as c on id_detalle_compra = id_cliente group by(id_detalle_compra);

select * from view_DCc;