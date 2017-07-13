import java.io.*;
public class Demo19 {
	public static void main(String[] args) {
		int a;
		try{	
			FileReader fr=new FileReader("D:\\test.txt"); 
			FileWriter fw=new FileWriter("E:\\copy.txt");  
			while((a=fr.read())!=-1){  

					if(a>=97 && a<=122)
					{
						fw.write(a-32);
					}
					else
						fw.write(a);
			}
			fr.close();
			fw.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

