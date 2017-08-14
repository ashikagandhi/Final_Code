//Implement an algorithm to determine if a string has all unique characters. What
//if you cannot use additional data structures?
import java.util.*;

public class Java_Program_1 {
	
	public void check (String s1)
	{
		int []tables=new int[256];
		Arrays.fill(tables, 0);
		for (int i=0;i<s1.length();i++)
		{
			tables[s1.charAt(i)]++;
			if (tables[s1.charAt(i)]>1)
			{
				System.out.println ("It has reapated charectat"+s1.charAt(i));
				return;
			}
		}
		System.out.println ("string has all unique characters");
	
	}
	public void check2(String s1)
	{
		HashMap<Character,Boolean> hash= new HashMap<Character,Boolean>();
		
		for (int i=0;i<s1.length();i++)
		{
			if (hash.containsKey(s1.charAt(i)))
			{
				System.out.println ("It has reapated charectat in check2"+s1.charAt(i));
				return;
			}
			hash.put(s1.charAt(i),true);
								
		}
		System.out.println ("string has all unique characters in check2");
	}
	
	public void check3 (String str1)
	{
		HashMap hashMap1= new HashMap();
		
		for (int i=0;i<str1.length();i++)
		{
			
		  if (!hashMap1.containsKey(str1.charAt(i)))
		  {
			  hashMap1.put(str1.charAt(i), 0);			  
		  }	
		  else
		  {
			  System.out.println ("String is not unique");
			  return;
		  }
		}
		System.out.println ("String has all unique char");
		
	}
	
	public static void main (String [] args)
	{
		Java_Program_1 obj1= new Java_Program_1 ();
		String str1= "abcfabc";
		obj1.check(str1);
		obj1.check2(str1);
		obj1.check3(str1);
					
	}
		
}
