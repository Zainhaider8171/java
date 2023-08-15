/*You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
Input format :
The first line contains an integer 'N' representing the size of the array/list.

The second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
Return the second largest element in the array/list.
Constraints :
0 <= N <= 10^2
1<=arr[i]<=10^3

Time Limit: 1 sec
Sample Input 1:
5
4 3 10 9 2
Sample Output 1:
9
Sample Input 2:
7
13 6 31 14 29 44 3
Sample Output 2:
31
*/






public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	int n =arr.length;
        int t1 = 0, t2 = -2147483648;
        for(int i=0; i<n; i++){
            if(arr[i]>t1){
                t1 = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]<t1 && arr[i]>t2){
                t2 = arr[i];
            }
        }
        return t2;
    }

}