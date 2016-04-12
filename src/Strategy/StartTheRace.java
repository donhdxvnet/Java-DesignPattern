package Strategy;
/**
 * 
 */

/**
 * @author xuan
 *
 */
public class StartTheRace {

	/**
	 * 
	 */
	public StartTheRace() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		StreetRacer streetRacer = new StreetRacer();
		Helicopter helicopter = new Helicopter();
		FormulaOne formularOne = new FormulaOne();
		Jet jet = new Jet();
		
		streetRacer.go();
		helicopter.go();
		formularOne.go();
		jet.go();

	}

}