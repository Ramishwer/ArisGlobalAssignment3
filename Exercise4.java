import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		String s=String.valueOf(n);
		StringBuffer str=new StringBuffer();
		
		String Result="";
		for(int i=0;i<s.length()-1;i++) {
			int r=Math.abs((int) s.charAt(i)-(int)s.charAt(i+1));
			StringBuffer sb=new StringBuffer(Integer.toString(r));
			str.append(sb);
		}
		
		str.append(s.charAt(s.length()-1));
		System.out.print(str);
		
	}

}
