package br.com.designpatterns.gof.strategy;

public class MrRobot {
	
	private Behavior behavior;

	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	
	public void move() {
		behavior.move();
	}
}
