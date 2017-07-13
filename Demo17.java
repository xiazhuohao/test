import java.awt.*;
public class Demo12 {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setLayout(null); 
		Panel panel=new Panel();
		panel.setLayout(null); 
		Button btn1=new Button("°´Å¥1");
		btn1.setBounds(65, 30, 75, 25);
		Button btn2=new Button("°´Å¥2");
		btn2.setBounds(65, 100, 75, 25);
		panel.setSize(200, 200);
		panel.setLocation(100, 100);
		panel.setBackground(Color.blue);
		frame.add(panel);
		panel.add(btn1);
		panel.add(btn2);
		frame.setBounds(100,100,400, 400);
		frame.setBackground(Color.orange);
		frame.setVisible(true);
	}
}
