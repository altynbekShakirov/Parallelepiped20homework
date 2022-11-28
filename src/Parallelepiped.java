import java.util.InputMismatchException;
import java.util.Scanner;

public class Parallelepiped {
    private static int height;
    private static int length;
    private static int width;


    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("             CHOOSE                ");
            System.out.println("AREA== 1                  VOLUME== 2");

            byte b = scanner.nextByte();
            switch (b){
                case 1:
                    System.out.println("AREA: ");
                    break;
                case 2:
                    System.out.println("VOLUME");
            }
            System.out.println("Enter height");
            height = scanner.nextInt();
            System.out.println("Enter length");
            length = scanner.nextInt();
            System.out.println("Enter width ");
            width = scanner.nextInt();
            if (height < 0 || length < 0 || width < 0) {
                throw new RuntimeException("Berilgen san 0don kichine bolo albayt");
            } if (height > 20 || length > 20 || width > 20) {
                throw new RuntimeException("Berilgen san 20 dan kop bolo albayt ");
            }
                switch (b) {
                    case 1:
                        System.out.println("AREA :" + "\n" + area(height, length, width));
                        break;
                    case 2:
                        System.out.println("VOLUME :" + "\n" + volume(length, width, height));

                }
                if (b < 0 || b > 3) {
                    throw new RuntimeException();



            }

        } catch (InputMismatchException e) {
            System.err.println("tamga beruugo bolboyt ");
        }
        catch (RuntimeException e) {
            System.err.println("0 don kop  20 ga cheyinki san jazynyz ");

        }


    }

    public static int area(int height, int length, int width) throws ArithmeticException {

        int area = 2 * ((height * length) + (length * width) + (height * width));
        return area;


    }

    public static int volume(int length, int width, int height) throws ArithmeticException {

        int volume = (length * width * height);
        return volume;


    }


}
