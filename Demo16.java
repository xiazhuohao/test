import java.awt.*;
public class Demo16 {
	public static void main(String[] args) {
		Frame frame=new Frame("¼òÒ×¼ÆËãÆ÷");
		frame.setLayout(new BorderLayout());  
		TextField tf=new TextField();
		Panel panel=new Panel();
		panel.setLayout(new GridLayout(5,4,3,3));
		panel.add(new Button(""));
		panel.add(new Button("BackSpace"));
		panel.add(new Button("CE"));
		panel.add(new Button("C"));
		panel.add(new Button("7"));
		panel.add(new Button("8"));
		panel.add(new Button("9"));
		panel.add(new Button("/"));
		panel.add(new Button("4"));
		panel.add(new Button("5"));
		panel.add(new Button("6"));
		panel.add(new Button("*"));
		panel.add(new Button("1"));
		panel.add(new Button("2"));
		panel.add(new Button("3"));
		panel.add(new Button("-"));
		panel.add(new Button("0"));
		panel.add(new Button("."));
		panel.add(new Button("="));
		panel.add(new Button("+"));
		frame.add(tf,BorderLayout.NORTH);
		frame.add(panel,BorderLayout.CENTER);
		frame.setBounds(100, 100, 300, 300);
		frame.setVisible(true);
	}
}
