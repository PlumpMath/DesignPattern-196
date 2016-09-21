/**
 * @project DesignPatterns
 * @package info.mahfuz.observerpattern
 * @author mahfuz
 * @date Sep 21, 2016
 * @time 8:13:50 PM
 */
package info.mahfuz.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Broker implements Subject {

	List<Observer> observers;
	private StockItem aapl;
	private StockItem goog;
	private StockItem ibm;
	
	public Broker() {
		observers = new ArrayList<Observer>();
	}
	
	/* (non-Javadoc)
	 * @see info.mahfuz.observerpattern.Subject#register(info.mahfuz.observerpattern.Observer)
	 */
	@Override
	public void register(Observer o) {
		observers.add(o);

	}

	/* (non-Javadoc)
	 * @see info.mahfuz.observerpattern.Subject#unregister(info.mahfuz.observerpattern.Observer)
	 */
	@Override
	public void unregister(Observer o) {
		int index = observers.indexOf(o);
		if (index == -1) {
			System.err.println("Observer not found");
		}
		System.out.println(o.getName() + " has been removed");
		observers.remove(index);
	}

	/* (non-Javadoc)
	 * @see info.mahfuz.observerpattern.Subject#notifyObserver()
	 */
	@Override
	public void notifyObserver(StockItem item) {
		for(Observer o: observers) {
			System.out.println(o.getName());
			o.update(item);
		}
	}

	/**
	 * @return the aapl
	 */
	public StockItem getAAPL() {
		return aapl;
	}

	/**
	 * @param aapl the aapl to set
	 */
	public void setAAPL(StockItem aapl) {
		this.aapl = aapl;
		notifyObserver(this.aapl);
	}

	/**
	 * @return the goog
	 */
	public StockItem getGOOG() {
		return goog;
	}

	/**
	 * @param goog the goog to set
	 */
	public void setGOOG(StockItem goog) {
		this.goog = goog;
		notifyObserver(this.goog);
	}

	/**
	 * @return the ibm
	 */
	public StockItem getIbm() {
		return ibm;
	}

	/**
	 * @param ibm the ibm to set
	 */
	public void setIbm(StockItem ibm) {
		this.ibm = ibm;
		notifyObserver(this.ibm);
	}

}
