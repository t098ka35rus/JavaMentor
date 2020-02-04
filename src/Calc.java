import java.io.IOException;

public class Calc {


    public static void main(String[] args) throws IOException {
        int firstDigit;
        int secondDigit;
        String oper;
        String num;
        int result = 0;


        InputHolder inputHolder = new InputHolder();
        inputHolder.ParceInput();
        firstDigit = inputHolder.getA();
        secondDigit = inputHolder.getB();
        oper = inputHolder.getC();
        num = inputHolder.getD();




        if (oper.equals("+")) {
            result = (firstDigit + secondDigit);
        }
        if (oper.equals("-")) {
            result = (firstDigit - secondDigit);
        }
        if (oper.equals("*")) {
            result = (firstDigit * secondDigit);
        }
        if (oper.equals("/")) {
            result = (firstDigit / secondDigit);
        }
        if (num.equals("arab")) {
            System.out.println(result);
        }
        if (num.equals("roman")) {
            RomanNumeral romanNumeral = new RomanNumeral();
            String s = romanNumeral.toRoman(result);
            System.out.println(s);
        }


    }
}








