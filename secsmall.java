public class secsmall {
    public static void main(String [] args){
        int [] arr= {1,1, 2,3 };

        if(arr.length<2){
            System.out.println("need more elements");
            return;
        }

        int min=arr[0];
        int secmin=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                secmin=min;
                min=arr[i];
            }
            if(arr[i]>min && arr[i]<secmin){
                secmin=arr[i];
            }
        }

        System.out.println("second smallest element is : " + secmin);

    }
    
}
