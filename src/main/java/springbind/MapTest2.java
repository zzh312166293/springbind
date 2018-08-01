package springbind;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class MapTest2 {
	public static void main(String[] args) {
		Test model = new Test();
		DataBinder dataBinder = new DataBinder(model);
		
		//可以当作request参数
		Map<String, String> map = new HashMap<>();
		map.put("map['1'].name", "a");
		map.put("map['1'].age", "10");
		map.put("map['2'].age", "11");
		map.put("map['2'].name", "maml");
		MutablePropertyValues mpvs = new MutablePropertyValues(map);
		
		dataBinder.bind(mpvs);
		System.out.println(model.getMap());
	}
}
