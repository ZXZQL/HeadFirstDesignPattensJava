    package design.patterns.strategy;

/**
 * Main Function
 * 
 * @author QileZhang
 */
public class MainFunc
{
	public static void main(String[] args)
	{
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.swim();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.swim();
	}
}