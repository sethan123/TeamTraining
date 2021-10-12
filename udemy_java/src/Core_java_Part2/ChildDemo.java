package Core_java_Part2;

import inheritances.parentdemo;

public class ChildDemo extends ParentDemo {
	
	String name ="MArk hendty";
	public void getstringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	
	public static void main(String[] args) {
		
		ChildDemo cd=new ChildDemo();
		cd.getstringdata();
	}

}
