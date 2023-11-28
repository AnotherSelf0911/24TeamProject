package shopingmall;

import gkstnarmawl.Item;

public class Store implements Shoping, Membership{
	
	protected item[] inventory; //재고
	protected item[] baskets; // 자바구니
	protected Member member; // 멤버
	
	public Store() {
		baskets = new item[50];
		inventory = new item[50];
	}
	
	item[] inven = new item[5];

	public void init() {
		inven[0] = new item("점퍼",11000);
		inven[1] = new item("점퍼",11000);
		inven[2] = new item("점퍼",11000);
		inven[3] = new item("점퍼",11000);
		inven[4] = new item("점퍼",11000);
	}

	

	@Override
	public void shoppingBasket(item item) {
		
		for (int i = 0; i < baskets.length; i++) {
			if(baskets[i] != null) {
				continue;
			}
			else {
				baskets[i] = item;
			}
		}
		
	}
	public void pay(int balance) {
		
		int sum = calcPrice();
		member.balance -= sum;
	}
	
	public int calcPrice() {
		int sum = 0;
		for (int i = 0; i < baskets.length; i++) {
			sum += baskets[i].price;
		}
		return sum;
	}



	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void showMemberInfo() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void changeMemberInfo() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void shoppingBasket(Item m) {
		// TODO Auto-generated method stub
		
	}
	
}
