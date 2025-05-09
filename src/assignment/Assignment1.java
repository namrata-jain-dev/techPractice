package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    /*
    You are creating a program to help a store manage its product inventory. Complete the following tasks:

a) Allow the user to enter the stock quantity for 5 products and store them in an array.
b) Display all the entered quantities.
c) Repeatedly ask the user whether they want to see the total stock value. If the user types "yes",
show the total again. Stop asking when the user types "no".
d) Count how many products have more than 100 items in stock and display the result.
e) Convert the array into an ArrayList. Then, display all product quantities and remove any
that are zero, as these represent out-of-stock items.
*/
    static int[] takeUserInput(Scanner sc){
        int[] stockQuantity = new int[5];
        System.out.println("Enter The Stock Quantities for 5 products");
        for(int i = 0 ; i < stockQuantity.length ;i++){
            System.out.println("Enter value for "+i+" index & Press Enter");
            stockQuantity[i] = sc.nextInt();
        }
        return stockQuantity;
    }

    static void showQuantities(int[] arr){
        for(int i = 0 ; i < arr.length ;i++){
            System.out.println("The stock quantity at index "+i+" is "+arr[i]);
        }
    }

    static void repeatShowingTotal(Scanner sc,int[] arr){
        String toggleShow;
        int sum = 0 ;
        for (int value : arr){
            sum += value;
        }
        while(true){
            System.out.println("Do you want to see the total stock value ? (yes/no) - ");
            toggleShow = sc.next();
                if(toggleShow.trim().equalsIgnoreCase("yes")){
                    System.out.println("The total stock value is "+sum);
                }else if(toggleShow.trim().equalsIgnoreCase("no")){
                    break;
                }else{
                    System.out.println("Please type yes or no for results");
                }
        }
    }

    static int countMoreThan100Stocks(int[] arr){
        int count = 0;
        for (int val : arr){
            if (val > 100){
                count ++;
            }
        }
        return count ;
    }


    static void arrayListConversion(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int val : arr){
            arrayList.add(val);
        }
        System.out.println("The respective arraylist is "+arrayList);

    }

    static int[] removeOutOfStock(int[] arr){
        int j = 0;
        int countOutOfStock = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                arr[i] = arr[i+1];
                j = arr.length-1-i;
                countOutOfStock++;
            }
            if(i+1< arr.length){
                if(j != 0){
                    arr[i] = arr[i+1];
                    j--;
                }
            }
        }
        int[] res = new int[arr.length-countOutOfStock-1];
//        for(int i = 0 ; i < res.length ; i++){
//            res[i] = arr[i];
//        }
        System.arraycopy(arr, 1, res, 1, res.length);
        return res;
    }



    public static void main(String[] args){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int[] stockQuantity = new int[5];
        stockQuantity = takeUserInput(sc);
        showQuantities(stockQuantity);
        repeatShowingTotal(sc,stockQuantity);
        int res = countMoreThan100Stocks(stockQuantity);
        System.out.println("The no of items which are having more than 100 quantity are "+res);
        arrayListConversion(stockQuantity);
        removeOutOfStock(stockQuantity);
        System.out.println("The respective arraylist after removing out of stock items is "+ Arrays.toString(removeOutOfStock(stockQuantity)));
    }
}
