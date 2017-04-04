package walkingbehavior;

/**
 * WalkingBehvioarTwoLegs
 * <p>
 * The walking behavior for two legged animals.
 * 
 * @author William Lake
 *
 */
public class WalkingBehaviorTwoLegs implements WalkingBehavior
{

	/**
	 * Runs the walking behavior of a two legged animal.
	 */
	@Override
	public void walk()
	{
		System.out.println("Walking on two legs.");
	}

}
