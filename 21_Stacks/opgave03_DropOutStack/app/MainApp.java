package app;

import model.DropOutStackArray;

public class MainApp {
	public static void main(String[] args) {
		DropOutStackArray<Integer> dropArray = new DropOutStackArray<>(5);
		dropArray.push(5);
		dropArray.push(5);
		dropArray.push(5);
		dropArray.push(5);
		dropArray.push(5);
		System.out.println(dropArray.print());
		dropArray.push(10);
		System.out.println(dropArray.print());
	}

}
