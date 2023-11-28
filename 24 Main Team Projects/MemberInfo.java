package teamProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberInfo {
	Member mem;
	SimpleDateFormat fm;
	
	public void init() {
		Date now = new Date();
		fm = new SimpleDateFormat("yy년,MM월,dd일");
		
		mem = new Member("임요한1", now);
		mem.memberWeight = 100;
		mem.Startweight = mem.memberWeight;
	}
	
	public void test10days() {
		mem.exerciseDays = 10;
		mem.memberWeight = 200;
	}
	
	public void InsertWeight(Scanner sc) {
		System.out.println("몸무게 입력");
		float weight = sc.nextFloat();
		
		mem.memberWeight = weight;
	}
	
	public void showMemberInfo() {
		System.out.println(mem.memberName + "님의 정보");
		showExerciseDays();
		System.out.println(mem.memberName + "의 현재 몸무게" + mem.memberWeight);
	}
	
	public void showWeight() {
		System.out.println(mem.memberName + "의 처음 몸무게" + mem.Startweight);
		System.out.println(mem.memberName + "의 현재 몸무게" + mem.memberWeight);
	}
	public void showExerciseDays() {
		
		System.out.println(fm.format(mem.startDate) + "로부터 " + mem.exerciseDays  + "일 지났습니다.");
	}
}