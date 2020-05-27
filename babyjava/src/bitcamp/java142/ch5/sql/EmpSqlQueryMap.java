package bitcamp.java142.ch5.sql; /*1108 오후2*/

public abstract class EmpSqlQueryMap {

	public static String getSelectQuery() throws Exception{
		System.out.println("---- OralceTest_4.getSelectEmp.getSelectQuery() 함수 시작 ----");
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO  \n ");
		sb.append("		   ,A.ENAME ENAME \n ");
		sb.append(" FROM	EMP A		  \n ");
		System.out.println("---- OralceTest_4.getSelectEmp.getSelectQuery() 함수 끝 ----");
		
		return sb.toString();		
	}
	public static String getSearchQuery() throws Exception{
		System.out.println("OralceTest_4.serachEmp().getSearchQuery() 함수 시작");
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT A.EMPNO EMPNO 	\n");
		sb.append("		  ,A.ENAME ENAME 	\n");
		sb.append(" FROM  EMP A		 		\n");
		sb.append(" WHERE A.EMPNO = ?	 	\n");
		sb.append(" AND	  A.ENAME =	?	 	\n");
		

		System.out.println("OralceTest_4.serachEmp().getSearchQuery() 함수 끝");
		return sb.toString();	
	}
	
	public static String getLikeSearchQuery() throws Exception{
		
		System.out.println("OralceTest_4.likeSerachEmp.getLikeSearchQuery() 함수 시작");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT A.EMPNO EMPNO  \n ");
		sb.append("		   ,A.ENAME ENAME \n ");
		sb.append(" FROM	EMP A		  \n ");
		sb.append(" WHERE A.ENAME LIKE '%' || ? || '%'  \n");
		

		System.out.println("OralceTest_4.likeSerachEmp.getLikeSearchQuery() 함수 끝");
		return sb.toString();
	}
}//end of class




