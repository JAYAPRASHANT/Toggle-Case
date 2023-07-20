package Toggle;
import java.util.*;
public class Toggle {
	String toggle(String str) {
		String str1=" ";
		for(int i=0;i<str.length();i++) 
		{
			str1+=(char)((int)str.charAt(i)^(1<<5));
		}
		return str1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Toggle tt=new Toggle();
		System.out.println(tt.toggle(str));
		
		
	}

}