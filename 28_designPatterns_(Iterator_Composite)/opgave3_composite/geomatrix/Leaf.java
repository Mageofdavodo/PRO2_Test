package geomatrix;

public class Leaf extends Figur {
	private double area;

	public Leaf(String name, double area) {
		super(name);
		this.area = area;
	}

	@Override
	public void draw() {
		System.out.println(name);
	}

	@Override
	public double getArea() {
		return area;
	}

}
