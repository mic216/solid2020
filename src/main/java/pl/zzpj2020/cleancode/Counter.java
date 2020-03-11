package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Counter {

	Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
	private int minInt = Integer.MIN_VALUE;
	private int maxInt = Integer.MAX_VALUE;

	public void countOccurences(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			updateOccurencesMap(numbers.get(i));
		}
	}

	public void updateOccurencesMap(Integer i) {
		if (occurences.containsKey(i)) {
			Integer value = occurences.get(i);
			occurences.put(i, value + 1);
		} else {
			occurences.put(i, 1);
		}

		if (i > minInt) {
			minInt = i;
		}

		if (i < maxInt) {
			maxInt = i;
		}
	}

	public double getWeightedAverage() {
		double jk = 0;
		double value = 0;
		for (Entry<Integer, Integer> element : occurences.entrySet()) {
			jk += element.getKey() * element.getValue();
			value += element.getValue();
		}
		return jk / value;
	}

	public int getMinInt() {
		return minInt;
	}
	
	public int getMaxInt() {
		return maxInt;
	}
}