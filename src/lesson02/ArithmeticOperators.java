package lesson02;

public class ArithmeticOperators {

    public static void main(String[] args) {

        //+ - * / %
        // -1
        // 3 - 4
 int x = 20, y = -1;
 int result = x + y;
        System.out.println(result); // 19
        byte var01 = 89, var02 = 11;
        int byteResult = var01 + var02;
        int byteResult02 = (byte) (var01 + var02);

        double bill = 503;
        double halfBill = bill / 2;
        System.out.println(halfBill);

        int number = 101, divisor = 10;
        int withoutLastDigit01= number / divisor;
        System.out.println(withoutLastDigit01);
        // округления не происходит, просто отбрасывается остаток, выводится целое число
        int number1 = 101, divisor1 = 10;
        double withoutLastDigit02 = (double) number1 / divisor1;
        System.out.println(withoutLastDigit02);
        // если привести к типу дабл, будет корректно

        int n = 40;
        long m = 100L;
        long nmResult = n * m;
        System.out.println(nmResult);

        number = 9;
        divisor = 2; // 2 + 2 + 2 +2 ....
        int evenOrOddResult = number % divisor; // 1
        System.out.println(evenOrOddResult);

        number = 153;
        divisor = 10;
        int lastDigit = number % divisor; // 3
        System.out.println(lastDigit);

var var1 = 60L;
var var2 = -20;
var var3 = 10.5;
var varResult = var1 + var2 * var3;
        System.out.println(varResult); // double

        int num = 10;
        num = num + 10;
        num += 10;
        num -= 10;
        num *= 10;
        num /= 10;
        num %= 10;
        System.out.println(num);




    }
}
