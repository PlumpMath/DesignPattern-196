/**
 * @project DesignPatterns
 * @package info.mahfuz.observerpattern
 * @author mahfuz
 * @date Sep 21, 2016
 * @time 8:10:14 PM
 */
package info.mahfuz.observerpattern;

class Person implements Observer {

	private String name;

	Person(String name) {
		setName(name);
	}
	
	Person(String name, Subject subject) {
		this(name);
		subject.register(this);
	}
	
	/* (non-Javadoc)
	 * @see info.mahfuz.observerpattern.Observer#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see info.mahfuz.observerpattern.Observer#update(info.mahfuz.observerpattern.StockItem)
	 */
	@Override
	public void update(StockItem item) {
		System.out.println(item.getName() + " has price " + item.getPrice());
		
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
