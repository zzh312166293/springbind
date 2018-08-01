package springbind;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.validation.DataBinder;

public class bindTest
{
	public static void main(String[] args)
	{
		User user = new User();
		System.out.println(user + "--==");
		DataBinder db = new DataBinder(user);

		System.out.println(db.getTarget() + "---");

		Map<String, String> map = new HashMap<>();
		map.put("id", "123");
		map.put("aa", "123");
		PropertyValues pvs = new MutablePropertyValues(map);
		db.bind(pvs);
		System.out.println(user.getId());

		System.out.println(user + "--1-");
		System.out.println(db.getTarget() + "--0-");

		Map<String, Object> bindingResultModel = db.getBindingResult().getModel();

		for (String s : bindingResultModel.keySet())
		{
			System.out.println(s + "==" + bindingResultModel.get(s));
		}
	}
}
