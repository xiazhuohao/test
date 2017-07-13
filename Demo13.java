
import java.awt.*;
public class Demo18 {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setLayout(null); 
		Button btn1=new Button("×¢²á");
		Button btn2=new Button("µÇÂ½");
		Button btn3=new Button("xxx");
		btn1.setBounds(120, 80, 75, 25);
		btn2.setBounds(120, 150, 75, 25);
		Panel panel=new Panel(); 
		panel.setLayout(null); 
		panel.setBackground(Color.orange);
		panel.setSize(300, 300);
		panel.setLocation(100, 100);
		frame.add(panel);
		panel.add(btn1);
		panel.add(btn2);
		frame.setBounds(100, 100, 500, 500);
		frame.setBackground(Color.green);
		frame.setVisible(true);
	}
}
