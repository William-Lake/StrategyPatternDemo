package animals;

import eatingbehavior.EatingBehaviorHerbivore;
import walkingbehavior.WalkingBehaviorFourLegs;

/**
 * Mouse
 * <p>
 * Sets the walking and eating behavior of a Mouse.
 * 
 * @see WalkingBehaviorFourLegs
 * @see EatingBehaviorHerbivore
 * 
 * @author William Lake
 *
 */
public class Mouse extends Animal
{

	public Mouse()
	{
		setWalkingBehavior(new WalkingBehaviorFourLegs());
		setEatingBehavior(new EatingBehaviorHerbivore());
	}

}
