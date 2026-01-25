package oop_exam;

public class RestaurantTest {
    public static void main(String[] args) {
    	//레스토랑 설정
    	Restaurant VIPS = new Restaurant("VIPS", 190, 19, 0);
    	Restaurant test = new Restaurant("test", 190, 19, 0);
    	//해당 레스토랑의 메뉴 설정
    	Menu[] menus = {
    			new Menu(VIPS,"메뉴 1", 5000, 50, 0,200),
    			new Menu(VIPS,"메뉴 2", 10000, 100, 0,200),
    			new Menu(VIPS,"메뉴 3", 8000, 80, 0,200),
    			new Menu(VIPS,"메뉴 4", 4000, 10, 6.0,200),
    			new Menu(VIPS,"메뉴 5", 6000, 20, 19.0,200)
    	};

        //손님설정
        Customer customer1 = new Customer("손님1", 0, 0, 30000);
        
        
        customer1.order(VIPS, menus[4]);
        customer1.order(VIPS, menus[2]);
        customer1.order(VIPS, menus[1]);
        customer1.order(VIPS, menus[0]);
        customer1.order(VIPS, menus[3]);
        
        VIPS.printInformation(menus);
        
        
    }
}

/*
출력 예시

고객명 : 고객1
고객1의 취함 정도 : 0.0
고객1의 배부름 정도 : 0
고객1의 소지금: 50000
주문 금액: 5000
VIPS식당의 취함 기준: 10.0
주문 성공

 */