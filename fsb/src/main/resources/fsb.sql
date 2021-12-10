drop table board;
drop table rating;
drop table place;
drop table member;

create table MEMBER(
    member_id varchar2(50) not null,
    member_pwd varchar2(100) not null,
    member_name varchar2(20) not null,
    member_nickname varchar2(30) not null,
    member_email varchar2(100) not null,
    member_phone varchar2(15) not null,
    member_address varchar2(30) not null,
    member_tier varchar2(6) default 'normal' not null,
    member_cre_date date default SYSDATE not null,
    
    CONSTRAINT member_pk PRIMARY KEY (member_id),
    CONSTRAINT member_uq unique(member_nickname)
);

create table PLACE(
    place_id number not null,
    place_name varchar2(50) not null,
    place_address varchar2(255) not null,
    place_lat varchar2(100) not null,
    place_lng varchar2(100) not null,
    place_menu varchar2(20) not null,
    place_cre_date date default sysdate not null,
    
    CONSTRAINT place_pk PRIMARY KEY (place_id)
);

create table RATING(
    rating_id number not null,
    place_id number not null,
    member_id varchar2(50) not null,
    ratings number not null,
    
    CONSTRAINT rating_pk PRIMARY KEY (rating_id),
    CONSTRAINT rating_place_fk FOREIGN KEY(place_id)
    REFERENCES PLACE(place_id) ON DELETE CASCADE,
    CONSTRAINT rating_member_fk FOREIGN KEY(member_id)
    REFERENCES MEMBER(member_id) ON DELETE CASCADE
);
create unique index rating_uq_idx on RATING(place_id, member_id);

create table BOARD(
    board_id NUMBER not null,
    board_content varchar2(300),
    member_id varchar2(50) not null,
    place_id number not null,
    rating_id number not null,
    board_cre_date date default sysdate not null,
    board_mod_date date default sysdate not null,
    board_ip varchar2(15),
    board_count number default 0 not null,
    
    CONSTRAINT board_pk PRIMARY KEY(board_id),
    CONSTRAINT board_member_fk FOREIGN KEY(member_id)
    REFERENCES MEMBER(member_id) ON DELETE CASCADE,
    CONSTRAINT board_place_fk FOREIGN KEY(place_id)
    REFERENCES PLACE(place_id) ON DELETE CASCADE,
    CONSTRAINT board_rating_fk FOREIGN KEY(rating_id)
    REFERENCES RATING(rating_id) ON DELETE CASCADE
);

insert into member(member_id, member_pwd, member_name, member_nickname, member_email, member_phone, member_address)
values(
    'abc', '123', '홍길동', '홍길동', '123@naver.com', '000-0000-0000', '서울'
);

insert into member(member_id, member_pwd, member_name, member_nickname, member_email, member_phone, member_address)
values(
    '123', '123', '홍길동', '홍길동123', '321@naver.com', '000-0000-0000', '서울'
);

insert into place(PLACE_ID, place_name, place_Address, place_lat, place_lng, place_menu)
values(
    place_id_seq.nextval, '양재역앞', '양재역', '123', '123', '붕어빵'
);

insert into rating(rating_id, member_id, place_id, ratings)
values(rating_id_seq.nextval, 'abc', 21, 3);

insert into rating(rating_id, member_id, place_id, ratings)
values(rating_id_seq.nextval, '123', 21, 5);

select * from rating;

select p.place_id, p.place_nameavg, (r.ratings)
from place p
join rating r
on p.place_id = r.place_ID
group by p.place_id, p.place_name;

