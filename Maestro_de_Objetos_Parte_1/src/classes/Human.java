package classes;

public class Human {
	protected String name;
	protected int strenth=3;
	protected int intelligence=3;
	protected int stealth=3;
	protected int health=100;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;	
	}
	
	public int getStrenth() {
		return strenth;
	}
	
	public void setStrenth(int strenth) {
		this.strenth = strenth;
	}

	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
}
