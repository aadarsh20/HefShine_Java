package hashMap;

import java.util.LinkedHashMap;

public class String_Count_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aabacdccb";
		LinkedHashMap<Character, Integer> lh=new LinkedHashMap<>();
		
		for(int i=0;i<s1.length();i++)
		{
			if(lh.containsKey(s1.charAt(i))==true)
			{
				int val=lh.get(s1.charAt(i));
				val++;
				lh.put(s1.charAt(i),val);
			}
			else
				lh.put(s1.charAt(i),1);				
		}
		System.out.println(lh);

	}

}
