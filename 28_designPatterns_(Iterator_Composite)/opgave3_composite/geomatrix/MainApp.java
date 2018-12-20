package geomatrix;

public class MainApp {

	public static void main(String[] args) {
		Figur firkant1 = new Leaf("Firkant1", 100.0);
		Figur firkant2 = new Leaf("Firkant2", 300.0);
		Figur firkant3 = new Leaf("Firkant3", 53.3);

		Component<Figur> samling = new Component<Figur>("Samling");
		samling.add(firkant1);
		samling.add(firkant2);
		samling.add(firkant3);

		samling.draw();
		System.out.println(samling.getArea());

		Figur firkant4 = new Leaf("Firkant4", 86.0);
		Figur firkant5 = new Leaf("Firkant5", 140.0);
		Figur firkant7 = new Leaf("Firkant7", 59.3);

		Component<Figur> samling2 = new Component<Figur>("samling inde i samling");

		samling2.add(firkant4);
		samling2.add(firkant5);
		samling2.add(firkant7);

		samling.add(samling2);
		samling.draw();
		System.out.println(samling.getArea());
	}

}
