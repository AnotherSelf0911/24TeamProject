package teamProject;

import java.util.Scanner;


public class SignUp extends Member {
	Scanner scan = new Scanner(System.in);
	
	
	public SignUp() {
		System.out.println("회원가입");
		
		System.out.print("아이디를 입력해주세요 : ");
		memberID = scan.next();
		
		System.out.print("비밀번호를 입력해주세요 (영문, 숫자 조합 8자리~16자리) : ");
		String tempPW = scan.next();
		
		
		
		
		
		
		
		MemberInfo member = new MemberInfo();
		
		
	}
}
