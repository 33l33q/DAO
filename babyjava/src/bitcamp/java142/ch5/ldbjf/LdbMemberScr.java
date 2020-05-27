package bitcamp.java142.ch5.ldbjf;

import java.util.ArrayList;
import java.util.Scanner;

import bitcamp.java142.ch5.ldbjf.dao.LdbMemberDAO;
import bitcamp.java142.ch5.ldbjf.dao.LdbMemberDAOImpl;
import bitcamp.java142.ch5.ldbjf.vo.LdbMemberVO;

public class LdbMemberScr {
	
	public boolean insertLdbMember(  String lname,String lid,String lpw
									,String lhp,String lbirth,String lmail
									,String lpostnum,String ljuso){
		
		System.out.println("(log) LdbMemberScr.insertLdbMember() 함수 진입 ");
		System.out.println(" " + lname +" " + lid +" " + lpw +" " + lhp +" " 
							+ lbirth +" " + lmail +" " + lpostnum +" " +ljuso);
		LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		LdbMemberVO lvo = null;
		
		System.out.println("(log) LdbMemberScr.insertLdbMember() 생성자 호출 ");
		lvo = new LdbMemberVO();
		lvo.setLname(lname);
		lvo.setLid(lid);
		lvo.setLpw(lpw);
		lvo.setLhp(lhp);
		lvo.setLbirth(lbirth);
		lvo.setLmail(lmail);
		lvo.setLpostnum(lpostnum);
		lvo.setLjuso(ljuso);
				
		System.out.println("" + lvo.getLid() + " " + lvo.getLbirth());
		boolean bFlag = ldao.insertLdbMember(lvo);
		
		System.out.println("(log) LdbMemberScr.insertLdbMember() 함수 종료 ");
		
		return bFlag;
	}
	
	//update
	public boolean updateLdbMember(String lmem, String lpw){
		
		System.out.println("(log) LdbMemberScr.updateLdbMember() 함수 진입 ");
		
		System.out.println(lmem + " " + lpw );
		
		LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		LdbMemberVO lvo = null;
		
		System.out.println("(log) LdbMemberScr.updateLdbMember() 생성자 호출 ");
		lvo = new LdbMemberVO();
		lvo.setLmem(lmem);
		lvo.setLpw(lpw);
		
		System.out.println("" + lvo.getLmem() + " " + lvo.getLpw());
		
		boolean bFlag = ldao.updateLdbMember(lvo);
		
		System.out.println("(log) LdbMemberScr.updateLdbMember() 함수 종료 ");
		return bFlag;
		
	}
		
		//delete
	  public boolean deleteLdbMember(String lmem){
		  
		  System.out.println("(log) LdbMemberScr.deleteLdbMember() 함수 진입 ");
		  System.out.println("값 확인" + lmem);
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		  LdbMemberVO lvo = null;
		  
		  System.out.println("(log) LdbMemberScr.updateLdbMember() 생성자 호출 ");
		  lvo = new LdbMemberVO();
		  lvo.setLmem(lmem);

		  System.out.println(" " + lvo.getLmem());
		  
		  boolean bFlag = ldao.deleteLdbMember(lvo);
		  
		  System.out.println("(log) LdbMemberScr.deleteLdbMember() 함수 종료 ");
		  return bFlag;
		  
	  }
	  
	  //전체조회select
	  public ArrayList<LdbMemberVO> selectLdbMember(){
		  
		  System.out.println("(log) LdbMemberScr.selectLdbMember() 함수 진입 ");
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		  ArrayList<LdbMemberVO> aList = ldao.selectLdbMember();
		  
		  System.out.println("(log) LdbMemberScr.selectLdbMember() 함수 종료 ");
		  return aList;
	  }
	  
	  public ArrayList<LdbMemberVO> searchLdbMember(String lmem){
		  System.out.println("(log) LdbMemberScr.searchLdbMember(String lmem) 함수 진입 ");
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		 
		  LdbMemberVO lvo = null;
		  lvo = new LdbMemberVO();
		  lvo.setLmem(lmem);
		  ArrayList<LdbMemberVO> aList = ldao.searchLdbMember(lvo);
		  
		  System.out.println("(log) LdbMemberScr.searchLdbMember(String lmem) 함수 종료 ");
		  return aList;
		  
	  }
	  
	  public ArrayList likeSearchLdbMember(String lmem){
		  System.out.println("(log) LdbMemberScr.likeSearchLdbMember(String lmem) 함수 진입 ");
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();	
		  
		  LdbMemberVO lvo = null;
		  lvo = new LdbMemberVO();
		  lvo.setLmem(lmem);
		  ArrayList<LdbMemberVO> aList = ldao.likeSearchLdbMember(lvo);
		  
		 
		  System.out.println("(log) LdbMemberScr.searchLdbMember(String lmem) 함수 종료 ");
		  return aList;
		  
	  }
	  
	  //출력 함수
	  public static void displayM(ArrayList<LdbMemberVO> aList){
		  for(int i = 0 ; i < aList.size() ; i++){
		  	LdbMemberVO lvo = aList.get(i);
		  	System.out.print("[" + (i+1) + "] 출력내역 >>> " + lvo.getLmem());
		  	System.out.print(" " + lvo.getLname());
		  	System.out.print(" " + lvo.getLid() );
		  	System.out.print(" " + lvo.getLpw());
		  	System.out.print(" " + lvo.getLhp());
		  	System.out.print(" " + lvo.getLbirth());
		  	System.out.print(" " + lvo.getLmail());
		  	System.out.print(" " + lvo.getLpostnum());
		  	System.out.print(" " + lvo.getLjuso());
		  	System.out.print(" " + lvo.getLdeleteYN());
		  	System.out.print(" " + lvo.getLinsertdate());
		  	System.out.print(" " + lvo.getLupdatedate() + "\n");
		  }		  
	  }
	  
	public static void main(String[] args) {
		
		
		System.out.println("수행할 동작의 번호를 입력하세요 ( 등록(1), 비밀번호 수정(2), 삭제(3), 전체조회(4), 검색(5), Like 검색(6)) ");
		Scanner sc = new Scanner(System.in);
		
		String sFlag = sc.nextLine();
		
		//등록함수
		if("1".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() insert 진입 ");
						
			System.out.println("이름, 아이디, 비밀번호, 휴대전화번호, 생년월일(8자리), 이메일, 우편번호, 주소를 순서대로 입력하세요"
					+ "	이때, ','을 통해서 각각의 정보를 구분하세요");
			
			Scanner sc1 = new Scanner(System.in);
			String strV = sc1.nextLine();
			
			//지역변수 선언
			String str[] 	= strV.split(",");
			
			String lname 	= str[0].toString();
			String lid 		= str[1].toString();
			String lpw		= str[2].toString();
			String lhp 		= str[3].toString();
			String lbirth 	= str[4].toString();
			String lmail 	= str[5].toString();
			String lpostnum = str[6].toString();
			String ljuso 	= str[7].toString();
			
			//객체화를 해서 메모리에 올림
			System.out.println("(log) LdbMemberScr.main() class 인스턴스");
			LdbMemberScr lms = new LdbMemberScr();
			boolean bFlag = lms.insertLdbMember(lname, lid, lpw, lhp, lbirth, lmail, lpostnum, ljuso);
			
			if(bFlag){
				System.out.println("데이터 입력 완료.");	
				LdbMemberScr lms0 = new LdbMemberScr(); 
				ArrayList<LdbMemberVO> aList = lms0.selectLdbMember();
				int aListSize = aList.size();
				if (aListSize > 0){
					LdbMemberScr.displayM(aList);
				}
			}else{
				System.out.println("데이터 재확인 요망");
			}//end 
			
			System.out.println("(log) LdbMemberScr.main() insert 종료 ");
			
		}
		
		//update 함수
		if("2".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() update 진입 ");
			
			
			System.out.println("수정할 멤버번호와 비밀번호를 입력하세요");
			//사용할 지역변수 선언 및 초기화
			Scanner sc1 = new Scanner(System.in);
			String strV = sc1.nextLine();
			
			String str[] = strV.split(",");
			String lmem  = str[0].toString();
			String lpw   = str[1].toString();
			
			System.out.println("(log) LdbMemberScr.main() class 인스턴스 ");
			LdbMemberScr lms = new LdbMemberScr();
			
			boolean bFlag = lms.updateLdbMember(lmem,lpw);
		
		
			if (bFlag){
				System.out.println("데이터 수정 완료!");
				LdbMemberScr lms0 = new LdbMemberScr(); 
				ArrayList<LdbMemberVO> aList = lms0.selectLdbMember();
				int aListSize = aList.size();
				if (aListSize > 0){
					LdbMemberScr.displayM(aList);
				}
			}else{
				System.out.println("데이터 재확인 요망 ");
			}
			System.out.println("(log) LdbMemberScr.main() update 종료 ");
			
		}// end of update
		
		//delete 함수
		if("3".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() delete 진입 ");
			
			
			System.out.println("삭제할 데이터의 멤버번호를 입력하세요");
			Scanner sc1 = new Scanner(System.in);
			String lmem = sc1.nextLine();
			
			System.out.println("(log) LdbMemberScr.main() class 인스턴스 ");
			LdbMemberScr lms = new LdbMemberScr();
			boolean bFlag = lms.deleteLdbMember(lmem);
			
			if(bFlag){
				System.out.println("데이터 삭제가 완료됐습니다.");
				LdbMemberScr lms0 = new LdbMemberScr(); 
				ArrayList<LdbMemberVO> aList = lms0.selectLdbMember();
				int aListSize = aList.size();
				if (aListSize > 0){
					LdbMemberScr.displayM(aList);
				}
					
			}else{
				System.out.println("데이터 재확인 요망");
			} 
			
			System.out.println("(log) LdbMemberScr.main() delete 종료 ");
			
		}//end of delete

		//select
		if("4".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() select 진입 ");
			System.out.println("(log) LdbMemberScr.main() class 인스턴스 ");
			//클래스 인스턴스
			LdbMemberScr lms = new LdbMemberScr();
			
			System.out.println("(log) LdbMemberScr.main() 변수 선언 및 초기화 ");
			ArrayList<LdbMemberVO> aList = lms.selectLdbMember();
			
			System.out.println("(log) LdbMemberScr.main() 회귀 ");
			int aListSize = aList.size();
			
			System.out.println("(log) LdbMemberScr.main() 데이터 출력");
			if(aListSize > 0){
				LdbMemberScr.displayM(aList);
			}
			
			System.out.println("(log) LdbMemberScr.main() select 종료 ");
		}

		//search
		if("5".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() search 진입 ");
			
			System.out.println("조회할 멤버번호를 입력하세요 ");
			Scanner sc1 = new Scanner(System.in);
			String lmem = sc1.nextLine();
			System.out.println("(log) LdbMemberScr.main() 변수 선언 및 초기화 ");
			
			System.out.println("(log) LdbMemberScr.main() class 인스턴스 ");
			LdbMemberScr lms = new LdbMemberScr();
			
			ArrayList<LdbMemberVO> aList = lms.searchLdbMember(lmem);
			
			System.out.println("(log) LdbMemberScr.main() 함수 회귀");
			System.out.println("(log) LdbMemberScr.main() 데이터 출력");
			
			int aListSize = 0;
			aListSize = aList.size();
			if(aListSize > 0){
				LdbMemberScr.displayM(aList);
			}else{
				System.out.println("오류가 발생했습니다 ");
			}
		}//end of Search
		
		//likeSearch
		if("6".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() likeSearch 진입 ");
			
			System.out.println("포함할 검색어를 입력하세요");
			Scanner sc1 = new Scanner(System.in);
			String lmem = sc1.nextLine();
			System.out.println("(log) LdbMemberScr.main() 변수 선언 및 초기화 ");
			
			System.out.println("(log) LdbMemberScr.main() class 인스턴스 ");
			LdbMemberScr lms = new LdbMemberScr();
			
			ArrayList<LdbMemberVO> aList = lms.likeSearchLdbMember(lmem);
			
			System.out.println("(log) LdbMemberScr.main() 함수 회귀");
			System.out.println("(log) LdbMemberScr.main() 데이터 출력");
			
			int aListSize = aList.size();
			if(aListSize > 0){
				LdbMemberScr.displayM(aList);
			}else{
				System.out.println("오류가 발생했습니다 ");
			}
		}//end of likeSearch	
			
	}//end of main

}//end of class
