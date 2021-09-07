package hashmap;

public class Client_HashMap {

	public static void main(String[] args) {
		Implement_hashMap<String, Integer> map = new Implement_hashMap<>();
		map.put("Ram", 20);
		map.put("Ram", 90);
		map.put("Rohan", 30);
		map.put("Anuj", 60);
		map.put("Anuj", 70);
		map.put("Kartik", 80);
		map.put("Ak", 99);
		map.put("gk", 99);
		System.out.println(map);
	System.out.println(map.get("ram"));
	System.out.println(map.remove("ram"));
	System.out.println(map);
	System.out.println(map. containKey("rohan"));
		

	}

}
