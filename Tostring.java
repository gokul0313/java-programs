package abstract_class;



public class Tostring {
	int ram=6;
	String name="raj";

	public static void main(String[] args) {
		
		
		
		Tostring obj=new Tostring("raj");
		
		System.out.println(obj);
		
		Tostring obj2=new Tostring("nav");
		
     System.out.println(obj.equals(obj2));
     System.out.println(obj.hashCode());
		
		
		
	}
	Tostring(String name){
		this.name=name;
	}
	public String toString(){
		return "ram "+ram;
		
	}
	
	public boolean equals(Object o) {
        Tostring s=(Tostring) o;
        if(this.name==s.name) {
        	return true;
        }
        else { 
        	return false;
        }
		
	}
	
	public int hashcode() {
		return 10;
	}

}
