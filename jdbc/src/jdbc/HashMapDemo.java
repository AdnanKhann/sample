package jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class HashMapDemo {

	public static List<String> getNames(HashMap<String, String> hashMap) {
				List<String> list = new ArrayList<>();

				Set<String> set = hashMap.keySet();

				Iterator<String> iterator = set.iterator();
				while (iterator.hasNext()) {
					String empName = iterator.next();
					String orgName = hashMap.get(empName);
					if (orgName.equals("capgemini")) {
						list.add(empName);
					}
				}

				return list;
			}

			public static void main(String[] args) {

				HashMap<String, String> hashMap = new HashMap<>();
				hashMap.put("sudheer", "capgemini");
				hashMap.put("Arjun", "tcs");
				hashMap.put("Rohit", "capgemini");
				hashMap.put("Anusha", "capgemini");
				hashMap.put("Adnan", "cts");

				List<String> list = getNames(hashMap);

				System.out.println(list);
			}
}
