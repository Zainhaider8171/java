/*Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
     */




import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	int i = 1;
	int t = i;
	
	while(i<=n) {
		
		int sp = 1;
		while(sp<=n-i) {
			System.out.print(" ");
			sp++;
			}int j = 1;
			int p = i ;
			while(j<=i) {
				
				System.out.print(p);
				p++;
				j++;
		
	}
				p = 2*i - 2;
		j=1;
			while(j<=i-1) {
			System.out.print(p);
			p--;
			j++;
			
		}
			
			System.out.println();
		i++;
	}
}
}
