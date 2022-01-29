package br.com.designpatterns.gof.strategy;

public class BehaviorDefensive implements Behavior {

	@Override
	public void move() {
		System.out.println("Mr. Robot está se movendo de maneira defensiva!");
	}

}
