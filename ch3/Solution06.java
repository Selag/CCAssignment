package StackAndQueue;

import java.util.*;

public class Solution06{
	Queue<Dog> dog = new LinkedList<Dog>();
	Queue<Cat> cat = new LinkedList<Cat>();
	int count = 0;

	public void offer(Animal animal){
		animal.setAge(count);
		if (animal instanceof Dog){
			dog.offer(animal);
		} else {
			cat.offer(animal);
		}
		count ++;
	}

	public Animal dequeueAny(){
		if (dog.size() == 0) {
			return cat.dequeue();
		} else if (cat.size() == 0) {
			return dog.dequeue();
		}

		int dogage = dog.peek().age;
		int catage = cat.peek().age;
		if (dogage < catage) return dog.dequeue();
		else return cat.dequeue();
	}

	public Dog dequeueDogs(){
		return dog.dequeue();
	}
	public Cat dequeueDogs(){
			return cat.dequeue();
		}

}

abstract class Animal {
	public int age;
	protected String name;

	public Animal(String n) {
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
}

class Dog extends Animal{
	public Dog(String val) {
		super(val);
	}
}

class Cat extends Animal{
	public Cat(String val) {
		super(val);
	}
}