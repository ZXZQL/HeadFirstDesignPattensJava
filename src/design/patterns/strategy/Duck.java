package design.patterns.strategy;

/**
 * @author QileZhang
 */
public abstract class Duck
{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck()
	{
	}

	/*	public Duck(FlyBehavior fly, QuackBehavior quack)
		{
			this.flyBehavior = fly;
			this.quackBehavior = quack;
		}
	*/
	public abstract void display();

	public void setFlyBehavior(FlyBehavior flyBehavior)
	{
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBahavior(QuackBehavior quackBahavior)
	{
		this.quackBehavior = quackBahavior;
	}

	public void performQuack()
	{
		quackBehavior.quack();
	}

	public void performFly()
	{
		flyBehavior.fly();
	}

	public void swim()
	{
		System.out.println("All ducks float, even decoys!");
	}
}
