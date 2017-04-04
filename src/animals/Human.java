package animals;

import eatingbehavior.EatingBehaviorOmnivore;
import walkingbehavior.WalkingBehaviorTwoLegs;

/**
 * Human
 * <p>
 * Sets the walking and eating behavior for a typical human.
 * 
 * @see WalkingBehaviorTwoLegs
 * @see EatingBehaviorOmnivore
 * 
 * @author William Lake
 *
 */
public class Human extends Animal
{

	public Human()
	{
		setWalkingBehavior(new WalkingBehaviorTwoLegs());
		setEatingBehavior(new EatingBehaviorOmnivore());
	}

}
