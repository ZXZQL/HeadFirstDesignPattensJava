/**
 * 
 */
package design.patterns.strategy;

/**
 * @author QileZhang
 */
public class MuteQuack implements QuackBehavior
{
	@Override
	public void quack()
	{
		System.out.println("<< Silence >>");
	}
}
