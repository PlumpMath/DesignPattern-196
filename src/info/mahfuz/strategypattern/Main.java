/**
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.strategypattern;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog("Tommy");
		Bird bird = new Bird("Sweety");
		
		System.out.println(dog.getFlyType().fly());
		System.out.println(bird.getFlyType().fly());

	}

}
