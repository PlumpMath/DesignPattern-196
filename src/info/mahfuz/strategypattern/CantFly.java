/**
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.strategypattern;

class CantFly implements Fly {

	/* (non-Javadoc)
	 * @see info.mahfuz.strategypattern.Fly#fly()
	 */
	@Override
	public String fly() {
		return "I can't fly";
	}

}
