import java.util.*;
public class Demo6 {
public static void main(String[] args) {
	int a[]=new int[5],i,sum=0;
	double average;
	System.out.println("������"+a.length+"ѧ��java���Եĳɼ�");
	Scanner input=new Scanner(System.in);
	for(i=0;i<a.length;i++)
	{
		a[i]=input.nextInt();
	}
	for(i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	average=(double)sum/a.length;
	System.out.println("�ð�java���Ե�ƽ������"+average+"��");
}
}
