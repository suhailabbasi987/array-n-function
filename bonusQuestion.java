public static void main(String args[])
{
  
//System.out.print(DecimalToAnyBase());
//anybaseAddition();
//anyBaseSubstraction();
//barChartArr();

}



public static void barChartArr()
{ 
  Scanner scn=new Scanner(System.in);
      
      
      //  int data =scn.nextInt(); 
        
        int n=scn.nextInt();
        int [] arr=new int[n];
       
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
            
        }
       
        int max=arr[0];
        int notc=0;
        for(int i=0;i<n;i++)
        {
         if(max < arr[i])
         max=arr[i];
         }
         //System.out.print(max);
    
         for(int floor=max; floor>=1;floor--)
         
         {
           for(int i=0; i<arr.length; i++)
     
           {    //System.out.print(arr.length);
         
               if(arr[i]>=floor)
           {
              System.out.print("*\t");
           }
           else
           {
              System.out.print("\t");
           }
        }
  System.out.println();
     }
  

}

public static void anyBaseSubstraction()
{
      int n1=111;
      int n2=100;
      int b= 2;
      int k=1;
int rev=0;
int lans=0;
      //     int x;
      //System.out.print(x);
int c=0;
    while(n1!=0 || n2!=0 )
      {
     int d1=n1%10;
     int d2=n2%10;

     int d=(d1-d2)-c;
//     System.out.print(d+" ");
     c=0;
     if(d<=-1)
     {
           d=b+d;
           c=1;
     }
     int ans=d*k;
     lans=ans+lans;
     k=k*10;

n1=n1/10;
n2=n2/10;

}       
      

      System.out.println(lans);

}

public static void anybaseAddition()
{
      int n1=101;
      int n2=11;
      int b=2;
      int k=1;
int rev=0;
int lans=0;
      //     int x;
      //System.out.print(x);
int c=0;
    while(n1!=0 || n2!=0 || c!=0)
      {
     int d1=n1%10;
     int d2=n2%10;

     int d=d1+d2+c;
 c =d/b;
 rev=d%b;
rev=rev*k;
 lans=rev+lans;
n1=n1/10;
n2=n2/10;
k=k*10;
}       
      
}

public static int DecimalToAnyBase(int i,int o)

{

      
int n=i;
int m=o;
int k=0;
int ans=0;
int lans=0;
int c=1;
while(n!=0)
{
k=n%m;
ans=k*c;
//System.out.print(k);

//System.out.print(ans);

lans=ans+lans;
c=c*10;
n=n/m;
}

//System.out.print(lans);
return lans;


}
public static int anyBaseToDecimal(int i,int o)
{

      int n=i;
      int m=o;
      int k=0;
      int ans=0;
      int lans=0;
      int c=1;
      while(n!=0)
      {
      k=n%10;
      ans=k*c;
      //System.out.print(k);
      
      //System.out.print(ans);
      
      lans=ans+lans;
      c=c*m;
      n=n/10;
      }
      
      return lans;
      
}


}
