import java.util.Scanner;
public class OddValuesFromTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		for(int i = -10; i <= 10; i++){
			if (i % 2 == 1 || i % 2 == -1){
				System.out.println(i);
			}
				
		}
	input.close();
	}
	
}
