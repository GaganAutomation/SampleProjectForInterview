package Test;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountTheWords {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String str = "the java is the java the best language in the language world";
		String[] str1 = str.split(" ") ;

		
		for(String s: str1) {
			
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
				
			}else
			{
				map.put(s, 1);
			}
		}
		
		for (Entry<String, Integer> m : map.entrySet()) {

			System.out.println(m.getKey()+"=" + m.getValue());

			}


	}

}
