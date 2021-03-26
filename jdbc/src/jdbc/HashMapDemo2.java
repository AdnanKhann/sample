package jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("sudheer", "capgemini");
		hashMap.put("Arjun", "tcs");
		hashMap.put("Rohit", "capgemini");
		hashMap.put("Anusha", "capgemini");
		hashMap.put("Adnan", "cts");

		Set<Entry<String, String>> set = hashMap.entrySet();

		/*Iterator<Entry<String, String>> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Entry<String,String> entry = iterator.next();
			String empName = entry.getKey();
			String orgName = entry.getValue();
			
			if(orgName.equals("capgemini")) {
				list.add(empName);
			}
			
		}*/
		

		// forEach
		
		for (Entry<String, String> entry: set) {
				String empName = entry.getKey();
				String orgName = entry.getValue();
			
			if (orgName.equals("capgemini")) {
				list.add(empName);
			}
		}
		System.out.println(list);
	}
}