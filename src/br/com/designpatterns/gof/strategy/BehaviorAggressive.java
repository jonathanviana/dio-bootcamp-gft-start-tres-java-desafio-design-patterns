package br.com.designpatterns.gof.strategy;

public class BehaviorAggressive implements Behavior {

	@Override
	public void move() {
		System.out.println("Mr. Robot está se movendo de maneira agressiva!");
	}

}
