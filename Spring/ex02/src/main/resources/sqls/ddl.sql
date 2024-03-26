create sequence seq_board;

create table tbl_board(
	bno number(10,0),
	title varchar2(200) not null,
	content varchar2(2000) not null,
	writer varchar2(50) not null,
	regdate date default sysdate
);

alter table tbl_board add constraint pk_board primary key (bno);


회원 테이블 스키마
-- 회원 테이블
create sequence seq_member
;

create table tbl_member (
    mno number(10, 0),                  -- 회원번호
    username varchar2(50) unique not null,     -- 회원 아이디
    password varchar2(500) not null,     -- 회원 비밀번호
    email varchar2(255) unique not null,       -- 회원 이메일
    role varchar2(100) not null,        -- 회원 권한(접근 제어)
    createDate date default sysdate     -- 회원 생성날짜
)
;

alter table tbl_member add constraint pk_member primary key (mno)
;