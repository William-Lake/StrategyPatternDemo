package eatingbehavior;

/**
 * EatingBehavior
 * <p>
 * The interface for all eating behaviors.
 * 
 * @author William Lake
 *
 */
public interface EatingBehavior
{
	/**
	 * The generic eating method, to be overridden by the implementing classes to specify
	 * custom behavior.
	 */
	public void eat();
}
