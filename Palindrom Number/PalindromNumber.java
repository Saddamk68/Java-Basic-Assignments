class PalindromNumber {

	public static boolean isPalindrom(int num) {
		
		int temp = num;
		int sum = 0;

		while(num>0) {
		   int i=num%10;
		   sum=(sum*10)+i;
		   num=num/10;
		}
		if (temp==sum)
			return true;
		else
			return false;	
	}
	
	public static int[] generatPalindromNumber(int from, int to) {
		
		int[] array = new int[(to-from)/4];
		int index=0;
		for(int i=from; i<=to; i++)	{
			if(isPalindrom(i))
				array[index++]=i;
		}
		return array;
	}
	
	public static void main(String[] khan) {
		
		System.out.println(isPalindrom(1212));
		calculator.printArray(generatPalindromNumber(100,300));
	}
}