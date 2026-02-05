import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        System.out.println("How tall are you?");
        Scanner newObj = new Scanner(System.in);
        TivoliRide s1 = new TivoliRide();
        s1.height = Integer.parseInt(newObj.nextLine());
        s1.work();


    }

    }


