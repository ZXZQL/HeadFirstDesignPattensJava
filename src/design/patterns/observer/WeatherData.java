package design.patterns.observer;

import java.util.ArrayList;

/**
 * @author QileZhang
 */
public class WeatherData implements Subject
{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}
	/* 
	 * 添加观察者
	 */
	@Override
	public boolean registerObserver(Observer o)
	{
		observers.add(o);
		return true;
	}

	/* 
	 * 移除观察者
	 */
	@Override
	public boolean removeObserver(Observer o)
	{
		if (observers.contains(o))
		{
			observers.remove(o);
			return true;
		}
		return false;
	}

	/* 
	 * 通知所有观察者
	 */
	@Override
	public boolean notifyObservers()
	{
		for (Observer obs : observers)
		{
			obs.update(temperature, humidity, pressure);
		}
		return false;
	}

	/*
	 * 从气象站检测到更新时，通知观察者
	 */
	public void measurementsChanged()
	{
		notifyObservers();
	}

	/*
	 * 气象数据发生变化
	 */
	public void setMeasurements(float temp, float humidity, float pressure)
	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
