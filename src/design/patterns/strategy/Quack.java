package design.patterns.strategy;

/**
 * @author QileZhang
 *
 */
public class Quack implements QuackBehavior
{
	@Override
	public void quack()
	{
		System.out.println("Quack.");		
	}
}
