/**
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.strategypattern;

class Bird extends Animal{

	/**
	 * @param name
	 */
	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		setFlyType(new CanFly());
	}
	
	public void sound() {
		System.out.println("Tweet");
	}

}
