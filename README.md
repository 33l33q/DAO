# ������Ʈ�� : **Java console application**
> DAO pattern�� ������� �� Java Console Application

----------

### �������
> - ���� :  ���� �̿��� 30�� ���ܸ� ��������� ��޿����� ����
> - ���� : DAO pattern , java�� DBMS�� ���� �����ϴ� ����
> - ��� : CRUD(�Է�, ����, ����, ��ü��ȸ, �˻�, like�˻�)
> - ���� �Ⱓ : 14�ð�

###DATA BASE TABLE

�÷���				|	������ Ÿ��(ũ��)		|	����
----- 				|	--------							|	---
LMEM				|	VARCHAR2(13 BYTE)	|	ȸ����ȣ
LNAME			|	VARCHAR2(20 BYTE)	|	����
LID					|	VARCHAR2(20 BYTE)	|	���̵�
LPW					|	VARCHAR2(20 BYTE)	|	��й�ȣ
LHP					|	VARCHAR2(20 BYTE)	|	��ȭ��ȣ
LBIRTH			|	VARCHAR2(8 BYTE)		|	�������
LEMAIL			|	VARCHAR2(20 BYTE)	|	�̸���
LPOSTNO		|	VARCHAR2(5 BYTE) 	|	�����ȣ
LADDR				|	VARCHAR2(300 BYTE)	|	�ּ�
LDELETEYN		|	VARCHAR2(1 BYTE)		|	��������
LINSERTDATE	|	DATE							|	������
LUPDATEDATE	|	DATE							|	������


###class
> - ���� Ŭ����
> --  **bitcamp.java142.ch5.lybjf.LdbMemberScr**
> -- ArrayList<LdbMemberVO> selectLdbMember
> -- ArrayList<LdbMemberVO> searchLdbMember
> -- ArrayList<LdbMemberVO> likeSearchLdbMember
> -- boolean insertLdbMember
> -- boolean updateLdbMember
> -- boolean deleteLdbMember
> - VO
> -- **bitcamp.java142.ch5.lybjf.vo.LdbMemberVO**
> - DAO
> -- **bitcamp.java142.ch5.lybjf.dao.LdbMemberDAO**
> -- **bitcamp.java142.ch5.lybjf.dao.LdbMemberDAOImpl**
> - SQL
> -- **bitcamp.java142.ch5.lybjf.sql.LdbSqlQueryMap**
> - Chaebun
> -- **bitcamp.java142.ch5.lybjf.common.LdbChaebunClass**
> - Connection
> -- **bitcamp.java142.ch5.lybjf.common.LdbConnProperty**

-------------------
###3. ����ȯ�� : Eclipse Neon3, jdk 1.8, oracle 11g R2

