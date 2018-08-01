package springbind;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class Listest {
	public static void main(String[] args) {
		Test model = new Test();
		DataBinder dataBinder = new DataBinder(model);
		
		//可以当作request参数
		
		Map<String, String> map = new HashMap<>();
		map.put("listSimple", "11");
		map.put("listSimple", "10");
		map.put("listSimple", "13");
		//这种情况参见ServletRequestParameterPropertyValues构造方法，最终传给的map已经变成Map<String, List<String>> map;
		
		MutablePropertyValues mpvs = new MutablePropertyValues(map);
		
		dataBinder.bind(mpvs);
		System.out.println(model.getListSimple());
	}
}
