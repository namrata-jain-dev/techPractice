//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}


//
//public class Main
//{
//    static void printHistogram(int arr[]){
//        int ln = arr.length ;
//        int max = 0 ;
//        for(int i = 0 ; i < arr.length;i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//
//        for(int i = 0 ; i <= max;i++){
//            for(int j = 0 ; j < ln ; j++){
//                if(i<max-arr[i]){
//                    System.out.print(' ');
//                }
//                if((i+1)%2 ==0){
//                    System.out.print('A');
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        int[] array = {6,4,3,2,1,5,8};
//        printHistogram(array);
//    }
//}