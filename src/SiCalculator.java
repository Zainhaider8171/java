import java.util.Scanner;
public class SiCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		
		int avg = (m1+m2+m3)/3;
		System.out.println(str);
		System.out.println(avg);
	}

}
