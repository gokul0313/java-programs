package abstract_class;

 abstract class Madhu{
	static int a;
	 abstract  void m1();
	Madhu(){ 
		System.out.println("hi from madhu");
	}

		
	

	
}
class kiaan extends Madhu{
	
	System.out.println("hi this is new update")
	
	void m1() {
		
		System.out.println("age 1");
	}
}
public class Demo {

	public static void main(String[] args) {

		
		
		
		Madhu m=new kiaan();
		m.m1();

	}

}

