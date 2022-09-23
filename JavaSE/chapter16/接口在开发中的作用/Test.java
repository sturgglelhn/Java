public class Test{
	public static void main(String[] args){
		FoodMenu cooker1 = new ChinaCooker();
		Customer customer = new Customer(cooker1);
		
		customer.order();
	}
}