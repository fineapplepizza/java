/* table �����ϱ� */
/* ���̵�(����),�н�����(����),�̸�(����),����(����)�� �����ϴ� ���̺�*/
create table members(
   id varchar2(20),
   pw varchar2(20),
   name varchar2(20),
   age number(10)
);

/*���̺� ���� �����ϱ�! - insert into ���̺�� values(��1,��2,��3,��4)*/
insert into members values('csm','0117','ä����',29);

select * from MEMBERS;
