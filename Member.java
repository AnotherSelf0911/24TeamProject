package teamProject;

import java.util.Date;

public class Member {
	
	int memberAge;		// 나이
	float memberWeight; // 몸무게
	float memberLength; // 키
	float memberBMI; // BMI 수치
	String memberName;	// 이름
	String memberGender;// 성별
	Date startDate;		// 시작일 (회원가입일)
	int days;			// 회원가입일로부터 몇일 지났는지
	int exerciseDays;	// 운동한 날짜
	String memberGrade;	// 회원 등급
	String memberExerciseDiff;	// 회원 운동 강도
	String memberID;	// 회원 아이디
	String memberPW;	// 회원 비밀번호
	
	public String getMemberID() {
		return memberID;
	}
	
}
