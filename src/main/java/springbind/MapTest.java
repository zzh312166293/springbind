package springbind;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.lang.Nullable;

public class MapTest {
	public static void main(String[] args) {
		Model model = new Model();
		BeanWrapper bw = new BeanWrapperImpl(model);
		bw.registerCustomEditor(Map.class, new PropertyEditorSupport(){
			@Override
			public void setAsText(@Nullable String text) throws IllegalArgumentException {
				System.out.println("text:"+text);
				if(text.equals("a")){
					setValue(new LinkedHashMap<>());
				}
				else{
					setValue(new HashMap<>());
				}
			}
		});
		
		
		bw.setPropertyValue("map", "aa");
		System.out.println(model.getMap().getClass());
	}
}
class Model{
	private Map<String,String> map;

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
}