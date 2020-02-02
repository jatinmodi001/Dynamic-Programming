// Problem  : https://www.interviewbit.com/problems/edit-distance/

public class Solution {
    public int minDistance(String A, String B) 
    {
        int arr[][] = new int[A.length()+1][B.length()+1];
        for(int i=0;i<=A.length();i++)
        {
            for(int j=0;j<=B.length();j++)
            {
                if(i == 0)
                {
                   arr[i][j] = j; 
                }
                else if(j == 0)
                {
                   arr[i][j] = i; 
                }
                else if(A.charAt(i-1) == B.charAt(j-1))
                {
                    arr[i][j] = arr[i-1][j-1];
                }
                else{
                    arr[i][j] = min(arr[i-1][j],arr[i][j-1],arr[i-1][j-1])+1;
                }
            }
        }
        return arr[A.length()][B.length()];
    }
    public int min(int a,int b,int c)
    {
        if(a < b && a < c)
        {
            return a;
        }
        if(b < c)
            return b;
        return c;
    }
}
