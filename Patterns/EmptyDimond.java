class EmptyDimond
{ 
   public static void main(String[] args) 
   {
      int n=5;
      for(int i=1; i<=n; i++)
      {
         for(int j=n-1; j>=i; j--)
         {
            System.out.print(" ");
         }
         for(int k=1; k<=(2*i-1); k++)
         {
            if(k%2!=0)
            {
               if(k==1||k==(2*i-1))
               System.out.print("*");
            else
               System.out.print(" ");
            }
            else
               System.out.print(" ");
         }
       System.out.println("");
      }
    
      for(int i=n-1; i>=1; i--)
      {
         for(int j=n-2; j>=i; j--)
         {
            System.out.print(" ");
         }
         System.out.print(" ");
         for(int k=1; k<=(2*i-1); k++)
         {
            if(k%2!=0)
            {
             if(k==1||k==(2*i-1))
               System.out.print("*");
             else
               System.out.print(" ");
            }
            else
               System.out.print(" ");
         }
       System.out.println("");
      }
  }  
}