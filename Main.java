import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] sArray = s.split(" ");
        System.out.println(addition(Integer.valueOf(sArray[0]),Integer.valueOf(sArray[1])));

    }

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

}