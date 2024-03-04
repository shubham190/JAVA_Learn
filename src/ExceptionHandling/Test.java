package ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("Begning");
		int divide=10/0;
		System.out.println(divide);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occur");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Ending");

	}

}
