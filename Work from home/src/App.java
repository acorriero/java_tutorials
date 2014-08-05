
public class App {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();

	}
	
	private static void displayGreeting() {
		System.out.println("Hello Happy sales people!");
		System.out.println("This is app shows sales data");
		System.out.println("I've made another change");
		
	}

}
