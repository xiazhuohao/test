import java.awt.*;
import java.awt.event.*;
public class Demo20 {
	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setTitle("登陆");
		frame.setLayout(null);
		Label label1=new Label();
		label1.setText("用户名：");
		label1.setBounds(60,80,50,25);
		Label label2=new Label();
		label2.setText("密码：");
		label2.setBounds(60,130,50,25);
		final TextField username=new TextField();
		username.setBounds(150,80,130,25);
		final TextField password=new TextField();
		password.setEchoChar('*');
		password.setBounds(150,130,130,25);
		Button btn1=new Button();
		btn1.setLabel("确定");
		btn1.setBounds(150,175,50,25);
		btn1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(username.getText().equals("") || password.getText().equals(""))
				{
					System.out.println("用户名和密码不能为空，请填写完整");
				}
				else
					System.out.println(username.getText()+":"+password.getText());
				
			}
		});
		Button btn2=new Button();
		btn2.setLabel("取消");
		btn2.setBounds(230,175,50,25);
		btn2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				username.setText("");
				password.setText("");
			}
		});
		frame.add(username);
		frame.add(label1);
		frame.add(label2);
		frame.add(password);
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(380,250);
		frame.setVisible(true);
		
	}
}