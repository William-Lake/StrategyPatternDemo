package walkingbehavior;

/**
 * WalkingBehavior
 * <p>
 * The interface for all walking behaviors.
 * 
 * @author William Lake
 *
 */
public interface WalkingBehavior
{
	/**
	 * The generic walking method, to be overridden by the implementing classes to specify
	 * custom behavior.
	 */
	public void walk();
}
