package Strategy;
public class Helicopter extends Vehicle
{
	public Helicopter()
	{
		setGoAlgorithm(new GoByFlying());
	}
}