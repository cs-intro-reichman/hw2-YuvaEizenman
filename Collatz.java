// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		int N=seed;
		int count=0;
		String mode=args[1];
		for(int X=1 ; X<=seed; X++){
			count=1; 
			N=X; 
			if (mode.equals("v")) {
				System.out.print(N+" ");				
			}
			while (N>=1) {
				if (N%2!=0) {
					N=N*3+1;
					
				}
				else{
					N=N/2; 
				}
			
				if (mode.equals("v")) {
					System.out.print(N+" ");				
					}
				count++;	
				if (N==1) {
					break;
				}
			}	
			if (mode.equals("v")) {
				System.out.println("("+count+")");				
					}		
					

		}
		System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
		
		
		
			
		
		

}
}
