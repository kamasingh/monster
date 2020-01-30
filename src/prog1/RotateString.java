package prog1;

public class RotateString {

	public static void main(String[] args) {
		
//		String str = "i an khan and i an a terrorist";
//		String[] ch=str.split(" ");
//		String rev ="";
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			rev=rev+ " " + ch[i];
//		}
//		System.out.println(rev + " ");
		
		String str = "i an khan and i an a terrorist";
		String[] ch=str.split(" ");
		String rev ="";
		for(int i=ch.length-1;i>=6;i--)
		{
			rev=rev+ " " + ch[i];
		}
		
		String st ="";
		for(int i=0;i<ch.length-3;i++)
		{
		  st=st + " " +ch[i];
		}
		System.out.println(rev + " " + st);
	}

}
