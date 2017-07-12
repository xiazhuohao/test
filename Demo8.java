import java.util.*;
public class Demo8 {
public static void main(String[] args) {
	int a[]=new int[10],i,j,n,t;
	System.out.println("请为数组中"+a.length+"个元素：");
	Scanner input=new Scanner (System.in);
	for(i=0;i<a.length;i++)
	{
		a[i]=input.nextInt();	
	}
	i=0;
	j=a.length-1;
	for(n=1;n<=a.length/2;n++)
	{
		t=a[i];a[i]=a[j];a[j]=t;
		i++;
		j--;
	}
	System.out.println("逆置后的数组为：");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+"");
	}
}
}
