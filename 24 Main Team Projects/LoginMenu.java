package teamProject;

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
				signUp.setMemberList(memberList);
				System.out.print("아이디를 입력해주세요 : ");
				String tempID = scan.next();
				System.out.print("비밀번호를 입력해주세요 : ");
				String tempPW = scan.next();
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
	
	
}
