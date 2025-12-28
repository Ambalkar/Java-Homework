package method_Project;

public class TestCalci {
	public static void main(String [] args) {
		System.out.println("Start of main method");
		Calculator c1 = new Calculator();
		//double var = c1. addThree(10, 20.5,30);
		double var = c1. avgThree(10, 20.5,30);
		System.out.println(var);
		System.out.println("End of main method");
	}

}
