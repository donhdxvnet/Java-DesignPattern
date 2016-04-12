package Strategy;
public class FormulaOne extends Vehicle
{
	public FormulaOne()
	{
		setGoAlgorithm(new GoByDrivingFast());
	}
}