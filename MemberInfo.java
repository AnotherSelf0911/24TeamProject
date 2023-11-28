package teamProject;

import java.util.ArrayList;

public class MemberInfo extends SignUp {
	public ArrayList<Member> memberList = new ArrayList<Member>();
	
	public MemberInfo() {
		
	}
	
	
	public void addNewMemberList(Member member) {
		memberList.add(member);
	}
}
