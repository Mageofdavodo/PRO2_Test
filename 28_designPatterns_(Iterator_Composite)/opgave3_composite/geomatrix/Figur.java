package geomatrix;

public abstract class Figur {
	public String name;

	public Figur(String name) {
		this.name = name;
	}

	public void draw() {
		System.out.println(name);
	}

	public double getArea() {
		return 0.0;
	}

}
