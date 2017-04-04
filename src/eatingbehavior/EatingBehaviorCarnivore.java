package eatingbehavior;

/**
 * EatingBehaviorCarnivore
 * <p>
 * The eating behavior for carnivores.
 * 
 * @author William Lake
 *
 */
public class EatingBehaviorCarnivore implements EatingBehavior
{
	
	/**
	 * Runs the eating behavior of a carnivore.
	 */
	@Override
	public void eat()
	{
		System.out.println("Eating Meat.");
	}

}
