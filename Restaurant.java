package packagetest.restaurant;

public class Restaurant {

		public static void main(String[] args) {
			RestaurantServices restServices = new RestaurantServices();
			
			
			restServices.cleanFloor();
			restServices.cleanTable();
			Order order = restServices.takeOrder(5, 0, null, null, null, null);
			Food food = restServices.prepareFood(order);
			restServices.serveFood(food);
			
		}
		
		
}
