import com.siddu.controllers.SetterInjection;

public class CoreJavaMain {
	public static void main(String[] args) {
		
		SetterInjection setterInjectionObject = new SetterInjection();
		System.out.println(setterInjectionObject.greetingServiceImpl());
		System.out.println(setterInjectionObject.greetingServiceImplObject);
		System.out.println(setterInjectionObject.sayHello());
	}

}
