import java.io.*;
public class Demo9 {
public static void main(String[] args) {
	try{
		int a,b=0;
		FileReader Fr=new FileReader("d:\\Test.txt");
		while((a=Fr.read())!=-1)
		{
			if((char)a==' È')
			{
				b++;
			};
		}
		Fr.close();
		System.out.println(b);
	}catch (FileNotFoundException e){
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();

		
	}
}
}
