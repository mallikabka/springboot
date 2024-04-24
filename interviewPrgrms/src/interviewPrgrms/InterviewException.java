package interviewPrgrms;

public class InterviewException implements AdditionsInterface{

	public static void main(String[] args) {
		int num1,num2;
		AdditionsInterface a=new InterviewException();
		System.out.println(a.add(2, 3));
		
	
	}
	public int add(int a,int b) {
		try {
			return a+b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("sum");
		}
		return b;
		
	}

}
