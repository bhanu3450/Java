package com.app.fruit;

public class Orange extends Fruit {
   public Orange() {
	   super("Orange", true);
   }
   public String taste() {
   	return "sour";
   }
@Override
public void accept() {
	super.accept();
}
   
   
   
}
