package teamProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MasterAccount {
	
	public MasterAccount() throws Exception {
		AdminStartDays();
		AdmincheckDays(startDate);
	}
	
	// 회원 가입 시 넣어지는 정보들
	String memberName = "마스터 계정";	// 이름
	String memberGender = "마스터 계정 성별";// 성별
	int memberAge = 24;		// 나이
	float Startweight = (float) 80.5;  // 첫날 몸무게
	float memberWeight = (float) 80.5; // 몸무게
	float memberLength = (float) 180.1; // 키
	String startDate = AdminStartDays();	// 시작일 (회원가입일)
	String memberID = "admin";	// 회원 아이디
	String memberPW = "adminpw";	// 회원 비밀번호
	
	
	
	int days = AdmincheckDays(startDate);	// 회원가입일로부터 몇일 지났는지
	int exerciseDays = 365;	// 운동한 날짜
	String memberGrade = "";	// 회원 등급
	String memberExerciseDiff = "상";	// 회원 운동 강도
	float memberBMI = memberWeight / (memberLength * memberLength); // BMI 수치
	
	int AdmincheckDays(String startDate) throws Exception {
		
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
	
	String AdminStartDays() {
		Date date = new Date();
		String startDate;
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -365);
		startDate = sdFormat.format(cal.getTime());
		return startDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public float getStartweight() {
		return Startweight;
	}

	public float getMemberWeight() {
		return memberWeight;
	}

	public float getMemberLength() {
		return memberLength;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getMemberID() {
		return memberID;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public int getDays() {
		return days;
	}

	public int getExerciseDays() {
		return exerciseDays;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public String getMemberExerciseDiff() {
		return memberExerciseDiff;
	}

	public float getMemberBMI() {
		return memberBMI;
	}
	
}
