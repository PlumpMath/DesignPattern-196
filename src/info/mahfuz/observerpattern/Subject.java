/**
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.observerpattern;

interface Subject {
	void register(Observer o);
	void unregister(Observer o);
	/**
	 * @param item
	 */
	void notifyObserver(StockItem item);
}
