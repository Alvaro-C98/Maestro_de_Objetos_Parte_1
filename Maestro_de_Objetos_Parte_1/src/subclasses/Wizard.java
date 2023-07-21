package subclasses;

import classes.Human;

public class Wizard extends Human{

	public Wizard(String name) {
		setName(name);
	}
	
	public void attack (Human obj) {
		System.out.println("\n"+"�"+getName()+" ataco a "+obj.getName()+"!");
		obj.setHealth(obj.getHealth()-getStrenth());
		System.out.println("Vida de "+getName()+": "+getHealth());
		System.out.println("Vida de "+obj.getName()+": "+obj.getHealth());
	}
}
