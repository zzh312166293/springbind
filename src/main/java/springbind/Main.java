package springbind;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;

public class Main
{
	public static void main(String[] args)
	{
		// TestModel tm = new TestModel();
		// BeanWrapper bw = new BeanWrapperImpl(tm);
		// bw.setPropertyValue("name", "this is name!");
		// bw.setPropertyValue("good", "true");
		// System.out.println(tm.isGood());

		// TestModel tm = new TestModel();
		// BeanWrapperImpl bw = new BeanWrapperImpl(false);
		// bw.setWrappedInstance(tm);
		// bw.setPropertyValue("good", true);
		// System.out.println(tm);

		TestModel tm = new TestModel();
		BeanWrapper bw = new BeanWrapperImpl(tm);
		bw.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		bw.setPropertyValue("birth", "1990-01-01");
		System.out.println(tm.getBirth());
		//
		// PropertyAccessor p;
		PropertyEditorSupport pe;

		DefaultFilter d;
	}
}

class TestModel
{
	private int age;

	private Date birth;

	private String name;

	private boolean good;

	private long times;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public Date getBirth()
	{
		return birth;
	}

	public void setBirth(Date birth)
	{
		this.birth = birth;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isGood()
	{
		return good;
	}

	public void setGood(boolean good)
	{
		this.good = good;
	}

	public long getTimes()
	{
		return times;
	}

	public void setTimes(long times)
	{
		this.times = times;
	}

}