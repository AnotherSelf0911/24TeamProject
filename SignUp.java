package teamProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class SignUp extends Member {
	Scanner scan = new Scanner(System.in);
	boolean idrun = true;
	boolean pwrun = true;
	
	public ArrayList<Member> memberList = new ArrayList<Member>();
	
	public void SignUp1() {
		
		System.out.println("-----회원가입-----");
		
		while(idrun) {
			System.out.print("아이디를 입력해주세요 : "); // 아이디 입력
			String tempID = scan.next();
			if (IDdupCheck(tempID) == true) {
				tempID = memberID;
				idrun = false;
				break;
			}
		}
		
		while(pwrun) {
			
			System.out.print("비밀번호를 입력해주세요 (영문, 숫자 조합 8자리~16자리) : ");
			String tempPW = scan.next();
			
			if(tempPW.length() > 16 || tempPW.length() < 8) {
				System.out.println("입력하신 비밀번호 길이가 너무 길거나 짧습니다.");
			}
			else {
				if(getType(tempPW) == true) {
					tempPW = memberPW;
					pwrun = false;
					break;
				}
			}
		} // 비밀번호 while
		
		System.out.print("나이를 입력해주세요 : ");
		memberAge = scan.nextInt();
		
		System.out.print("이름을 입력해주세요 : ");
		memberName = scan.next();
		
		System.out.print("성별을 입력해주세요 : ");
		memberGender = scan.next();
		
		System.out.print("몸무게를 입력해주세요 (소수점 입력 가능) : ");
		memberWeight = scan.nextFloat();
		
		System.out.print("키를 입력해주세요 (소수점 입력 가능) : ");
		memberLength = scan.nextFloat();
		
		
		addNewMemberList();
		
	} // SignUp1();
	
	public boolean IDdupCheck(String tempID) {	// ArrayList 안에 있는 ID 중복 체크
		Iterator<Member> id = memberList.iterator();
		while(id.hasNext()) {
			Member member = id.next();
			if(member.getMemberID().equals(tempID)) {
				System.out.println("중복되는 ID 입니다.");
				return false;
			}
		}
		System.out.println("적합한 ID 입니다.");
		return true;
	} // IDdupCheck();
	
	public boolean getType(String tempPW) {	// 비밀번호 영어, 숫자 확인
		
		boolean numeric = false;
		boolean alpha = false;
		
		for (int i = 0; i < tempPW.length(); i++) {
			int index = tempPW.charAt(i);
			
			if(index >= 48 && index <= 57) {
				numeric = true;
			}
			else if(index >= 65 && index <= 122) {
				alpha = true;
			}
			
		}
		
		if(numeric == true && alpha == true) {
			System.out.println("적합한 비밀번호 입니다.");
			return true;
		}
		else if (numeric == true) {
			System.out.println("영어가 들어가있지 않습니다.");
			return false;
		}
		else if (alpha == true) {
			System.out.println("숫자가 들어가있지 않습니다.");
			return false;
		}
		else {
			System.out.println("적합하지 않은 비밀번호 입니다.");
			return false;
		}
	} // getType();
	
	public void addNewMemberList(Member member) {
		memberList.add(member);
	}
	
}
