import java.awt.*;
public class Demo14 {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setLayout(new BorderLayout(5,5));  
		Button btn1=new Button("中");
		Button btn2=new Button("北");
		Button btn3=new Button("南");
		Button btn4=new Button("西");
		Button btn5=new Button("东");
		frame.add(btn1,BorderLayout.CENTER);
		frame.add(btn2,BorderLayout.NORTH);
		frame.add(btn3,BorderLayout.SOUTH);
		frame.add(btn4,BorderLayout.WEST);
		frame.add(btn5,BorderLayout.EAST);
		frame.setBounds(100, 100, 300, 300);
		frame.setVisible(true);
	}
}
