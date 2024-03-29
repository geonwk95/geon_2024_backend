# 2조 DB설계

drop database if exists monster;

create database monster;

use monster;

# 테이블 생성 =================================================

# 회원 테이블
drop table if exists member;

create table member(
	mno int auto_increment ,			-- 회원 번호
    mid varchar(30) not null unique ,	-- 회원 아이디
    mpw varchar(30) not null ,			-- 회원 비밀번호
    mphone char(13) not null unique ,	-- 회원 전화번호
    mname varchar(30) not null , 		-- 회원 이름
    primary key(mno)
);



insert into member values(
	1 , 'qwer' , '1234' , '010-1111-1111' , '유재석'
);

insert into member values(
	2 , 'asdf' , '4567' , '010-2222-2222' , '강호동'
);

# 몬스터리스트 테이블
drop table if exists monsterlist;

create table monsterlist(
	lino int auto_increment ,
    stepno int ,
    img longtext not null  ,
    iq int not null ,
    strong int not null ,
    primary key(lino)
);



insert into monsterlist values(
	'1' ,'1', 'img1' , 10 , 10 
);

insert into monsterlist values(
	'2', '2' , 'img2' , 20 , 25 
);

insert into monsterlist values(
	'3', '3' , 'img3' , 40 , 45
);

insert into monsterlist values(
	'4', '1' , 'img4' , 11 , 9 
);


# 몬스터 테이블
drop table if exists monster;

create table monster(	
    mno int auto_increment ,		 		 -- 회원번호
    nickname varchar(30) not null ,  		 -- 몬스터 이름
    lino int not null ,		 			-- 몬스터 번호
    hp int default(100),			 		 -- 몬스터 체력
    stress int default(0) ,			 		 -- 몬스터 스트레스
	iq int default(10) ,			 		 -- 몬스터 지능
    strong int default(10),        	   		 -- 몬스터 힘    
    foreign key(mno) references member(mno) on delete cascade,  -- 회원테이블 mno 참조 
    foreign key(lino) references monsterlist(lino) on delete cascade   	-- 몬스터리스트테이블 stepno 참조
);


insert into monster values(
	1 , 'asd' , 1 , 10 , 10 , 10 , 10 
);

insert into monster values(
	2 , 'qwe' , 4 , 5 , 4 , 3 , 1
);



# 이벤트 테이블
drop table if exists event;

create table event(
	eno int auto_increment ,
    ename varchar(10) not null,
    eimg longtext not null,
    statup int not null ,
    statdown int not null ,
    primary key(eno)
    
);



insert into event values(
	1 , 'exercise','...' ,4, 1
);

insert into event values(
	2 , 'eat' ,'...',1, 2
);

insert into event values(
	3 , 'study' ,'...',3, 2
);

insert into event values(
	4 , 'rest', '...',4, 2
);
select * from member;
select * from monsterlist;
select * from monster;
select * from event;

#delete from member where mno = 1;
#delete from monsterlist where lino = 4;