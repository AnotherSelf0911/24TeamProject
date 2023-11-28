package teamProject;

import java.util.Scanner;

public class ExerciseMain {

	//2-2 운동 시작 일자 출력 완료
	// 2-3 회원 정보 바꿀수 있는 기능 완료
	// (처음 몸무게 저장되게함)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberInfo memInfo = new MemberInfo();
		memInfo.init();
		memInfo.showMemberInfo();
		
		memInfo.InsertWeight(sc);
		memInfo.test10days();
		memInfo.showExerciseDays();
		memInfo.showWeight();
	}

}