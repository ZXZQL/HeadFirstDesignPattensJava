package design.patterns.strategy;

/**
 * 
 * @author QileZhang
 *
 */
public class FlyNoWay implements FlyBehavior
{
	public void fly()
	{
		System.out.println("I can't fly!");
	}
}
