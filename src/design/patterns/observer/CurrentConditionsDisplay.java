package design.patterns.observer;

/*
 * 目前状况布告板
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer
{
	private float temperature;
	private float humidity;
	private Subject weatherData;

	/*
	 * 构造函数
	 * 提供可观察者对象
	 */
	public CurrentConditionsDisplay(Subject subject)
	{
		this.weatherData = subject;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display()
	{
		System.out.print("Current conditions:" + temperature + "F degrees and ");
		System.out.println(humidity + "% humidity.");
	}
}
