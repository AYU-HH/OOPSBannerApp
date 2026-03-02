import java.util.Scanner;
public class l2q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();
        double areaSqCm = 0.5 * baseCm * heightCm;
        double areaSqIn = areaSqCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        input.close();
    }
}
