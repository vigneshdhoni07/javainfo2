package infomat;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash {
    public static void main(String ar[])
    {   
        int a[]={1,4,3,8,2,6,5,9};
        // for(int i=0;i<a.length;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }
        for(int i=0;i<a.length-1;i++)
        {
            int j=i+1;
            while(j>0 && a[j]<a[j-1])
            {
                int t=a[j];
                a[j]=a[j-1];
                a[j-1]=t;
                j--;
            }
        }
        // System.out.println();
        // for(int i=0;i<a.length;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }

        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        ArrayList<Integer> q=new ArrayList<Integer>();
        h.put(a[0], 1);
        // int s=a[1]/2;
        // if(h.get(s)>=1)
        // {
        //     System.out.println("not null");
        // }
        // h.put(s, h.get(s)-1);
        //q.add(s);

       
        for(int i=1;i<a.length;i++)
        {  
        		if(a[i]%2==0)
            	{   
        					int s=a[i]/2;
        					if((h.get(s)!=null && h.get(s)>=1))
        					{
        						q.add(a[i]/2);
        						h.put(a[i]/2,(h.get(a[i]/2))-1);
        					}
        					else
        					{
        						if(h.get(a[i])==null)
        						{
        							h.put(a[i], 1);
        						}
        						else
        						{
        							h.put(a[i],h.get(a[i])+1);
        						}
        					}
            }
            else
            {
            if(h.get(a[i])==null)
            {
                h.put(a[i], 1);
            }
            else
            {
                h.put(a[i],h.get(a[i])+1);
            }
        }
    }
        
        //System.out.println(h);
        h.forEach((e,i)->{
        	System.out.println(e +" "+i);
    });

}}
