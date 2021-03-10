package OOPs.Encapsulation;

class A{
	void test()
	{
		System.out.println("A");
	}
}
class B extends A{
	void test()
	{
		System.out.println("B");
	}
}
public class ClassC extends B{

	void test() {
		super.test();
		System.out.println("C");
	}
	
}
