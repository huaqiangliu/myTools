package per.lhq.tools.bean;

public class BeanToolsTest {

	public static void main(String args[]){
//		BeanToolsTest t = new BeanToolsTest();
//		t.test();
		test();
	}
	public static void test(){
		BeanTools tools = new BeanTools();
		tools.showAllGetters(RegisterUserMobilePhoneRequest.class);
	}
}
