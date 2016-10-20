class StarPyramid {

  public static void main(String[] args) {

    int row = 6;    //number of rows you want
    for(int i=1; i<=row; i++) {
      for(int j=row-1; j>=i; j--)
        System.out.print(" ");
 
      for(int k=1; k<=i; k++)
        System.out.print("* ");
 
      System.out.println("");
    }

    System.out.println();   //only to provide new line between above and below pattern

    for(int i=1; i<=row; i++) {
      for(int j=row-1; j>=i; j--) 
        System.out.print(" ");
        
      for(int k=1; k<=(2*i-1); k++)
        System.out.print("*");
        
      System.out.println();
    }
  }
}
