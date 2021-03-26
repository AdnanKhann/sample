package jdbc;

import java.util.Collection;
import java.util.HashMap;

public class HashMapDemo3 {
	public static HashMap<String, String> getGrades(HashMap<String, Integer> map) {
		return null;
	}
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("pavan", 54);
		hashMap.put("shanu", 64);
		Collection<Integer> collection = hashMap.values();
		System.out.println(collection);
		if(hashMap.containsKey("pavan")) {
			int value = hashMap.get("pavan");
			System.out.println(value);
		}
		HashMap<String, String> map = getGrades(hashMap);
		System.out.println(map);
	}
}