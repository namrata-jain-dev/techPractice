import java.util.Scanner;

/// Problem Statement : Create a Bank Loan Eligibility System to
///  determine eligibility based on age, income, and loan type.
/// •	Home Loan: Age 25-60, income > ₹30000/month.
/// •	Car Loan: Age 21-55, income > ₹25000/month.
/// •	Personal Loan: Age 18-65, income > ₹20000/month.
/// Requirements:
/// 1.	Ask for the age, monthly income, and loan type (Home, Car, Personal).
/// 2.	Determine eligibility based on the rules and display whether the applicant
///  qualifies for the loan. If not, provide the reason (age, income, or loan type).///
public class Assignnment2 {
    static int age = 0;
    static double income = 0;
    static String loanType = "";
    static Scanner scanner = new Scanner(System.in);
    static void takeUserInput(){
        System.out.println("Enter Your Age : ");
        age = scanner.nextInt();
        System.out.println("Enter Your Monthly Income : ");
        income = scanner.nextDouble();
        System.out.println("Enter Your Loan Type such as (Home, Car, Personal): ");
        loanType = scanner.next();
    }

    static void loanEligibility(){
        boolean ageCheck = false ;
        switch (loanType.toLowerCase()){
            case "home" :  {
               if(age >= 25 && age <= 60 ) {
                   if(income > 30000){
                       System.out.println("Congratulations you are eligible for Home Loan");
                   }else{
                       System.out.println("Sorry you are not eligible for Home Loan because of your Income");
                   }
               }else{
                   if(income > 30000){
                       System.out.println("Sorry you are not eligible for Home Loan because of your Age");
                   }else {
                       System.out.println("Sorry you are not eligible for Home Loan because of your Age and  Income both");
                   }
               }
               break;
            }
            case "car" : {
                if(age >= 21 && age <= 55  ) {
                    if(income > 25000){
                        System.out.println("Congratulations you are eligible for Car Loan");
                    }else{
                        System.out.println("Sorry you are not eligible for Car Loan because of your Income");
                    }
                }else{
                    if(income > 25000){
                        System.out.println("Sorry you are not eligible for Car Loan because of your Age");
                    }else {
                        System.out.println("Sorry you are not eligible for Car Loan because of your Age and  Income both");
                    }
                }
                break;
            }
            case "personal" : {
                if(age >= 18 && age <= 65 ) {
                    if ( income > 20000 ) {
                        System.out.println("Congratulations you are eligible for Personal Loan");
                    }else {
                        System.out.println("Sorry you are not eligible for Personal Loan because of your Income");
                    }
                }else{
                    if(income > 20000){
                        System.out.println("Sorry you are not eligible for Personal Loan because of your Age");
                    }else {
                        System.out.println("Sorry you are not eligible for Personal Loan because of your Age and  Income both");
                    }
                }
                break;
            }
            default : {
                System.out.println("Sorry you are not eligible for Loan because the loan type is not valid");
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("<<--- Loan Eligibility System --->>");
        takeUserInput();
        loanEligibility();
    }
}
