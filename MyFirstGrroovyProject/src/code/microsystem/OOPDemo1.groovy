package code.microsystem

class OOPDemo1 {
	
	private String name;
	private int age;
	
	

	def String getName() {
		return name;
	}



	def void setName(String name) {
		this.name = name;
	}



	def int getAge() {
		return age;
	}



	def void setAge(int age) {
		this.age = age;
	}



	static void main(args) {
		OOPDemo1 d1=new OOPDemo1();
		d1.setName("Arvind Sharma");
		d1.setAge(32);
		
		println "My Name is "+d1.getName()+" and age is "+d1.getAge();
		
	}
}
