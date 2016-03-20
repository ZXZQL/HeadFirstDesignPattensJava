
package design.patterns.observer;

/**
 * @author QileZhang
 * @category Subject Interface
 */
public interface Subject
{
	public abstract boolean registerObserver(Observer o);

	public abstract boolean removeObserver(Observer o);

	public abstract boolean notifyObservers();
}
