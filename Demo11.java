class Student{   
	String name;
	int age;
	public Student(String n,int a){   
		name=n;
		age=a;
	}
	String show_message(){
		return "����������"+name+",����������"+age+"��.";
	}	
}
public class Demo11 {
	public static void main(String[] args) {
		Student student1=new Student("����",20);
		Student student2=new Student("����",19);
		System.out.println(student1.show_message());
		System.out.println(student2.show_message());
	}
}
