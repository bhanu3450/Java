package com.app.fruit;

public class Mango extends Fruit {
    public Mango() {
    	super("Mango", true);
    }
    
    public String taste() {
    	return "sweet";
    }

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		super.accept();
	}
    
}
