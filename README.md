# 프로젝트명 : **Java console application**
> DAO pattern을 기반으로 한 Java Console Application

## 1.요건정리
> - 목적 :  예상 이용자 30명 내외를 대상으로한 긴급연락망 구축
> - 구조 : DAO pattern , java와 DBMS를 직접 연결하는 구조
> - 기능 : CRUD(입력, 수정, 삭제, 전체조회, 검색, like검색)
> - 제작 기간 : 14시간

**DATA BASE TABLE**

컬럼명				|	데이터 타입(크기)		|	정보
----- 				|	--------							|	---
LMEM				|	VARCHAR2(13 BYTE)	|	회원번호
LNAME			|	VARCHAR2(20 BYTE)	|	성명
LID					|	VARCHAR2(20 BYTE)	|	아이디
LPW					|	VARCHAR2(20 BYTE)	|	비밀번호
LHP					|	VARCHAR2(20 BYTE)	|	전화번호
LBIRTH			|	VARCHAR2(8 BYTE)		|	생년월일
LEMAIL			|	VARCHAR2(20 BYTE)	|	이메일
LPOSTNO		|	VARCHAR2(5 BYTE) 	|	우편번호
LADDR				|	VARCHAR2(300 BYTE)	|	주소
LDELETEYN		|	VARCHAR2(1 BYTE)		|	삭제유무
LINSERTDATE	|	DATE							|	생성일
LUPDATEDATE	|	DATE							|	수정일


**class**
> - 메인 클래스
>> -  **bitcamp.java142.ch5.lybjf.LdbMemberScr**
>> -  ArrayList<LdbMemberVO> selectLdbMember
>> - ArrayList<LdbMemberVO> searchLdbMember
>> - ArrayList<LdbMemberVO> likeSearchLdbMember
>> - boolean insertLdbMember
>> - boolean updateLdbMember
>> - boolean deleteLdbMember
> - VO
>> - **bitcamp.java142.ch5.lybjf.vo.LdbMemberVO**
> - DAO
>> - **bitcamp.java142.ch5.lybjf.dao.LdbMemberDAO**
>> - **bitcamp.java142.ch5.lybjf.dao.LdbMemberDAOImpl**
> - SQL
>> - **bitcamp.java142.ch5.lybjf.sql.LdbSqlQueryMap**
> - Chaebun
>> - **bitcamp.java142.ch5.lybjf.common.LdbChaebunClass**
> - Connection
>> - **bitcamp.java142.ch5.lybjf.common.LdbConnProperty**

## 2. 개발환경 : Eclipse Neon3, jdk 1.8, oracle 11g R2

## 3. 실행화면
- 1. 입력
![image](https://user-images.githubusercontent.com/62315622/83327039-e1d68700-a2b3-11ea-84f3-95bbae4428d8.png)

- 2. 수정
![image](https://user-images.githubusercontent.com/62315622/83327067-15b1ac80-a2b4-11ea-97f9-518df78b91f0.png)

- 3. 삭제
![image](https://user-images.githubusercontent.com/62315622/83326199-dcc20980-a2ac-11ea-8711-95915c4f5b42.png)


- 4. 조회
![image](https://user-images.githubusercontent.com/62315622/83326060-fdd62a80-a2ab-11ea-9704-4a1effd7ce49.png)


- 5. 검색
![image](https://user-images.githubusercontent.com/62315622/83327120-8ce74080-a2b4-11ea-880c-bc8a9651eaeb.png)


- 6. like검색
![image](https://user-images.githubusercontent.com/62315622/83327129-aab4a580-a2b4-11ea-8bcf-8d159d532c4c.png)

