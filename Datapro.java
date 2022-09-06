package infomat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datapro {

	static ArrayList<String> user=new ArrayList<String>();
	static ArrayList<String> pwd=new ArrayList<String>();
	public static StringBuffer s1[]= {new StringBuffer("hi")};
	public static ArrayList<ArrayList<String>> d6;
	public static ArrayList<ArrayList<String>> d2=new ArrayList<ArrayList<String>>();
	public static String[][] D4;
	public static String q;
	static ArrayList<ArrayList<String>> d3=new ArrayList<ArrayList<String>>();
	static public String[] us=new String[user.size()];
	static public String[] pw=new String[pwd.size()];
	public void readExcel() throws IOException {
		FileInputStream excel =new FileInputStream("F:\\vig\\edu\\infosel\\excel handling\\tc3.xlsx");
		XSSFWorkbook WB=new XSSFWorkbook(excel);
		XSSFSheet S= WB.getSheetAt(0);
		Iterator<Row> RI=S.iterator();
		System.out.println(S.iterator());
		while (RI.hasNext()) {
			Row row=RI.next();
			 Iterator<Cell> C = row.cellIterator();
			int i=2;
			while(C.hasNext()) {
				if (i%2==0) {
					
				user.add(C.next().getStringCellValue());
				}
				else
				{
				pwd.add(C.next().getStringCellValue());	
				}
			i++;
			}
				}
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Datapro X=new Datapro();
		X.readExcel();
//		System.out.println(user);
//		System.out.println(pwd);
		d2.add(user);
		d2.add(pwd);
//		System.out.println(d2);
		int u=user.size();
		int p=pwd.size();
		//System.out.println(u+""+p);
		
		D4=new String[user.size()][pwd.size()];
		
		for(int i=0;i<D4.length;i++)
		{
			D4[i][0]=user.get(i);
		}
		for(int j=0;j<D4[0].length;j++)
		{
			D4[j][1]=pwd.get(j);
		}
		//System.out.println(D4[0][0]+""+D4[0][1]);
//		for(int k=0;k<user.size();k++)
//		{
//			//for(int )
//		}
	//String[][] n = D4.clone();
		
		
	String e = d2.toString();
	
	 q = user.toString();
	 //String i1=pwd.toString();
	// String z[][] = null;
	// z[0]=user;
	 for(int i=0;i<us.length;i++)
		{
			us[i]=user.get(i);
		}
		for(int j=0;j<pw.length;j++)
		{
			pw[j]=pwd.get(j);
		}
	//System.out.println(e);
		String z[][]= {us,pw};
		System.out.println(s1);
		
		//user.add();
		d6=d2;
		//System.out.println(d1);
//		String[][] d6= {{"admin","admin123"}};
//		System.out.println(d6);
		

	}

}
