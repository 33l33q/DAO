package bitcamp.java142.ch5.ldbjf.dao;

import java.util.ArrayList;

import bitcamp.java142.ch5.ldbjf.vo.LdbMemberVO;

public interface LdbMemberDAO {
	
	boolean insertLdbMember(LdbMemberVO i_lvo);
	boolean updateLdbMember(LdbMemberVO i_lvo);
	boolean deleteLdbMember(LdbMemberVO i_lvo);

	ArrayList<LdbMemberVO>selectLdbMember();
	ArrayList<LdbMemberVO>searchLdbMember(LdbMemberVO i_lvo);
	ArrayList<LdbMemberVO> likeSearchLdbMember(LdbMemberVO i_lvo);


}


