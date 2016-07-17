package com.designpattern.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}