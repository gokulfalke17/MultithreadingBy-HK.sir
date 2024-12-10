package gf.multithreading;

import java.util.HashMap;

public class HashTableApp {
		public static void main(String[] args) {
			
			HashMap<String, String> ht = new HashMap<String, String>();
			
			ht.put(null, null);
			System.out.println(ht);
		}
}
