package packagetest.restaurant;

public class RestaurantServices extends cleaningServices implements kitchenServices,diningServices {

	@Override
	public void serveFood(Food food) {
		
		System.out.println("Serving food at "+food.order.getTableNo());
		// TODO Auto-generated method stub
	}

	@Override
	public Order takeOrder(int tableNo,int seatNo,String soup,String starter,String mainCourse,String dessert){
		System.out.println("Taking Order for Table no "+tableNo);
		Order order = new Order(tableNo, seatNo, soup, starter, mainCourse, dessert);
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public Food prepareFood(Order order) {
		Food food = new Food(order);
		// TODO Auto-generated method stub
		System.out.println("Food is being prepared");
		return food;
	}

	@Override
	public void cleanDishes(Dishes dishes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void cleanFloor() {
		// TODO Auto-generated method stub
		System.out.println("cleaning Floor");
	}
	
	
	
	
}

interface kitchenServices {
	
	Food prepareFood(Order order);
	void cleanDishes(Dishes dishes);
	
}

interface diningServices{
	void serveFood(Food food);
	Order takeOrder(int tableNo,int seatNo,String soup,String starter,String mainCourse,String dessert);
}

abstract class cleaningServices {
	
	abstract void cleanFloor();
	void cleanTable() {
		System.out.println("cleaning Tables");
	}
	
}
