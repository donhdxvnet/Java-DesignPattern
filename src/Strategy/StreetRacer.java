package Strategy;
public class StreetRacer extends Vehicle
{
	public StreetRacer()
	{
		setGoAlgorithm(new GoByDriving());
	}
}