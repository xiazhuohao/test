import java.util.*;
public class Demo7 {
public static void main(String[] args) {
	int a,b,k;
	System.out.println("������������������:");
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
	if(a>b)
	{
		k=b;
	}
	else
	{
		k=a;
	}
	while(k>=1)
	{
		if(a%k==0&&b%k==0)
		{
			break;
		}
		k--;
	}
	System.out.println(a+"��"+b+"�������������Լ��Ϊ��"+k);
}
}
