public class magicNo {

    static  int magicN (int n ){
        int rem = 0 ;
        String newNum = "";
        while(n>0){
            rem = n % 10;
            n = n / 10 ;
            if(rem == 9 ){
                newNum += "0";
            }else{
                newNum += rem+1 ;
            }
        }

        String newN = "" ;
        for(int i = newNum.length() - 1; i>=0 ;i--){
            newN += newNum.charAt(i);
        }
        return Integer.parseInt(newN);
    }


    static  int magicNSB (int n ){
        int rem = 0 ;
        StringBuilder newNum = new StringBuilder();
        while(n>0){
            rem = n % 10;
            n = n / 10 ;
            if(rem == 9 ){
                newNum.append("0");
            }else{
                newNum.append(rem + 1);
            }
        }
        newNum.reverse();
        return Integer.parseInt(newNum.toString());
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(magicN(3120));
        System.out.println(magicNSB(438));
        System.out.println(magicN(293));
        System.out.println(magicNSB(2460));

    }
}

