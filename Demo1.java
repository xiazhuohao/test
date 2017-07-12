import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
				int score=input.nextInt();
				if(score>=90&&score<100){
					System.out.println("优秀");
				}else if(score>=80&&score<90){
					System.out.println("良好");
				}else if(score>=70&&score<80){
					System.out.println("中等");
				}else if(score>=60&&score<70){
					System.out.println("及格");
				}else if(score<60){
					System.out.println("不及格");
				}else{
					System.out.println("请输入正确的数值");
				}
	}

}
