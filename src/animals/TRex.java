package animals;

import eatingbehavior.EatingBehaviorCarnivore;
import walkingbehavior.WalkingBehaviorTwoLegs;

/**
 * TRex
 * <p>
 * Sets the walking and eating behavior of a T-Rex.
 * 
 * @see WalkingBehaviorTwoLegs
 * @see EatingBehaviorCarnivore
 * 
 * @author William Lake
 *
 */
public class TRex extends Animal
{

	public TRex()
	{
		setWalkingBehavior(new WalkingBehaviorTwoLegs());
		setEatingBehavior(new EatingBehaviorCarnivore());
	}

}
