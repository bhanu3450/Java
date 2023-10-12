package com.app.fruit;

public class Apple extends Fruit {
     public Apple() {
    	 super("Apple", true);
     }
     
    public String taste() {
    	return "sweet n sour";
    }

	@Override
	public void accept() {
		super.accept();
	}
    
 
    
   
}
