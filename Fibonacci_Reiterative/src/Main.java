import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many interations of the Fibonacci sequence do you want?");
		int iterations = scanner.nextInt();
		int temp;
		int x=0;
		int y=1;
		if(iterations==1)
			System.out.print(x);
		else if(iterations == 0)
			System.out.println();
		else {
				System.out.print(x);
				for(int i=0;i<iterations;i++) {
					System.out.print(", "+y);
					temp = y+x;
					x=y;
					y=temp;
				}
		}		
	}

}
