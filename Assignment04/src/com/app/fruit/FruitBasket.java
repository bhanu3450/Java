package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu() {
		System.out.println("----------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3 Add apple");
		System.out.println("4. Display names of all fruits in basket");
		System.out.println("5. Display everything");
		System.out.println("6. Display taste of all stale fruits");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");
		System.out.println("Enter choice");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("------------------------");
		return choice;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		int index = 0;
		System.out.println("enter the size of basket");
		int size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
//     FruitBasket f1;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (index < size) {
				basket[index] = new Mango();
				basket[index].accept();
//				basket[index].display();
//					Mango mango = new Mango();
//					mango.accept();
//					basket[index] = mango;
					index++;
				} else
					System.out.println("basket size exceeded");
				break;

			case 2:
				if (index < size) {
					Orange orange = new Orange();
//				f1 = new Orange();
					orange.accept();
					basket[index] = orange;
					index++;
				} else
					System.out.println("basket size exceeded");
				break;

			case 3:
				if (index < size) {
					Apple apple = new Apple();
					apple.accept();
					basket[index] = apple;
					index++;
				} else
					System.out.println("basket size exceeded");
				break;

			case 4:
				for (Fruit b : basket) {
					if (b != null)
						System.out.println(b.getName());
				}
				break;

			case 5:
				for (Fruit b : basket) {
					if (b != null) {
						System.out.println("details :" + b.toString());
						System.out.println("Taste of the fruits are :" + b.taste());
						System.out.println();
					}
				}
				break;

			case 6:
				for (Fruit b : basket) {
					if (b != null && b.getFresh() == false) {
						System.out.println("Taste of stale fruits : " + b.taste());
					}
				}
				break;

			case 7:
				System.out.println("Enter the index of the fruit which you want to make stale ");
				int i = sc.nextInt();
				if (i < 0 || i >= index) {
					System.out.println("Error.....enter a valid index");
				} else {
					basket[i].setFresh(false);
				}
				break;
				
			case 8:
				for (Fruit fruit : basket) {
//					if(fruit instanceof Orange)
					if(fruit!=null) {
					if(fruit.taste().contains("sour"))
						fruit.setFresh(false);
					}
				}
                 break;
			default:
				System.out.println("Wrong choice entered");
				break;
			}

		}
		sc.close();

	}
}
