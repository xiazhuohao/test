
class Person{  
	String name;  
	int age;   
	void show_message(){
		System.out.println("您的姓名是"+name+",您的年龄是"+age+"岁.");
	}
}
public class Demo10 {
	public static void main(String[] args) {   
		Person person1=new Person();  
		Person person2=new Person();
		person1.name="张三";
		person1.age=20;
		person2.name="李四";
		person2.age=19;
		person1.show_message();
		person2.show_message();
         
        
	}
}

