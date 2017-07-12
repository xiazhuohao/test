import java.util.*;
public class Demo2 {
public static void main(String[] args) {
	System.out.println("请输入");
	Scanner input=new Scanner (System.in);
	int score;
	score=input.nextInt();
	if (score>=0 && score<=100){
	if(score>=90){System.out.println("优秀");}
	else if(score>=80){System.out.println("良好");}
	else if(score>=70){System.out.println("中等");}
	else if(score>=60){System.out.println("及格");}
	else if(score>=50){System.out.println("不及格");}
	else if(score>=40){System.out.println("不及格");}
	else if(score>=30){System.out.println("不及格");}
	else if(score>=20){System.out.println("不及格");}
	else if(score>=10){System.out.println("不及格");}
	else if(score>=0){System.out.println("不及格");}	
	}else{System.out.println("请输入一个正确的数值");}
}
}
