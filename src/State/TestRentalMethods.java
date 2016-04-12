package State;

public class TestRentalMethods
{	
	RentalMethods rentalMethods;
	
	public static void main(String args[])
	{
		TestRentalMethods t = new TestRentalMethods();
	}
	
	public TestRentalMethods() {
		rentalMethods = new RentalMethods(9);
		rentalMethods.getApplication();
		rentalMethods.checkApplication();
	}

}
