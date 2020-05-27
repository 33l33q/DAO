package bitcamp.java142.ch5.sql; /*1108 ����2*/

public abstract class EmpSqlQueryMap {

	public static String getSelectQuery() throws Exception{
		System.out.println("---- OralceTest_4.getSelectEmp.getSelectQuery() �Լ� ���� ----");
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO  \n ");
		sb.append("		   ,A.ENAME ENAME \n ");
		sb.append(" FROM	EMP A		  \n ");
		System.out.println("---- OralceTest_4.getSelectEmp.getSelectQuery() �Լ� �� ----");
		
		return sb.toString();		
	}
	public static String getSearchQuery() throws Exception{
		System.out.println("OralceTest_4.serachEmp().getSearchQuery() �Լ� ����");
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO 	\n");
		sb.append("		  ,A.ENAME ENAME 	\n");
		sb.append(" FROM  EMP A		 		\n");
		sb.append(" WHERE A.EMPNO = ?	 	\n");
		sb.append(" AND	  A.ENAME =	?	 	\n");
		

		System.out.println("OralceTest_4.serachEmp().getSearchQuery() �Լ� ��");
		return sb.toString();	
	}
	
	public static String getLikeSearchQuery() throws Exception{
		
		System.out.println("OralceTest_4.likeSerachEmp.getLikeSearchQuery() �Լ� ����");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT A.EMPNO EMPNO  \n ");
		sb.append("		   ,A.ENAME ENAME \n ");
		sb.append(" FROM	EMP A		  \n ");
		sb.append(" WHERE A.ENAME LIKE '%' || ? || '%'  \n");
		

		System.out.println("OralceTest_4.likeSerachEmp.getLikeSearchQuery() �Լ� ��");
		return sb.toString();
	}
}//end of class




