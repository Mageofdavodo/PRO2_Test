package geomatrix;

import java.util.ArrayList;

public class Component<T extends Figur> extends Figur {
	private ArrayList<T> elements;

	public Component(String name) {
		super(name);
		elements = new ArrayList<T>();
	}

	@Override
	public double getArea() {
		double total = 0.0;
		for (T t : elements) {
			total += t.getArea();
		}
		return total;
	}

	@Override
	public void draw() {
		System.out.println(name);
		for (T t : elements) {
			t.draw();
		}
	}

	public void add(T t) {
		this.elements.add(t);
	}

}
