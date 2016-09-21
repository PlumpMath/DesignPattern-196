/**
 * @project DesignPatterns
 * @package info.mahfuz.observerpattern
 * @author mahfuz
 * @date Sep 21, 2016
 * @time 8:25:44 PM
 */
package info.mahfuz.observerpattern;

import java.util.ArrayList;
import java.util.List;

class StockItem implements Subject {
	private String name;
	private double price;
	private List<Observer> observers;
	
	public StockItem(String name, double price) {
		observers = new ArrayList<Observer>();
		setName(name);
		setPrice(price);
	}
	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	void setPrice(double price) {
		this.price = price;
		notifyObserver(this);
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
			o.update(this);
		}
	}
	

}
