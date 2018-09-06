package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Counter;
import processing.core.PApplet;

public class CounterView extends Observer {

	Counter counter;

	public CounterView(PApplet display, Counter subject) {
		super(display, subject);
		this.counter = subject;
		update();
	}

	public void update() {
		display.background(204);
		display.fill(0);
		display.rect(counter.getCount(), 10, 10, 10);
		display.redraw();
	}

}
