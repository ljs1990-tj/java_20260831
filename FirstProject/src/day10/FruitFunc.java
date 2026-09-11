package day10;

import java.util.ArrayList;
import java.util.HashMap;

public class FruitFunc {
	static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name) {
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> fruit = list.get(i);
			if(name.equals(fruit.get("name"))) {
				return fruit;
			}
		}
		return null;
		
	}
}
