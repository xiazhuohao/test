import java.util.Scanner;
public class Demo3 {
public static void main(String[] args) {
	System.out.println("������");
	Scanner input=new Scanner (System.in);
	int day=3;
	day=input.nextInt();
	switch(day)	
	{
	case 1:System.out.println("����һ");
	case 2:System.out.println("���ڶ�"); 
	case 3:System.out.println("������");
	case 4:System.out.println("������");
	case 5:System.out.println("������");
	case 6:System.out.println("������");
	case 7:System.out.println("������");
	default: System.out.println("��������ȷ����ֵ");
	}
}
}
