class StarDimond
{	
   public static void main(String[] args) 
   {
   	  int n=6;
      for(int i=1; i<=n; i++)
      {
        for(int j=n-1; j>=i; j--)
        {
            System.out.print(" ");
        }
        for(int k=1; k<2*i; k++)
        {
          if(k%2!=0)
            System.out.print("*");
          else
            System.out.print(" ");
        }
		System.out.println("");
      }
      for(int i=n; i>=1; i--)
      {
        for(int j=n; j>i; j--)
        {
           System.out.print(" ");
        }
        for(int k=2; k<2*i; k++)
        {
        	if(k%2!=0)
            	System.out.print("*");
            else
            	System.out.print(" ");
        }
       System.out.println("");
      }
   }  	
}