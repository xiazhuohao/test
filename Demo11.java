class Student{   
	String name;
	int age;
	public Student(String n,int a){   
		name=n;
		age=a;
	}
	String show_message(){
		return "您的姓名是"+name+",您的年龄是"+age+"岁.";
	}	
}
public class Demo11 {
	public static void main(String[] args) {
		Student student1=new Student("张三",20);
		Student student2=new Student("李四",19);
		System.out.println(student1.show_message());
		System.out.println(student2.show_message());
	}
}
