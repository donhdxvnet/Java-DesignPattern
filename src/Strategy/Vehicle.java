package Strategy;
public abstract class Vehicle
{
	private GoAlgorithm goAlgorithm;
	
	public Vehicle()
	{
		
	}
	
	public void setGoAlgorithm(GoAlgorithm algo)
	{
		goAlgorithm = algo;
	}
	
	public void go()
	{
		goAlgorithm.go();
	}
}