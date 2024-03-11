import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți o propoziție:");

        String propozitie = scanner.nextLine();

        System.out.println("Ați introdus: " + propozitie);

        scanner.close();
    }
}
