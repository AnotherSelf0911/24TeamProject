package exercise01;
import java.util.Date;

public class Member{
		
	// 회원 가입 시 넣어지는 정보들
	String memberName;	// 이름
	String memberGender;// 성별
	int memberAge;		// 나이
	float Startweight;  // 첫날 몸무게
	float memberWeight; // 몸무게
	float memberLength; // 키
	Date startDate;		// 시작일 (회원가입일)
	String memberID;	// 회원 아이디
	String memberPW;	// 회원 비밀번호
	
	
	
	int days;			// 회원가입일로부터 몇일 지났는지
	int exerciseDays;	// 운동한 날짜
	String memberGrade;	// 회원 등급
	String memberExerciseDiff;	// 회원 운동 강도
	float memberBMI; // BMI 수치
	
	
	
	
	
	public String getMemberID() {
		return memberID;
	}
	
	
	public Member(String name, Date startDate) {
		this.name = name;
		this.startDate = startDate;
	}
	
	
}
