

use scottDB;

create table mybatis_bbs_temporary(
	bId varchar(20) primary key,
    bName varchar(20),
    bContent varchar(20)
);

drop table mybatis_bbs;

insert into mybatis_bbs_temporary (bId, bName, bContent) values ("bb", "cc", "dd");