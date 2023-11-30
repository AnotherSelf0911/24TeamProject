package teamProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class SignUp extends Member{ // Member의 멤버변수 가져오기


	Scanner scan = new Scanner(System.in);
	boolean idrun = true; // 아이디 입력 반복문
	boolean pwrun = true; // 비밀번호 입력 반복문
	
	public List<Member> memberList = new ArrayList<Member>(); // ArrayList에 담기 위해 ArrayList 입력
	
	public SignUp() {
		
	}
	
	public void SignUp1() { // Main에서 실행 시킬 메서드
		
		System.out.println("-----회원가입-----");
		
		while(idrun) { // 아이디 반복문 시작
			System.out.print("아이디를 입력해주세요 : "); // 아이디 입력
			String tempID = scan.next(); // 예비 아이디 저장
			if (IDdupCheck(tempID) == true) { // IDdupCheck에서 tempID값이 true로 반환 되면
				memberID = tempID;	// 예비 아이디 -> 멤버 ID로 넣고
				idrun = false; // 아이디 반복문 종료
				break;	// break로 중간에 나오기
			}
		}
		
		while(pwrun) {	// 비밀번호 반복문 시작
			
			System.out.print("비밀번호를 입력해주세요 (영문, 숫자 조합 8자리~16자리) : ");
			String tempPW = scan.next();	// 입력 받은 비밀번호 예비 비밀번호에 저장
			
			if(tempPW.length() > 16 || tempPW.length() < 8) {	// 입력 받은 예비 비밀번호 값이 8자리 미만이거나 16자리 초과면
				System.out.println("입력하신 비밀번호 길이가 너무 길거나 짧습니다.");	// 알려주고 다시 위로
			}
			else {
				if(getType(tempPW) == true) {	// 입력 받은 예비 비밀번호 값을 getType에서 true를 반환 받았을때
					memberPW = tempPW;	// 예비 비밀번호가 멤버 비밀번호가 됨
					pwrun = false;	// 비밀번호 반복문 종료 시키기
					break;	// break 써서 중간에 나오기
				}
			}
		} // 비밀번호 while
		
		System.out.print("나이를 입력해주세요 : ");	// int값으로 나이 입력받기
		memberAge = scan.nextInt();
		
		System.out.print("이름을 입력해주세요 : ");	// String으로 이름 입력 받기
		memberName = scan.next();
		
		System.out.print("성별을 입력해주세요 : ");	// String으로 성별 입력 받기
		memberGender = scan.next();
		
		System.out.print("몸무게를 입력해주세요 (소수점 입력 가능) : ");	// float으로 몸무게 입력 받기
		memberWeight = scan.nextFloat();
		
		System.out.print("키를 입력해주세요 (소수점 입력 가능) : ");	// float으로 키 입력 받기
		memberLength = scan.nextFloat();
		
		float memberStartWeight = memberWeight;
		Date startDate = new Date();
		// 하고싶은게 ArrayList Member 안에 저 위에 있는 정보들 다 넣고 회원 가입 완료 출력 시키기.
		Member newMember = new Member(memberName, memberGender, memberAge, memberStartWeight, memberWeight, memberLength, startDate, memberID, memberPW);
		
		memberList.add(newMember);
		
		
	} // SignUp1();
	
	public boolean IDdupCheck(String tempID) {	// ArrayList 안에 있는 ID 중복 체크하는 메서드
		Iterator<Member> id = memberList.iterator();	// Iterator로 중복자 확인 하기
		while(id.hasNext()) {	// Member 안에 있는 id 값 전부 불러오기
			Member member = id.next();	// 객체 member값은 불러온 id값과 같음
			if(member.getMemberID().equals(tempID)) {	// 만약에 적은 예비 ID값이 불러온 ID 값과 같으면
				System.out.println("중복되는 ID 입니다.");	// 중복된 ID 임을 알려주고 false 반환
				return false;
			}
		}
		System.out.println("적합한 ID 입니다.");	// 다 찾아봤는데 없으면
		return true;	// 적합한 아이디 이므로 true 반환
	} // IDdupCheck();
	
	public boolean getType(String tempPW) {	// 비밀번호 영어, 숫자 확인
		
		boolean numeric = false;	// 처음에는 숫자 값, 영어 값 둘다 false로
		boolean alpha = false;
		
		for (int i = 0; i < tempPW.length(); i++) {	// 입력 받은 tempPW 길이 만큼 반복
			int index = tempPW.charAt(i);	// index에 예비 비밀번호 charAt i번째 문자 넣기
			
			if(index >= 48 && index <= 57) {	// 만약에 index 값이 0~9 까지 존재할때
				numeric = true;	// true 넣어주기
			}
			else if(index >= 65 && index <= 122) {	// 만약에 index 값이 a~Z 까지 존재 할때
				alpha = true;	// true 넣어주기
			}
			
		}
		
		if(numeric == true && alpha == true) {	// 영어 숫자 둘다 존재할때
			System.out.println("적합한 비밀번호 입니다.");
			return true;	// 적합한 비밀번호 이므로 true 반환
		}
		else if (numeric == true) {	// 숫자만 존재할때
			System.out.println("영어가 들어가있지 않습니다.");
			return false;	// false 반환
		}
		else if (alpha == true) {	// 영어만 존재할때
			System.out.println("숫자가 들어가있지 않습니다.");
			return false;	// false 반환
		}
		else {	// 둘 다 존재하지 않을때 (특수문자, 한글, 한자)
			System.out.println("적합하지 않은 비밀번호 입니다.");
			return false;	// false 반환
		}
	} // getType();
	
	public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
        // 이후에 memberList를 사용할 수 있음
    }
}
