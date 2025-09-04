// Find the first non-repeating element in an array.

public class fnonrep {
    public static void main(String [] args){
        int [] arr= {2, 3, 4, 2, 3, 6, 4};
        int n= arr.length;


        for(int i=0;i<n;i++){
            int count=0;
            for(int j= 0;j<n;j++){              
                if(arr[i]== arr[j]){
                    count++;   
                }
            }

            if(count==1){
                System.out.println(arr[i]);
                return;
            }

          

        }
        

        
    }
    
}
