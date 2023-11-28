package shopingmall;

public abstract class Member{
	
	//회원번호
	protected int memberNum;
	
	//회원이름
	protected String name;
	
	//회원전화번호
	protected String phone;
	
	//가격?
	protected int balance;
	
	//포인트
	protected int bonusPoint;
	
	//추가할인율
	protected float bonusRatio;
	
	//멤버메서드
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
}
