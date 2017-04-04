package walkingbehavior;

/**
 * WalkingBehvioarTwoLegs
 * <p>
 * The walking behavior for four legged animals.
 * 
 * @author William Lake
 *
 */
public class WalkingBehaviorFourLegs implements WalkingBehavior
{
	
	/**
	 * Runs the walking behavior of a four legged animal.
	 */
	@Override
	public void walk()
	{
		System.out.println("Walking on four legs.");
	}

}
