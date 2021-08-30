/* table 생성하기 */
/* 아이디(문자),패스워드(문자),이름(문자),나이(숫자)를 포함하는 테이블*/
create table members(
   id varchar2(20),
   pw varchar2(20),
   name varchar2(20),
   age number(10)
);

/*테이블에 내용 삽입하기! - insert into 테이블명 values(값1,값2,값3,값4)*/
insert into members values('csm','0117','채수민',29);

select * from MEMBERS;
