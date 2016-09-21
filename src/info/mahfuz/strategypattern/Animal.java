/**
 * @author mahfuz
 * @date Sep 21, 2016
 */
package info.mahfuz.strategypattern;

class Animal {
	private String name;
	private String color;
	
	private Fly flyType;
	
	public Animal(String name) {
		this.setName(name);
		sound();
	}
	
	protected void sound() {
		
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the flyType
	 */
	public Fly getFlyType() {
		return flyType;
	}

	/**
	 * @param flyType the flyType to set
	 */
	public void setFlyType(Fly flyType) {
		this.flyType = flyType;
	}
}
