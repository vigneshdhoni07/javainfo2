package infomat;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String m="I Love India";
		//String n=new String("I Love India");
		String m = "I Love India";
		String j=null;
		char[] a = m.toCharArray();
		System.out.println(m);
		int e=a.length-1;
		int s=0;
//		for(int i=0;i<=e;i++)
//		{
//			System.out.print(a[i]);
//		}
		while(s<=e)
		{	char temp;
			temp=a[e];
			a[e]=a[s];
			a[s]=temp;
			
			s++;
			e--;
			//n=m;
		}
		System.out.println();
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]);
//		}
		m=a.toString();
		j=m;
		System.out.println(j);
//		//String m=n.replace('o','e');
//		System.out.println(m);
	}

}
