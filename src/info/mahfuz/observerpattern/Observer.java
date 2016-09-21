/**
 * DesignPatterns
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.observerpattern;

interface Observer {
	String getName();
	void update(StockItem item);
}
