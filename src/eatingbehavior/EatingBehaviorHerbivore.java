package eatingbehavior;

/**
 * EatingBehaviorHerbivore
 * <p>
 * The eating behavior for herbivores.
 * 
 * @author William Lake
 *
 */
public class EatingBehaviorHerbivore implements EatingBehavior
{
	
	/**
	 * Runs the eating behavior of a herbivore.
	 */
	@Override
	public void eat()
	{
		System.out.println("Eating Leaves.");
	}

}
