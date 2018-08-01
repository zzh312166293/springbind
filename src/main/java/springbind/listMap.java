package springbind;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class listMap {
	public static void main(String[] args) {
		Test model = new Test();
		DataBinder dataBinder = new DataBinder(model);
		
		//可以当作request参数
		
		Map<String, Object> map = new HashMap<>();
		map.put("listMapfuhe[0]['maml'].age", "0");
		map.put("listMapfuhe[0]['maml'].name", "maml");
		map.put("listMapfuhe[1]['maml1'].name", "maml1");
		map.put("listMapfuhe[1]['maml1'].age", "12");
		
		MutablePropertyValues mpvs = new MutablePropertyValues(map);
		
		dataBinder.bind(mpvs);
		
		System.out.println(model.getListMapfuhe());
		for(Map<String,Model> m : model.getListMapfuhe()){
			for(String str : m.keySet()){
				System.out.println(str+"***"+m.get(str).getName()+"----"+m.get(str).getAge());
			}
		}
	}
}
