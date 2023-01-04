package com.in28minutes.learnspringframework.game;

public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Up-Jump");

	}

	@Override
	public void down() {
		System.out.println("Down-Sit");

	}

	@Override
	public void left() {
		System.out.println("left-run");

	}

	@Override
	public void right() {
		System.out.println("right-Fire");

	}

}
