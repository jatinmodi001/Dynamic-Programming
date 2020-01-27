/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class SubsetSum
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    
	    int n = scan.nextInt();
	    
	    int[] arr = new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = scan.nextInt();
	    }
	    
	    int sum = scan.nextInt();
	    
	    boolean[][] matrix = new boolean[n+1][sum+1];
	    
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=sum;j++){
	            if(j==0){
	                matrix[i][j] = true;
	            }
	            else if(i==0){
	                matrix[i][j] = false;
	            }
	            else if(j < arr[i-1]){
	                matrix[i][j] = matrix[i-1][j];
	            }
	            else{
	                matrix[i][j] = matrix[i-1][j] || matrix[i][j - arr[i-1]];
	            }
	        }
	    }
	    if(matrix[n][sum]){
	        System.out.println("YES");
	    }
	    else{
	        System.out.println("NO");
	    }
	}
}
