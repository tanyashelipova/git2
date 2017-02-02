import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] sArray = s.split(" ");
        System.out.println(addition(Integer.valueOf(sArray[0]),Integer.valueOf(sArray[1])));

        scan = new Scanner(System.in);
        s = scan.nextLine();
        String[] sArray2 = s.split(" ");
        System.out.println(subtraction(Integer.valueOf(sArray2[0]),Integer.valueOf(sArray2[1])));
		
		scan = new Scanner(System.in);
        s = scan.nextLine();
        String[] sArray3 = s.split(" ");
        System.out.println(multiplication(Integer.valueOf(sArray3[0]),Integer.valueOf(sArray3[1])));

    }

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int subtraction(int a, int b) {
        int sum = a - b;
        return sum;
    }
    public static int multiplication(int a, int b) {
        int sum = a * 2;
        return sum;
    }
}