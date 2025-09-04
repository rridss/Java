// find missing number from array 

public class missnum{
    public static void main(String [] args){
        int [] arr= {1, 2, 4, 5, 6};
        int n = arr.length+1;    

        //  ARR.LENGTH+1 BECAUSE ACTUAL LENGTH SHHOULD BE 6 BECAUSE 1 NUM IIS MISSING
        int actual_sum=0;

        for(int i=0;i<n-1;i++){
            actual_sum += arr[i];
        }

        int exp_sum = n*(n+1)/2;

        int miss= exp_sum-actual_sum;

        System.out.println(miss);
        
    }
}