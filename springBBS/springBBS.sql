

create database scottDB character set utf8 collate utf8_general_ci;

use scottDB;

/*
create table mvc_bbs(
	bNo int(3) not null auto_increment primary key, MEMO = Oracle: sequence
    bName varchar(20),
    bSubject varchar(80),
    bContent varchar(300),
    bDate datetime default current_timestamp, MEMO = Oracle: 
    bHit int(3) default 0,
    bGroup int(3),
    bStep int(4),
    bIndent int(4)
);

FIXME コード作動するように直すこと；Error Code: 1136. Column count doesn't match value count at row 
insert into mvc_bbs(bNo, bName, bSubject, bContent, bDate, bHit, bGroup, bStep, bIndent) 
values(0, 'test','testです','こんにちは', last_insert_id(), 0, 0, 0, 0); MEMO = Oracle: currval */

create table mvc_bbs_temporary(
	bNo varchar(20),
    bName varchar(20),
    bSubject varchar(80),
    bContent varchar(300),
    bDate varchar(20),
    bHit int(3),
    bGroup int(3),
    bStep int(4),
    bIndent int(4)
);
    
insert into mvc_bbs_temporary(bNo, bName, bSubject, bContent, bDate, bHit, bGroup, bStep, bIndent) 
values('n','name','subject','content','date',0,0,0,0);