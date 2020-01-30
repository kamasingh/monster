package prog1;

public class StringLength {

	public static void main(String[] args) {
		
		String str = "malayalam";
		char ch[] = str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
