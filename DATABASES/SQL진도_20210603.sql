--DESC: Description ���̺����� ����
DESC dept;

--select: ���̺��� ��ȸ, where ��ȸ���� as(Alies)��Ī���� �ʵ���� �涧
--concat����Ŭ�����Լ��� ����Ʈ �ۼ���
SELECT concat(deptno, '��') as "�μ���ȣ"
, dname as "�μ���"
, concat(loc,'��') as "��ġ"
FROM dept 
WHERE loc = 'NEW YORK';
-- DUAL �������̺��̸�. ���̺��� ���� ������ select�Ҷ� 
SELECT 3+5 as "3���ϱ�8��" from dual;
-- ���ڵ�(row) : �÷�(�ʵ�field)��� ����
SELECT concat(count(*), '��') as "������ 2000�� ����" FROM emp WHERE sal > 2000;
-- ū����ǥ(�ʵ��), ��������ǥ(���ڿ�ó��=��,����)
SELECT * FROM emp WHERE ename != 'KING';
SELECT * FROM emp WHERE hiredate >= '1982/01/01';
-- OR�� +(������), AND�� X(������) 
SELECT * FROM emp WHERE deptno = 10 and job = 'MANAGER';
SELECT * FROM emp WHERE sal NOT BETWEEN 2000 and 3000;
SELECT * FROM emp WHERE hiredate BETWEEN'1981/01/01' and '1981/12/31';
SELECT * FROM emp WHERE comm in (300,500,1400);
-- LIKE ��ȸ, ���ϵ�ī��=% ��ȸ
-- (��) Ű���忡 ��ȣ�� ������ �Լ�upper(),concat(),count()
SELECT * FROM emp WHERE ename LIKE upper('k%');
SELECT * FROM emp WHERE ename LIKE '%N';
-- null(��) �� �߿��� ����: null���� ������ �˻�X
-- �׷���, null���� �ʵ忡 ������, �˻���?
SELECT * FROM emp WHERE comm is NULL;
-- NVL(Null Value) �ΰ��� ��ġ�ϴ� �Լ� 
-- ����߿� Ŀ�̼��� 0�� ���� �����? null����� ���Ϸ���
-- �Ʒ� E�� emp���̺��� �˸��ƽ� ��Ī���� E.*�� emp.*�� ��������.
SELECT nvl2(comm,100,0), E.* FROM emp E WHERE NVL(comm,0) = 0;
-- NVL2(�ʵ��,���̾ƴҶ�100,���϶�0),NVL(�ʵ��,���϶�0)
-- ����Ŭ�� ǥ������X, ANSI���� ǥ���Դϴ�.
SELECT DECODE(comm,null,0,100),NVL2(comm,100,0), E.* FROM emp E WHERE NVL(comm,0) = 0;
-- ���� �������� ���� sort = ���� order by �ʵ�� ��������[�ʱⰪ]|��������
-- (��) ��������? (select������ �ߺ��Ǿ��ִ�...) �Դϴ�.
SELECT ROWNUM, e.* FROM (--���̺��
SELECT * FROM emp ORDER BY sal DESC--��������
) e WHERE ROWNUM = 1;
-- �� �������������� �ؼ� �Ҷ��� ���ʺ��� �ؼ�
-- �� ���Ŀ��� 1� ���� limit�� Mysql(������DB)�� ��ɾ�. ����ŬX
-- Mysql(������DB) �ִ� AI(AutoIcrement)�ڵ������� ��� ����ŬX
-- �ߺ����ڵ�(row)�� �����ϴ� ��ɾ� distinct
SELECT deptno as "�μ���ȣ" FROM emp;--�������� �μ���ȣ�� ���
SELECT DISTINCT deptno as "�μ���ȣ" FROM emp;
-- (��) ���ڿ��� �����Ҷ� concat�Լ��ܿ� || ���������� 2���� ���ļ� ����
SELECT ename ||' is a '|| job as "���ڿ� ����" FROM emp;
-- ������� select ������ Read
-- ���Ŀ��� CRUD�߿� Insert, Update, Delete 3���� ������ ��