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
		
		System.out.println("(log) LdbMemberScr.insertLdbMember() �Լ� ���� ");
		System.out.println(" " + lname +" " + lid +" " + lpw +" " + lhp +" " 
							+ lbirth +" " + lmail +" " + lpostnum +" " +ljuso);
		LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		LdbMemberVO lvo = null;
		
		System.out.println("(log) LdbMemberScr.insertLdbMember() ������ ȣ�� ");
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
		
		System.out.println("(log) LdbMemberScr.insertLdbMember() �Լ� ���� ");
		
		return bFlag;
	}
	
	//update
	public boolean updateLdbMember(String lmem, String lpw){
		
		System.out.println("(log) LdbMemberScr.updateLdbMember() �Լ� ���� ");
		
		System.out.println(lmem + " " + lpw );
		
		LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		LdbMemberVO lvo = null;
		
		System.out.println("(log) LdbMemberScr.updateLdbMember() ������ ȣ�� ");
		lvo = new LdbMemberVO();
		lvo.setLmem(lmem);
		lvo.setLpw(lpw);
		
		System.out.println("" + lvo.getLmem() + " " + lvo.getLpw());
		
		boolean bFlag = ldao.updateLdbMember(lvo);
		
		System.out.println("(log) LdbMemberScr.updateLdbMember() �Լ� ���� ");
		return bFlag;
		
	}
		
		//delete
	  public boolean deleteLdbMember(String lmem){
		  
		  System.out.println("(log) LdbMemberScr.deleteLdbMember() �Լ� ���� ");
		  System.out.println("�� Ȯ��" + lmem);
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		  LdbMemberVO lvo = null;
		  
		  System.out.println("(log) LdbMemberScr.updateLdbMember() ������ ȣ�� ");
		  lvo = new LdbMemberVO();
		  lvo.setLmem(lmem);

		  System.out.println(" " + lvo.getLmem());
		  
		  boolean bFlag = ldao.deleteLdbMember(lvo);
		  
		  System.out.println("(log) LdbMemberScr.deleteLdbMember() �Լ� ���� ");
		  return bFlag;
		  
	  }
	  
	  //��ü��ȸselect
	  public ArrayList<LdbMemberVO> selectLdbMember(){
		  
		  System.out.println("(log) LdbMemberScr.selectLdbMember() �Լ� ���� ");
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		  ArrayList<LdbMemberVO> aList = ldao.selectLdbMember();
		  
		  System.out.println("(log) LdbMemberScr.selectLdbMember() �Լ� ���� ");
		  return aList;
	  }
	  
	  public ArrayList<LdbMemberVO> searchLdbMember(String lmem){
		  System.out.println("(log) LdbMemberScr.searchLdbMember(String lmem) �Լ� ���� ");
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();		
		 
		  LdbMemberVO lvo = null;
		  lvo = new LdbMemberVO();
		  lvo.setLmem(lmem);
		  ArrayList<LdbMemberVO> aList = ldao.searchLdbMember(lvo);
		  
		  System.out.println("(log) LdbMemberScr.searchLdbMember(String lmem) �Լ� ���� ");
		  return aList;
		  
	  }
	  
	  public ArrayList likeSearchLdbMember(String lmem){
		  System.out.println("(log) LdbMemberScr.likeSearchLdbMember(String lmem) �Լ� ���� ");
		  
		  LdbMemberDAO ldao = new LdbMemberDAOImpl();	
		  
		  LdbMemberVO lvo = null;
		  lvo = new LdbMemberVO();
		  lvo.setLmem(lmem);
		  ArrayList<LdbMemberVO> aList = ldao.likeSearchLdbMember(lvo);
		  
		 
		  System.out.println("(log) LdbMemberScr.searchLdbMember(String lmem) �Լ� ���� ");
		  return aList;
		  
	  }
	  
	  //��� �Լ�
	  public static void displayM(ArrayList<LdbMemberVO> aList){
		  for(int i = 0 ; i < aList.size() ; i++){
		  	LdbMemberVO lvo = aList.get(i);
		  	System.out.print("[" + (i+1) + "] ��³��� >>> " + lvo.getLmem());
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
		
		
		System.out.println("������ ������ ��ȣ�� �Է��ϼ��� ( ���(1), ��й�ȣ ����(2), ����(3), ��ü��ȸ(4), �˻�(5), Like �˻�(6)) ");
		Scanner sc = new Scanner(System.in);
		
		String sFlag = sc.nextLine();
		
		//����Լ�
		if("1".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() insert ���� ");
						
			System.out.println("�̸�, ���̵�, ��й�ȣ, �޴���ȭ��ȣ, �������(8�ڸ�), �̸���, �����ȣ, �ּҸ� ������� �Է��ϼ���"
					+ "	�̶�, ','�� ���ؼ� ������ ������ �����ϼ���");
			
			Scanner sc1 = new Scanner(System.in);
			String strV = sc1.nextLine();
			
			//�������� ����
			String str[] 	= strV.split(",");
			
			String lname 	= str[0].toString();
			String lid 		= str[1].toString();
			String lpw		= str[2].toString();
			String lhp 		= str[3].toString();
			String lbirth 	= str[4].toString();
			String lmail 	= str[5].toString();
			String lpostnum = str[6].toString();
			String ljuso 	= str[7].toString();
			
			//��üȭ�� �ؼ� �޸𸮿� �ø�
			System.out.println("(log) LdbMemberScr.main() class �ν��Ͻ�");
			LdbMemberScr lms = new LdbMemberScr();
			boolean bFlag = lms.insertLdbMember(lname, lid, lpw, lhp, lbirth, lmail, lpostnum, ljuso);
			
			if(bFlag){
				System.out.println("������ �Է� �Ϸ�.");	
				LdbMemberScr lms0 = new LdbMemberScr(); 
				ArrayList<LdbMemberVO> aList = lms0.selectLdbMember();
				int aListSize = aList.size();
				if (aListSize > 0){
					LdbMemberScr.displayM(aList);
				}
			}else{
				System.out.println("������ ��Ȯ�� ���");
			}//end 
			
			System.out.println("(log) LdbMemberScr.main() insert ���� ");
			
		}
		
		//update �Լ�
		if("2".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() update ���� ");
			
			
			System.out.println("������ �����ȣ�� ��й�ȣ�� �Է��ϼ���");
			//����� �������� ���� �� �ʱ�ȭ
			Scanner sc1 = new Scanner(System.in);
			String strV = sc1.nextLine();
			
			String str[] = strV.split(",");
			String lmem  = str[0].toString();
			String lpw   = str[1].toString();
			
			System.out.println("(log) LdbMemberScr.main() class �ν��Ͻ� ");
			LdbMemberScr lms = new LdbMemberScr();
			
			boolean bFlag = lms.updateLdbMember(lmem,lpw);
		
		
			if (bFlag){
				System.out.println("������ ���� �Ϸ�!");
				LdbMemberScr lms0 = new LdbMemberScr(); 
				ArrayList<LdbMemberVO> aList = lms0.selectLdbMember();
				int aListSize = aList.size();
				if (aListSize > 0){
					LdbMemberScr.displayM(aList);
				}
			}else{
				System.out.println("������ ��Ȯ�� ��� ");
			}
			System.out.println("(log) LdbMemberScr.main() update ���� ");
			
		}// end of update
		
		//delete �Լ�
		if("3".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() delete ���� ");
			
			
			System.out.println("������ �������� �����ȣ�� �Է��ϼ���");
			Scanner sc1 = new Scanner(System.in);
			String lmem = sc1.nextLine();
			
			System.out.println("(log) LdbMemberScr.main() class �ν��Ͻ� ");
			LdbMemberScr lms = new LdbMemberScr();
			boolean bFlag = lms.deleteLdbMember(lmem);
			
			if(bFlag){
				System.out.println("������ ������ �Ϸ�ƽ��ϴ�.");
				LdbMemberScr lms0 = new LdbMemberScr(); 
				ArrayList<LdbMemberVO> aList = lms0.selectLdbMember();
				int aListSize = aList.size();
				if (aListSize > 0){
					LdbMemberScr.displayM(aList);
				}
					
			}else{
				System.out.println("������ ��Ȯ�� ���");
			} 
			
			System.out.println("(log) LdbMemberScr.main() delete ���� ");
			
		}//end of delete

		//select
		if("4".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() select ���� ");
			System.out.println("(log) LdbMemberScr.main() class �ν��Ͻ� ");
			//Ŭ���� �ν��Ͻ�
			LdbMemberScr lms = new LdbMemberScr();
			
			System.out.println("(log) LdbMemberScr.main() ���� ���� �� �ʱ�ȭ ");
			ArrayList<LdbMemberVO> aList = lms.selectLdbMember();
			
			System.out.println("(log) LdbMemberScr.main() ȸ�� ");
			int aListSize = aList.size();
			
			System.out.println("(log) LdbMemberScr.main() ������ ���");
			if(aListSize > 0){
				LdbMemberScr.displayM(aList);
			}
			
			System.out.println("(log) LdbMemberScr.main() select ���� ");
		}

		//search
		if("5".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() search ���� ");
			
			System.out.println("��ȸ�� �����ȣ�� �Է��ϼ��� ");
			Scanner sc1 = new Scanner(System.in);
			String lmem = sc1.nextLine();
			System.out.println("(log) LdbMemberScr.main() ���� ���� �� �ʱ�ȭ ");
			
			System.out.println("(log) LdbMemberScr.main() class �ν��Ͻ� ");
			LdbMemberScr lms = new LdbMemberScr();
			
			ArrayList<LdbMemberVO> aList = lms.searchLdbMember(lmem);
			
			System.out.println("(log) LdbMemberScr.main() �Լ� ȸ��");
			System.out.println("(log) LdbMemberScr.main() ������ ���");
			
			int aListSize = 0;
			aListSize = aList.size();
			if(aListSize > 0){
				LdbMemberScr.displayM(aList);
			}else{
				System.out.println("������ �߻��߽��ϴ� ");
			}
		}//end of Search
		
		//likeSearch
		if("6".equals(sFlag)){
			
			System.out.println("(log) LdbMemberScr.main() likeSearch ���� ");
			
			System.out.println("������ �˻�� �Է��ϼ���");
			Scanner sc1 = new Scanner(System.in);
			String lmem = sc1.nextLine();
			System.out.println("(log) LdbMemberScr.main() ���� ���� �� �ʱ�ȭ ");
			
			System.out.println("(log) LdbMemberScr.main() class �ν��Ͻ� ");
			LdbMemberScr lms = new LdbMemberScr();
			
			ArrayList<LdbMemberVO> aList = lms.likeSearchLdbMember(lmem);
			
			System.out.println("(log) LdbMemberScr.main() �Լ� ȸ��");
			System.out.println("(log) LdbMemberScr.main() ������ ���");
			
			int aListSize = aList.size();
			if(aListSize > 0){
				LdbMemberScr.displayM(aList);
			}else{
				System.out.println("������ �߻��߽��ϴ� ");
			}
		}//end of likeSearch	
			
	}//end of main

}//end of class
