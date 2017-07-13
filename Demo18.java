
import java.awt.*;
public class Demo13 {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));  //设置窗体的布局方式为FlowLayout
		Button btn1=new Button("按钮1");
		Button btn2=new Button("按钮2");
		Button btn3=new Button("按钮3");
		Button btn4=new Button("按钮4");
		Button btn5=new Button("按钮5");
		Button btn6=new Button("按钮6");
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		
		frame.setBounds(100, 100, 300, 300);
		frame.setVisible(true);
	}
}

