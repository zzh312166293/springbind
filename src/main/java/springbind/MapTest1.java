package springbind;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;


public class MapTest1 {

	public static void main(String[] args) {
		Test model = new Test();
		DataBinder dataBinder = new DataBinder(model);
		
		//可以当作request参数
		Map<String, String> map = new HashMap<>();
		map.put("mapSimple[0]", "10");
		map.put("mapSimple[1]", "123");
		MutablePropertyValues mpvs = new MutablePropertyValues(map);
		
		dataBinder.bind(mpvs);
		
		System.out.println(model.getMapSimple());
		System.out.println(dataBinder.getTarget());
	}
}
