import java.util.*;

public class reverseString
{
	public static void main(String args[])
	{
		
		//Input through user.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String name= sc.nextLine();
		
		//words till .(dot)
		String[] s = name.split("\\.");
		
		for (int i = 0 ; i <= s.length -1; i++)
		{
			String res0 = "";
			res0 = s[i];
			
			String[] words = res0.split(" ");

			//for reverse words
			String res1 = "";
			for (int j = words.length - 3; j >= 0; j--)
			{
				res1 += (words[j] + " ");
			}
			System.out.print(res1.trim());
			String res2 = "";

			//for last 2 words as it's.
			for (int k = words.length - 2; k <= words.length - 1 ; k++)
			{
				res2 +=(" " + words[k]);
			}
			
			System.out.print(res2 + ". ");
			
		}

	}
}