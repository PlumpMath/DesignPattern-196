/**
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.strategypattern;

class Dog extends Animal{

	/**
	 * @param name
	 */
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		setFlyType(new CantFly());
	}
	
	public void sound() {
		System.out.println("Bark");
	}

}
