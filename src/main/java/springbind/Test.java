package springbind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	// 1.list 简单类型
	// listSimple=&listSimple= 和数组一样
	// 当然也可以这么些listSimple[0]=&listSimple[10]= 这时候就相当于有11个元素
	public List<String> listSimple = new ArrayList<>();

	// 2.List 符合类型
	// list[0].name=&list[0].age=&list[1].name=&list[1].age=
	// 注意此处不能写 list.name=&list.age=&list.name
	public List<Model> list = new ArrayList<Model>();

	// 2.List-Map 符合类型
	// listMapSimple[0]['key1']=a&listMapSimple[0]['key11']=b&listMapSimple[1]['key2']=c&listMapSimple[1]['key22']=c
	public List<Map<String, String>> listMapSimple = new ArrayList<>();
	
	// List-Map 复合 
	//listMapSimple[0]['key1'].name=a&listMapSimple[0]['key1'].age=11
	public List<Map<String, Model>> listMapfuhe = new ArrayList<>();

	/***************************************************************************************************************************************************/

	// 3.map 简单类型
	// mapSimple['1']=&mapSimple['2]=
	// 如果出现 mapSimple['1']=a&mapSimple['1']=b 则1对应的value
	// 则为a,b,此时最好定义为Map<Integer, List<String>>
	public Map<Integer, String> mapSimple = new HashMap<>();

	// 4.map 符合类型
	// map['1'].name=&map['1'].age=11&map['2'].name=&map['2'].age
	public Map<Integer, Model> map = new HashMap<>();

	// 5.map list
	// mapListSimple['1']=10&mapListSimple['1']=11&mapListSimple['2']=12&mapListSimple['3']=13
	public Map<Integer, List<Long>> mapListSimple = new HashMap<>();
	
	//6.map  mapListfuhe['a'][0].name 不行
	public Map<String, List<Model>> mapListfuhe = new HashMap<>();

	public Map<Integer, String> getMapSimple() {
		return mapSimple;
	}

	public void setMapSimple(Map<Integer, String> mapSimple) {
		this.mapSimple = mapSimple;
	}

	public List<String> getListSimple() {
		return listSimple;
	}

	public void setListSimple(List<String> listSimple) {
		this.listSimple = listSimple;
	}

	public List<Model> getList() {
		return list;
	}

	public void setList(List<Model> list) {
		this.list = list;
	}

	public Map<Integer, Model> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Model> map) {
		this.map = map;
	}

	public Map<Integer, List<Long>> getMapListSimple() {
		return mapListSimple;
	}

	public void setMapListSimple(Map<Integer, List<Long>> mapListSimple) {
		this.mapListSimple = mapListSimple;
	}

	public List<Map<String, String>> getListMapSimple() {
		return listMapSimple;
	}

	public void setListMapSimple(List<Map<String, String>> listMapSimple) {
		this.listMapSimple = listMapSimple;
	}

	public Map<String, List<Model>> getMapListfuhe() {
		return mapListfuhe;
	}

	public void setMapListfuhe(Map<String, List<Model>> mapListfuhe) {
		this.mapListfuhe = mapListfuhe;
	}

	public List<Map<String, Model>> getListMapfuhe() {
		return listMapfuhe;
	}

	public void setListMapfuhe(List<Map<String, Model>> listMapfuhe) {
		this.listMapfuhe = listMapfuhe;
	}

}

class ModelTest {
	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "==" + age;
	}
}
