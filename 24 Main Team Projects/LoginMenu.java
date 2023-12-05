package teamProject;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LoginMenu {
	
	Scanner scan = new Scanner(System.in);
	List<Member> memberList; 
	SignUp signUp = new SignUp();
	
	
	public LoginMenu() {
		
		boolean run = true;
		while(run) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.print("선택 > ");
			int select = scan.nextInt();
			switch(select) {
			case 1:
				signUp.SignUp1();
				break;
			case 2:
				System.out.print("아이디를 입력해주세요 : ");
				String tempID = scan.next();
				System.out.print("비밀번호를 입력해주세요 : ");
				String tempPW = scan.next();
				if (loginCheck(tempID, tempPW) == true) {
					new MainMenu();
					break;
				}
				
				System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				
				run = false;
				break;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				continue;
			}// select
		}// while
		
	}
	boolean loginCheck(String tempID, String tempPW) {
		Iterator<Member> checkMember = signUp.memberList.iterator();
		while(checkMember.hasNext()) {
			Member member = checkMember.next();
			if(member.memberID.equals(tempID) && member.memberPW.equals(tempPW)) {
				System.out.println(member.memberName + " 님 안녕하세요.");
				return true;
			}
		}
		return false;
	}
	
	
}
