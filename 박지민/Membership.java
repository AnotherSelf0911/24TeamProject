package shopingmall;

public interface Membership {
	
	//회원 번호는 1000번부터 시작
	int MEMBER_ID = 1000;
	
	//회원관련 메서드
	void createAccount();
	
	//회원관련 화면
	void showMemberInfo();
	
	//회원정보 수정
	void changeMemberInfo();
	
	//장바구니
	void shoppingBasket(item item);
}
