class ImaginaryNumber {
    int realPart;
    int imaginaryPart;//1912
    void printNumber() {
        System.out.println(realPart + " + " + imaginaryPart + "i");
    }
}

public class Assignment24 {
    public static void main(String[] args) {
        ImaginaryNumber num1 = new ImaginaryNumber();
        num1.printNumber();
        System.out.println("1********");
        num1.realPart = 3;
        num1.imaginaryPart = 7;
        num1.printNumber();
        System.out.println("2********");
        ImaginaryNumber num2 = new ImaginaryNumber();
        num2.realPart = 1;
        num2.imaginaryPart = 9;
        num2.printNumber();
    }
}
