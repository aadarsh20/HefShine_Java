package variation;

public class Trapping_water {

	public static void main(String[] args) {

		int a[]= {3,0,2,0,4};
		
		int maxIndex=0;
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
				maxIndex=i;
			}
		}
		int water =0;
		
	// Left
		int start=maxIndex;
		int end=maxIndex-1;
		while (end>=0) 
		{
			for (int i = start-1; i >= 0; i--)
			{
				if(a[i]>a[end])
				{
					end=i;
				}
			}
			for (int i = end+1; i < start; i++)
			{
				water=water+(a[end]-a[i]);
			}
			start=end;
			end=start-1;
		}
		
		
	// Right
				start=maxIndex;
				end=maxIndex+1;
				while (end<a.length) 
				{
					for (int i = start+1; i <a.length; i++)
					{
						if(a[i]>a[end])
						{
							end=i;
						}
					}
					for (int i = start+1; i < end; i++)
					{
						water=water+(a[end]-a[i]);
					}
					start=end;
					end=start+1;
				}
				System.out.println(water);
	}

}
