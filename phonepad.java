public class phonepad { //code for number showing in keypad to write a char

    public static void main(String[] args) {
    pad("", "12");
    }

    static void pad(String p,String up){
        if (up.isEmpty() ){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 2; i <digit *2; i++){  //by changing the num we can change the value of char contains at 1
            char ch = (char) ('a' + i);
            pad(p+ ch, up.substring(1));
        }

    }
}
