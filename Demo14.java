import java.awt.*;
public class Demo14 {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setLayout(new BorderLayout(5,5));  
		Button btn1=new Button("��");
		Button btn2=new Button("��");
		Button btn3=new Button("��");
		Button btn4=new Button("��");
		Button btn5=new Button("��");
		frame.add(btn1,BorderLayout.CENTER);
		frame.add(btn2,BorderLayout.NORTH);
		frame.add(btn3,BorderLayout.SOUTH);
		frame.add(btn4,BorderLayout.WEST);
		frame.add(btn5,BorderLayout.EAST);
		frame.setBounds(100, 100, 300, 300);
		frame.setVisible(true);
	}
}
