package a;

public class ads {
	public static void main(String[] args) {
		int qing, yu;
		for(qing=0;qing<8;qing++)
		{
			yu=8-qing;
			if(20*qing+12*yu==112)
			{
				System.out.println("晴天为"+qing+"天，雨天为"+yu+"天");
			}
		}
	}

