package interviewPrgrms;

public class FindSquareNum {

	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 7, 3, 2 };
		findSquare(array);

	}

	public static void findSquare(int[] array) {
		int mul = 0;
		int result=0;
		for (int i = 0; i < array.length; i++) {
//			mul = array[i] * array[i];
//			System.out.println(mul);
			int num=array[i];
			double sqrt = Math.sqrt(array[i]);
			
			//System.out.println(sqrt);
			
			String numberAsString = Double.toString(sqrt);
			//
		String decimalPartAsString = numberAsString.substring(numberAsString.indexOf('.') + 1);   
		
		int decV = Integer.parseInt(decimalPartAsString);   
		 System.out.println("Decimal part as integer: " + decV);     
			if(decV == num)
				System.out.println("Square  :"+num);
		}
			}
	}


