package javaCodes;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=16;
		int cnt=0;
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
				cnt++;
		}
		if(cnt==1)
			System.out.println("Perfect Square");
		else
			System.out.println("not");

	}

}
