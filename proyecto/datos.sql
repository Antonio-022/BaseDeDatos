
drop table alumno;
use bdacademico;
create table alumno
(
 ci int primary key not null,
 nombre varchar(50) not null,
 ap_pa varchar(50) not null,
 ap_ma varchar(50) not null,
 fecha date not null,
 genero varchar(50) not null
);
go
create proc alumnoc (@ci int,@nombre varchar(50),@ap_pa varchar(50),@ap_ma varchar(50),@fecha date,@genero varchar(50))
as begin
insert into alumno values(@ci,@nombre,@ap_pa,@ap_ma,@fecha,@genero);
end
go
use bdacademico;
go
create proc borrardatos(@ci int)
as begin
delete from alumno where ci = @ci
end
go
go
create proc edicion(@ci int,@nombre varchar(50),@ap_pa varchar(50),@ap_ma varchar(50),@fecha date,@genero varchar(50),@ci1 int)
as begin
update alumno set ci=@ci,nombre=@nombre,ap_pa = @ap_pa,ap_ma=@ap_ma,fecha=fecha,genero=@genero where ci = @ci1;
end
go
select*from alumno;
update alumno set nombre ='fabian' where nombre='lider';
