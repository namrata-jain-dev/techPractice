public class printHistogram {
    static void printhistogram(int[] arr){
        int ln = arr.length ;
        int max = 0 ;
        for (int k : arr) {
            if (max < k) {
                max = k;
            }
        }

        for(int i = 0 ; i < max; i++){
            for(int j = 0 ; j < ln ; j++){
                if(i < max-arr[j]){
                    System.out.print("   ");
                }else{
                   if((j+1)%2 ==0){
                    int val = Math.abs(max-arr[j]-i);
                    System.out.print(" "+(char)(65+val)+" ");
//                    System.out.print(val);
                   }else{
                    System.out.print(" * ");
                   }
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] array = {6,4,3,2,1,5,8,7,2,9,4};
        printhistogram(array);
    }
}
