import java.util.Arrays;

public class FindPair {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i=0,j=1;
        while(i<n&&j<n){
            if(i!=j && arr[j]-arr[i]==x)return 1;
            else if(arr[j]-arr[i]<x)j++;
            else i++;
        }
        return -1;
    }   
}
