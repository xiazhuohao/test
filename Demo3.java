import java.util.Scanner;
public class Demo3 {
public static void main(String[] args) {
	System.out.println("请输入");
	Scanner input=new Scanner (System.in);
	int day=3;
	day=input.nextInt();
	switch(day)	
	{
	case 1:System.out.println("星期一");
	case 2:System.out.println("星期二"); 
	case 3:System.out.println("星期三");
	case 4:System.out.println("星期四");
	case 5:System.out.println("星期五");
	case 6:System.out.println("星期六");
	case 7:System.out.println("星期日");
	default: System.out.println("请输入正确的数值");
	}
}
}
