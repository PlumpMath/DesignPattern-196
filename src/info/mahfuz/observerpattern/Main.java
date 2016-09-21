/**
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.observerpattern;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StockItem aapl = new StockItem("AAPL", 100.00);
		StockItem goog = new StockItem("GOOG", 200.00);
		StockItem ibm = new StockItem("IBM", 300.00);
		
		Broker newYork = new Broker();
		Person mark = new Person("Mark", newYork);
		Person bark = new Person("Bark", newYork);
		newYork.setAAPL(aapl);
		newYork.setGOOG(goog);
		newYork.setIbm(ibm);
		
		Person havoc = new Person("Havoc", aapl);
		aapl.setPrice(101);
		newYork.setAAPL(aapl);

	}

}
