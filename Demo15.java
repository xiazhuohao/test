import java.awt.*;
public class Demo15 {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setLayout(new GridLayout(4,3,5,5));
		frame.add(new Button("1"));
		frame.add(new Button("2"));
		frame.add(new Button("3"));
		frame.add(new Button("4"));
		frame.add(new Button("5"));
		frame.add(new Button("6"));
		frame.add(new Button("7"));
		frame.add(new Button("8"));
		frame.add(new Button("9"));
		frame.add(new Button("10"));
		frame.add(new Button("11"));
		frame.add(new Button("12"));
		frame.setBounds(100, 100, 300, 300);
		frame.setVisible(true);
	}
}
