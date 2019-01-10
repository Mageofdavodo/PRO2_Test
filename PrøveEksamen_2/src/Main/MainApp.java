package Main;

import java.util.ArrayList;
import java.util.List;

import model.Abonnement;
import model.TimePakke;
import model.UdvidelsesesPakke;

public class MainApp {
	public static void main(String[] args) {

		Abonnement ab1 = new Abonnement(150, 0.5);
		Abonnement tp1 = new TimePakke(160, 0.4, 8);
		Abonnement up1 = new UdvidelsesesPakke(200, 0.3, 10, 30.5);

		ArrayList<Abonnement> list = new ArrayList<>();
		list.add(ab1);
		list.add(tp1);
		list.add(up1);

		System.out.println("Prisen for ab1: " + ab1.abonnementsPris());
		System.out.println("Prisen for tp1: " + tp1.abonnementsPris());
		System.out.println("Prisen for up1: " + up1.abonnementsPris());
		System.out.println("Prisen for alle abonnementer i  listen: " + sumOfAll(list));
	}

	public static double sumOfAll(List<Abonnement> list) {
		double total = 0;
		for (Abonnement abonnement : list) {
			total += abonnement.abonnementsPris();
		}
		return total;
	}
}