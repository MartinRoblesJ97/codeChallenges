package codeChallenges;


public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		for(int i=1 ; i<=100; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			
			}if(i % 3 == 0){
				System.out.println("Fizz");
				
			}if(i % 5 == 0){
				System.out.println("Buzz");
			
			}else {
				System.out.println(i);
			}
			
		}//FOR
		
			
	}//MAIN
	
}//CLASS FIZZBUSS
