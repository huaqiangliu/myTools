package per.lhq.tools.bean;

import java.lang.reflect.Method;

public class BeanTools {

	public void showAllGetters(Class cls){
		//返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
		Method[] methods = cls.getDeclaredMethods();
		for (Method m : methods){
			System.out.println(m.getName());
		}
		System.out.println("=================================");
		//返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。
		Method[] methods2 = cls.getMethods();
		for (Method m2 : methods2){
			System.out.println(m2.getName());
		}
	}
}
