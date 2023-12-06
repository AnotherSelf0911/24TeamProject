package teamProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Member{
		
	// 회원 가입 시 넣어지는 정보들
	String memberName;	// 이름
	String memberGender;// 성별
	int memberAge;		// 나이
	float startWeight;  // 첫날 몸무게
	float memberWeight; // 몸무게
	float memberLength; // 키
	String startDate;	// 시작일 (회원가입일)
	String memberID;	// 회원 아이디
	String memberPW;	// 회원 비밀번호
	
	
	
	int days;			// 회원가입일로부터 몇일 지났는지
	int exerciseDays;	// 운동한 날짜
	String memberGrade;	// 회원 등급
	String memberExerciseDiff;	// 회원 운동 강도
	float memberBMI; // BMI 수치
	
	

	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String memberName, String memberGender, int memberAge, float startWeight, float memberWeight,
			float memberLength, String startDate, String memberID, String memberPW, int days, int exerciseDays,
			String memberGrade, String memberExerciseDiff, float memberBMI) {
		super();
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberAge = memberAge;
		this.startWeight = startWeight;
		this.memberWeight = memberWeight;
		this.memberLength = memberLength;
		this.startDate = startDate;
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.days = days;
		this.exerciseDays = exerciseDays;
		this.memberGrade = memberGrade;
		this.memberExerciseDiff = memberExerciseDiff;
		this.memberBMI = memberBMI;
	}
	
	public static float getBMI(float memberWeight, float memberLength) {
		float tempLength = memberLength / 100;
		float BMI = (float) memberWeight / (tempLength * tempLength);
		
		return BMI;
	}
	
	public static int checkDays(String startDate) throws Exception {
		
		Date date = new Date();
		
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdFormat.format(date);
		Date startD = sdFormat.parse(startDate);
		Date endD = sdFormat.parse(today);
		
		long diff = startD.getTime() - endD.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		
		int days = (int) diffDays;
		return days;
	}
	
	public static String makeStartDate() {
		Date date = new Date();
		String startDate;
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		startDate = sdFormat.format(date);
		return startDate;
	}
	
	

	public String getMemberID() {
		return memberID;
	}
	
	
	
	
}