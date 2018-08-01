package springbind;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class MapTest3 {
	public static void main(String[] args) {
		Test model = new Test();
		DataBinder dataBinder = new DataBinder(model);
		
		//可以当作request参数
		
		Map<String, Object> map = new HashMap<>();
		map.put("mapListfuhe['maml'][0].age", "maml");
		
		MutablePropertyValues mpvs = new MutablePropertyValues(map);
		
		dataBinder.bind(mpvs);
		
		System.out.println(model.getMapListfuhe());
	}
}
