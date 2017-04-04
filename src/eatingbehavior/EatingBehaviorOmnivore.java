package eatingbehavior;

/**
 * EatingBehaviorOmnivore
 * <p>
 * The eating behavior for omnivores.
 * 
 * @author William Lake
 *
 */
public class EatingBehaviorOmnivore implements EatingBehavior
{
	
	/**
	 * Runs the eating behavior of an omnivore.
	 */
	@Override
	public void eat()
	{
		System.out.println("Eating Leaves and Meat.");
	}

}
