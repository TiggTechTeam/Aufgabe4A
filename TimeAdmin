//Kevin, Jahreiss; Melanie Urbas; Karasz David

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeAdmin {

	private HashMap<String, ArrayList<Double>> hashmap = new HashMap<>();
	
	//leerer Konstruktor
	public TimeAdmin() {

	}
	
	//hinzufuegen eines Namens ohne Wert
	public void addName(String name) {
		hashmap.put(name, new ArrayList<Double>());
	}
	
	//fuegt Zeit zu einem Namen hinzu
	//sollte der Name nicht existieren, dann wird er, zusammen mit der Zeit, hinzugefuegt
	public void addTime(String name, double time) {
		if (hashmap.containsKey(name))
			hashmap.get(name).add(time);
		else {
			addName(name);
			addTime(name, time);
		}
	}

	//ausgabe aller Zeiten einer bestimmten Person
	public List<Double> getTimeList(String name) {
		if (hashmap.containsKey(name))
			return hashmap.get(name);
		return null;
	}

	//ausgabe der Arbeitstage einer Person unter der Annahme, dass sie nur eine Arbeitszeit pro Arbeitstag erhaelt
	//gibt -1 zurueck, wenn die Person nicht existiert
	public int workingDays(String name) {
		if(hashmap.containsKey(name)) {
			if(getTimeList(name) == null) 
				return 0;
			return hashmap.get(name).size();
		}
		return -1;
	}

	//die Summe aller Arbeitszeiten einer bestimmten Person
	//gibt null zurueck, wenn die Person nicht existiert
	public Double getTimeSum(String name) {
		double n = 0.0;
		if (hashmap.containsKey(name)) {
			for (Double i : hashmap.get(name))
				n = n + i;
			return n;
		}
		return null;
	}

	//die durchschnittliche Arbeitszeit einer bestimmten Person
	//gibt null zurueck, wenn die Person nicht existiert
	public Double getAverage(String name) {
		if (hashmap.containsKey(name)) {
			if (hashmap.get(name).size() != 0)
				return getTimeSum(name) / workingDays(name);
			return 0.0;
		}
		return null;
	}

	//gibt die gesamte Arbeitszeit aller Personen zurueck
	//gibt null zurueck, wenn keine Person zur Map gehoert
	public Double getTotalTime() {
		double n = 0.0;
		if (!hashmap.isEmpty()) {
			for (String i : hashmap.keySet())
				n += getTimeSum(i);
			return n;
		}
		return null;
	}

	//gibt die Anzahl der Personen aus
	public int size() {
		return hashmap.size();
	}

	//gibt die Personen aufgelistet mit ihren Arbeitszeiten zurueck
	public String toString() {
		String s = "";
		for (String i : hashmap.keySet()) {
			s += i + ": " + getTimeList(i) + "\n";
		}
		return s;
	}

}
