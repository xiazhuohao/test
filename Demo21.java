class Student{
	int id;
	String name;
	int age;
	public Student(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	static void sort(Student a[]){  
		int i,j;
		Student t;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j].age>a[j+1].age)
				{
					t=a[j];a[j]=a[j+1];a[j+1]=t;
				}
			}
		}
	}
}
public class Demo21 {
	public static void main(String[] args) {
		int i;
		Student students[]={new Student(1,"�ŷ�",19),new Student(2,"����",17),new Student(3,"����",22)};
		System.out.println("δ����֮ǰ��");
		for(i=0;i<students.length;i++){
			System.out.println("��ţ�"+students[i].id+"��������"+students[i].name+"�����䣺"+students[i].age);
		}
		Student.sort(students);
		System.out.println("���������С���������");
		for(i=0;i<students.length;i++){
			System.out.println("��ţ�"+students[i].id+"��������"+students[i].name+"�����䣺"+students[i].age);
		}
	}
}
