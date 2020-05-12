//Kevin, Jahreiss; Melanie Urbas; Karasz David

import java.util.Random;

public class TimeManagement {

	public static void main(String[] args) {
		
		//Manuell erstelltes Objekt
		TimeAdmin test = new TimeAdmin();
		
		//addTime wird ohne vorheriges addName getestet
		test.addTime("Kevin", 8.0);
		test.addTime("Kevin", 6.5);
		
		//addName wird getestet
		test.addName("Raphael");
		
		//Hier werden alle Methoden an einer hashMap getestet, die einen Key mit Werten und einen Key ohne Werte enthaelt
		//Zudem wird hier immer wieder nach einem Key gefragt, der nicht in der map enthalten ist
		System.out.println(test.toString());
		System.out.println(test.workingDays("Kevin"));
		System.out.println(test.workingDays("Raphael"));
		System.out.println(test.workingDays("Raphaelo"));
		System.out.println(test.getAverage("Kevin"));
		System.out.println(test.getAverage("Raphael"));
		System.out.println(test.getAverage("Raphaelo"));
		System.out.println(test.getTimeSum("Kevin"));
		System.out.println(test.getTimeSum("Raphael"));
		System.out.println(test.getTimeSum("Raphaelo"));
		System.out.println(test.getTimeList("Kevin"));
		System.out.println(test.getTimeList("Raphael"));
		System.out.println(test.getTimeList("Raphaelo"));
		System.out.println(test.size());
		System.out.println();
		
		//Hier werden nochmals size und toString getestet; diesmal enthalten aber beide Keys Werte
		test.addTime("Raphael", 3.5);
		test.addTime("Raphael", 7);
		System.out.println(test.size());
		System.out.println(test.toString());
		
		//Im folgenden werden fuenf Maps erstellt, die mit einer zufaelligen Anzahl an Keys mit zufaelligen Werten gefuellt werden
		TimeAdmin A1 = new TimeAdmin();
		TimeAdmin A2 = new TimeAdmin();
		TimeAdmin A3 = new TimeAdmin();
		TimeAdmin A4 = new TimeAdmin();
		TimeAdmin A5 = new TimeAdmin();

		//Zufaellige Key-Erstellung
		for(int i = 0; i < new Random().nextInt(40); i++) 
			A1.addName("Person" + i);
		for(int i = 0; i < new Random().nextInt(40); i++) 
			A2.addName("Person" + i);
		for(int i = 0; i < new Random().nextInt(40); i++) 
			A3.addName("Person" + i);
		for(int i = 0; i < new Random().nextInt(40); i++) 
			A4.addName("Person" + i);
		for(int i = 0; i < new Random().nextInt(40); i++) 
			A5.addName("Person" + i);
		
		//Zufaellige Werte-Erstellung + zufaeliige Anzahl an Werten
		for(int i = 0; i < A1.size(); i++) {
			for(int j = 0; j < new Random().nextInt(20); j++) {
				A1.addTime("Person" + i, (double)new Random().nextInt(200) / 2);
			}
		}
		for(int i = 0; i < A2.size(); i++) {
			for(int j = 0; j < new Random().nextInt(20); j++) {
				A2.addTime("Person" + i, (double)new Random().nextInt(200) / 2);
			}
		}
		for(int i = 0; i < A3.size(); i++) {
			for(int j = 0; j < new Random().nextInt(20); j++) {
				A3.addTime("Person" + i, (double)new Random().nextInt(200) / 2);
			}
		}
		for(int i = 0; i < A5.size(); i++) {
			for(int j = 0; j < new Random().nextInt(20); j++) {
				A4.addTime("Person" + i, (double)new Random().nextInt(200) / 2);
			}
		}
		for(int i = 0; i < A5.size(); i++) {
			for(int j = 0; j < new Random().nextInt(20); j++) {
				A5.addTime("Person" + i, (double)new Random().nextInt(200) / 2);
			}
		}
		
		//Testen aller Methoden an einer, aus den fuenf Maps zufaellig ausgewaehlten, Map
		int point = new Random().nextInt(5) + 1;
		switch(point) {
		case 1:
			System.out.println("Anzahl der Personen: " + A1.size());
			System.out.println("Arbeitszeit aller Personen: " + A1.getTotalTime() + "\n");
			for(int i = 0; i < new Random().nextInt(A1.size() + 1) + 1; i++) {
				int z = new Random().nextInt(A1.size() + 5);  //+5, damit auch die Chance besteht, dass nach Personen gesucht wird, die es nicht gibt
				System.out.println(A1.getTimeSum("Person" + z));
				System.out.println(A1.getTimeList("Person" + z));
				System.out.println(A1.getAverage("Person" + z));
				System.out.println(A1.workingDays("Person" + z));
				System.out.println();
			}
			System.out.println("\n" + A1.toString() + "\nDas war A1");
			break;
		case 2:
			System.out.println("Anazahl der Personen: " + A2.size());
			System.out.println("Arbeitszeit aller Personen: " + A2.getTotalTime() + "\n");
			for(int i = 0; i < new Random().nextInt(A2.size() + 1) + 1; i++) {
				int z = new Random().nextInt(A2.size() + 5);   //+5, damit auch die Chance besteht, dass nach Personen gesucht wird, die es nicht gibt
				System.out.println(A2.getTimeSum("Person" + z));
				System.out.println(A2.getTimeList("Person" + z));
				System.out.println(A2.getAverage("Person" + z));
				System.out.println(A2.workingDays("Person" + z));
				System.out.println();
			}
			System.out.println("\n" + A2.toString() + "\nDas war A2");
			break;
		case 3: 
			System.out.println("Anazahl der Personen: " + A3.size());
			System.out.println("Arbeitszeit aller Personen: " + A3.getTotalTime() + "\n");
			for(int i = 0; i < new Random().nextInt(A3.size() + 1) + 1; i++) {
				int z = new Random().nextInt(A3.size() + 5);   //+5, damit auch die Chance besteht, dass nach Personen gesucht wird, die es nicht gibt
				System.out.println(A3.getTimeSum("Person" + z));
				System.out.println(A3.getTimeList("Person" + z));
				System.out.println(A3.getAverage("Person" + z));
				System.out.println(A3.workingDays("Person" + z));
				System.out.println();
			}
			System.out.println("\n" + A3.toString() + "\nDas war A3");
			break;
		case 4: 
			System.out.println("Anazahl der Personen: " + A4.size());
			System.out.println("Arbeitszeit aller Personen: " + A4.getTotalTime() + "\n");
			for(int i = 0; i < new Random().nextInt(A4.size() + 1) + 1; i++) {
				int z = new Random().nextInt(A4.size() + 5);   //+5, damit auch die Chance besteht, dass nach Personen gesucht wird, die es nicht gibt
				System.out.println(A4.getTimeSum("Person" + z));
				System.out.println(A4.getTimeList("Person" + z));
				System.out.println(A4.getAverage("Person" + z));
				System.out.println(A4.workingDays("Person" + z));
				System.out.println();
			}
			System.out.println("\n" + A4.toString() + "\nDas war A4");
			break;
		case 5:
			System.out.println("Anazahl der Personen: " + A5.size());
			System.out.println("Arbeitszeit aller Personen: " + A5.getTotalTime() + "\n");
			for(int i = 0; i < new Random().nextInt(A5.size() + 1) + 1; i++) {
				int z = new Random().nextInt(A5.size() + 5);   //+5, damit auch die Chance besteht, dass nach Personen gesucht wird, die es nicht gibt
				System.out.println(A5.getTimeSum("Person" + z));
				System.out.println(A5.getTimeList("Person" + z));
				System.out.println(A5.getAverage("Person" + z));
				System.out.println(A5.workingDays("Person" + z));
				System.out.println();
			}
			System.out.println("\n" + A5.toString() + "\nDas war A5");
			break;
		}
	}

}
