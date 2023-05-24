--sys�������� ������ ��?
--
--�ǽ� �ó�����
--
--����Ŭ ������ tomato������ ����� ����� tiger�� �Ѵ�.
--tomato������ ����� �������� ������ ����� �ش�.
--ts_tomato��� ���̺� �����̽� �̸����� ����Ŭ�� ��ġ�Ǿ� �ִ� �������� ��ġ�� Ȯ���� ��
--�Ʒ� DDL���� sys�������� �����Ѵ�.

create tablespace ts_ChoiEunMi
datafile 'D:\app\kytco\oradata\orcl11\ChoiEunMi.dbf' size 100M AUTOEXTEND 
ON NEXT 5M;


--�Ʒ��� ������ ������ ���̺����̽��� ���������� ����� ������ Ȯ���ϴ� DML���̴�.
--�̰͵� �ݵ�� sys �������� Ȯ���ؾ� �Ѵ�.
select tablespace_name, file_name, autoextensible, increment_by
      ,maxbytes
  from dba_data_files
 where tablespace_name = 'ts_ChoiEunMi';

--tomato��� ������ ����� ����� tiger�� �ϸ�
--tomato������ �ٶ󺸴� ���̺� �����̽��� ts_tomato�� �Ѵ�.
create user ChoiEunMi identified by "2771lim"
default tablespace ts_ChoiEunMi

----------------------------------------------------------
-- DCL - ���Ѻο�

grant create session to ChoiEunMi  with admin option;

--���̺��� ������� ������ �丶�信��  �ش�.
grant create table to ChoiEunMi with admin option;

--�並 ����� ������ �ش�
grant create view to ChoiEunMi with admin option;

--���̺� �����̽��� ���� ���� 
alter user ChoiEunMi quota unlimited on TS_ChoiEunMi;

--Ʈ���Ÿ� ����� ���Ѻο�
grant create trigger to ChoiEunMi;

-- 1�� �����ϴ� ������Ʈ ������?���� �ο�
grant create sequence to ChoiEunMi;

--���ν����� ������ �� �ִ� ���� �ο�
GRANT CREATE PROCEDURE TO ChoiEunMi;

COMMIT;

-----���̺����̽� ����
DROP TABLESPACE ts_meaningFarm
INCLUDING CONTENTS AND DATAFILES
CASCADE CONSTRAINTS;

-----���������� ����
drop user meaningfarm cascade;