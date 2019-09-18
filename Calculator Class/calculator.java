class calculator {
	//Generate Natural Number Array in Decending Order
	public static int[] generateNaturalNumber2(int size)	{
		int index = 0;
		int[] num = new int[size];
		int[] numArray = generateNaturalNumber1(size);
		for(int i=size-1; i>=0; i--)
			num[index++] = numArray[i];
		return num; 
	}
	//Generate Natural Number Array in Accending Order
	public static int[] generateNaturalNumber1(int size)	{
		int count = 1;
		int[] num=new int[size];
		for(int i=0; i<size; i++)
		{
			num[i] = count++;
		}
		return num; 
	}
	//Generate Random Number Array
	public static int[] generateRandomNumber(int size)	{
		int[] num=new int[size];
		for(int i=0; i<num.length; i++)
		{
			num[i]=(int)(Math.random()*1000);
		}
		return num; 
	}

	//compair Two Charcter Arrays 
	public static Boolean cmpArray(char[] array1, char[] array2){
		int count=0;
		if(array1.length==array2.length){
			for(int i=0; i<array1.length; i++){
				if(array1[i]==array2[i]);
				
				else{
					count++;
					break;
				}
			}
		}
		else
			count++;
		return count==0;
	}
	//Print the contents of Array
	public static void printArray(char[] array)
	{
		for(char word: array)
			System.out.print(word);
		System.out.println();
	}
	//Print the contents of Array
	public static void printArray(int[] array)
	{
		for(int num: array)
			System.out.print(num+" ");
		System.out.println();
	}
	//Copieng of one array into another array
	public static int[] copyArray(int[] array)
	{
		int[] arrayX = new int[array.length];
		int index=0;
		for(int num: array)
			arrayX[index++]=num;
		return arrayX;
	}
	//even number
	public static String checkEvenOdd(int num)
	{
		if (num%2==0)
			return ("It's Even");
		else
			return ("It's Odd");
	}
	//prime number
	public static boolean isPrime(int num)
	{
		int i;
		for(i=2; i<=num; i++)
		{
			if (num%i==0)
				break;
		}
		if (num==i)
			return true;
		else
			return false;
	}
	//Fibonacci Series
	public static String fib(int n){
		int i,a=0,b=1,c=0;
		String s = "0 1 ";

		for(i=1; i<=n-2; i++){
			c=a+b;
			s = s + c + " ";
			a=b;
			b=c;
		}
		return s;
	}
	//div by 6
	public static boolean isDiv(int num)
	{
		return(num%6==0);
	}
	//palindrom
	public static boolean isPalindrom(int num)
	{
		int temp = num;
		int sum = 0;
		while(num>0){

		   sum=(sum*10)+num%10;
		   num=num/10;

		}
		return(temp==sum);
	}
	//leap year
	public static boolean year(int year)
	{
	   boolean isItLeapyear=((year%400==0)||((year%4==0)&&(year%100!=0)));
		return(isItLeapyear);
	}
	//Rs --> $
	 public static double convert(double rupee)
 {
  double dollar=rupee/64;
  return (dollar);
 }
 //unicod
 public static int unicode(char ch)
  {
  int ch1=ch;
  return(ch1);
  }
  //Addition of two number
  public static int add(int num1, int num2)
  {
  	return (num1+num2);
  }
  //Addition of three number
  public static int add(int num1, int num2, int num3)
  {
  	return (num1+num2+num3);
  }
  //Addition of two double number
  public static double add(double num1, double num2)
  {
  	return (num1+num2);
  }
  //Findout speed
  public static double speed(double distance, double time)
  {
  	double speed=0;
  	return (speed=distance/time);
  }
  //Area of circle
  public static double area(int radius)
  {
  	final double PI = 3.14159265;
  	double area = PI*radius*radius;
  	return (area); 
  }
  //Factorial
  public static int fact(int num)
  {
  	int fact = 1;
  	for(int i=1; i<=num; i++)
  		fact = fact*i;
  	return (fact);
  }
  //Factoria using recursion
  public static int fact(int num) {
       if (num == 0) {
           return 1;
       } else {
           return (num * fact(num - 1));
       }
   }
	
  //Time sec --> hour
  	public static String time(int sec)
	{
		int hour=0, min=0;
		if (sec>=3600)
		{
			hour = sec/3600;
			sec = sec%3600;
		}
		if (sec>=60)
		{
			min = sec/60;
			sec = sec%60;
		}
		return(hour+"hour "+min+"min "+sec+"sec");
	}
	//Count Digits of Any Number
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return(count);
	}
	//Repeat Number Twice
	public static String repeatNumberTwice(int num)
	{
		String s=num+"";
		s = s+" "+num;
		return(s); 
	}
	public static int repeatNumberTwice1(int num)
	{
		int temp = num;
		int sum = num;
		int count=0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		for (; count>0; count--)
		{	
			temp = temp*10;
		}	
		return (temp+sum);
	}
	//Repeat Number
	public static String repeatNumber(int num)
	{
		int count=0;
		int temp=num;
		String s="";
		while(num>0)
		{
			num = num/10;
			count++;
		}
	 	for(; count>0; count--)
		{
			 s = s+temp+" ";
		}
		return (s);
	}
	//Calculate Run Required Rate
	public static double reqRunRate(int target, int maxOver, int score, int overBowled)
	{
		return((double)(target-score)/(maxOver-overBowled));
	}
	//Three integer to double
	public static double realNumber(int a, int b, int c)
	{
		return (a+(double)b/10+(double)c/100);
	}
	//Sum of digits
	public static int sumOfDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
	//Sum of last four digit
	public static int sumOfFourDigit(int num)
	{
		int sum=0;
		for(int i=4; i>0; i--)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
	//AND operation
	public static boolean andBoolean(boolean a, boolean b, boolean c)
	{
		return (a&&b&&c);
	}
	//OR operation
	public static boolean orBoolean(boolean a, boolean b, boolean c)
	{
		return (a||b||c);
	}
	//Greater than one
	public static String greater(int num1, int num2, int num3)
	{
		return((num1>num2||num1>num3)?"true":"false");
	}
	//Check  number is in Ascending order
	public static String ascending(int num1, int num2, int num3)
	{
		return((num1<num2&&num1<num3&&num2<num3)?"true":"false");
	}
	//AddDigitNumbers
	public static int addDigitNumber(int num1, int num2, int num3)
	{
		int sum=num1+num2+num3;
		for (int i=1; i<4; i++)
			sum=(num1+num2+num3)+sum*10;
		return sum;
	}
	//Largest Number among Three Number
	public static int largerNumber(int num1, int num2, int num3)
	{
		int temp=0;
		if (num1>=num2 && num1>=num3)
			temp=num1;
		else if (num2>=num1 && num2>=num3)
			temp=num2;
		else if (num3>=num1 && num3>=num2)
			temp=num3;

	return temp;
	}
	//Perfect Number
	public static boolean perfectNumber(int num)
	{
		int sum=0;
		for (int i=1; i<num; i++)
		{
			if(num%i==0)
			sum=sum+i;
		}
		return (sum==num);
	}
	
	// calculate absolute square root
 	public static double calculateSqrt (int num) {

	    double rootValue = 1.00;

	    for (int i = 0; i < num; i++) {

		rootValue = 0.5 * (rootValue + num/rootValue);
	    }   

	    //To make only 3 digit available after decimal point
	    int returnValue = (int)(rootValue * 1000);  
	    rootValue = returnValue;
	    rootValue /=1000;

	    System.out.println("Root Value Calculated : " + rootValue);
	    System.out.println("Root Value By InBuild Method (Math.sqrt) : " + Math.sqrt(num));

	    return rootValue;
	}
}

/*class test
{
	public static void main(String[] khan)
	{
	System.out.println("Addition of two no.= "+calculator.add(4,5));
	System.out.println("Addition of three no.= "+calculator.add(4,5,6));
	System.out.println("Addition of two double no.= "+calculator.add(4.236,5.123));
	System.out.println("Speed = "+calculator.speed(2021, 40));	
	System.out.println("Area of Circle = "+calculator.area(5));
	System.out.println("Factorial of given no.= "+calculator.fact(0));
	System.out.println(calculator.checkEvenOdd(22));
	System.out.println("Given number is Prime = "+calculator.isPrime(23));
   	System.out.println("Given number is Div by six it's = "+calculator.isDiv(72));
   	System.out.println("Given number is Palindrom it's = "+calculator.isPalindrom(121));
   	System.out.println("Given year is leap year it's = "+calculator.year(2000));
   	System.out.println("Fibonacy Series : "+calculator.fib(10));
   	System.out.println(calculator.time(5604));
   	System.out.println("Given number has a "+calculator.count(12342)+" digits.");
   	System.out.println(calculator.repeatNumberTwice(513));
   	System.out.println(calculator.repeatNumberTwice1(5146));
   	System.out.println(calculator.repeatNumber(12345));
   	System.out.println("Required Run Rate = "+calculator.reqRunRate(326,49,210,33));
   	System.out.println(calculator.realNumber(0,0,4));
   	System.out.println("Sum of Digit's = "+calculator.sumOfDigit(1234));
   	System.out.println("Sum of last Four Digit's = "+calculator.sumOfFourDigit(151234));
   	System.out.println(calculator.andBoolean(true,true,true));
   	System.out.println(calculator.orBoolean(false,false,false));
	System.out.println("Number is greater than one is = "+calculator.greater(50,100,300));
	System.out.println("Number is in Ascending order that's = "+calculator.ascending(10,100,300));
	System.out.println(calculator.addDigitNumber(4,5,6));
	System.out.println("Larger number between three number is = "+ calculator.largerNumber(6,5,5));
	System.out.println(calculator.perfectNumber(28));
  	}
}
*/
