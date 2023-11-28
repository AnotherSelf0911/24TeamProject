 /*Store 클래스, Item 클래스, StoreMain클래스 생성해주세요.
Item 클래스는 제품명과 가격을 가지고 있습니다.
Store 클래스는 제품들의 배열, 오늘의매출, 총매출을 가지고 있습니다.


재고 목록을 보여주는 showInventory 메서드와
오늘의 매출을 보여주는 showTodaySales메서드와 
총 매출을 보여주는 showTotalSale 메서드 구현해주세요

Store의 초기 재고와 매출액을 설정해주세요.

초기 총 매출액은 2000000원입니다.

초기 재고 목록은 다음과 같습니다.

1. 신선품, 5000원
2. 고기, 8000원
3. 의류, 10000원
4. 전자제품, 20000원
5. 가구, 50000원

StoreMain클래스에서  
재고 목록과
오늘의 매출,
총 매출액을 출력해주세요.
(모든 제품을 하나씩 판매했을 때를 가정해주세요.)*/



//결과 화면

/*=========재고 목록========
1. 신선품, 5000원
2. 고기, 8000원
3. 의류, 10000원
4. 전자제품, 20000원
5. 가구, 50000원

오늘의 매출은 93000원 입니다.
총 매출액은 2093000.0입니다.*/
package shopingmall;

public class item {
	//제품명
	String name;
	//가격
	int price;
	
	//이름, 가격 생성자
	public item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}


