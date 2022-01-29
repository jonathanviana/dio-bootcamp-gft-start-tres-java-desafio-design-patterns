package br.com.designpatterns.gof.application;

import br.com.designpatterns.gof.singleton.SingletonLazyHolder;
import br.com.designpatterns.gof.strategy.BehaviorAggressive;
import br.com.designpatterns.gof.strategy.BehaviorStandard;
import br.com.designpatterns.gof.facade.Facade;
import br.com.designpatterns.gof.singleton.SingletonEager;
import br.com.designpatterns.gof.singleton.SingletonLazy;
import br.com.designpatterns.gof.strategy.Behavior;
import br.com.designpatterns.gof.strategy.BehaviorDefensive;
import br.com.designpatterns.gof.strategy.MrRobot;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		
		// Singleton

		System.out.println("ESPAÇO DE MEMÓRIA SINGLETON LAZY: ");
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		System.out.println("\nESPAÇO DE MEMÓRIA SINGLETON EAGER: ");
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);

		System.out.println("\nESPAÇO DE MEMÓRIA SINGLETON LAZY HOLDER: ");
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Behavior defensive = new BehaviorDefensive();
		Behavior standard = new BehaviorStandard();
		Behavior aggressive = new BehaviorAggressive();
		
		MrRobot mrRobot = new MrRobot();
		System.out.println("\nREGISTRO DE MOVIMENTOS DO MR. ROBOT: ");
		mrRobot.setBehavior(standard);
		mrRobot.move();
		mrRobot.setBehavior(defensive);
		mrRobot.move();
		mrRobot.setBehavior(aggressive);
		mrRobot.move();

		// Facade
		Facade facade = new Facade();
		facade.migrateClient("Sapiens", "90020180");
	}

}
