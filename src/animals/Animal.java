package animals;

import eatingbehavior.EatingBehavior;
import walkingbehavior.WalkingBehavior;

/**
 * Animal
 * <p>
 * The abstract base class, containing the walking and eating behavior objects
 * in addition to the methods for setting and triggering them.
 * 
 * @author William Lake
 *
 */
public abstract class Animal
{
	private WalkingBehavior walkingBx;
	private EatingBehavior eatingBx;
	
	/**
	 * Triggers the walking behavior.
	 */
	public void walk()
	{
		walkingBx.walk();
	}
	
	/**
	 * Triggers the eating behavior.
	 */
	public void eat()
	{
		eatingBx.eat();
	}
	
	/**
	 * Sets the walking behavior object.
	 * 
	 * @param walkingBx
	 * 			The walking behavior object.
	 */
	public void setWalkingBehavior(WalkingBehavior walkingBx)
	{
		this.walkingBx = walkingBx;
	}
	
	/**
	 * Sets the eating behavior object.
	 * 
	 * @param eatingBx
	 * 			The eating behavior object.
	 */
	public void setEatingBehavior(EatingBehavior eatingBx)
	{
		this.eatingBx = eatingBx;
	}
}
