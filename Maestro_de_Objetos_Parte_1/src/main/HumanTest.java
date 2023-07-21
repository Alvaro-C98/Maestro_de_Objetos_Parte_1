package main;

import subclasses.Ninja;
import subclasses.Samurai;
import subclasses.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samurai jack = new Samurai("Jack");
		Wizard gandalf = new Wizard("Gandalf");
		Ninja raiden = new Ninja("Raiden");
		
		jack.attack(raiden);
		gandalf.attack(jack);
		raiden.attack(gandalf);
		
	}

}
