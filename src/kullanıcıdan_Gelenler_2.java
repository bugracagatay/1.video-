import java.util.Scanner;

public class kullanıcıdan_Gelenler_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yazi;
        System.out.print("adınız; ");
        yazi = scan.nextLine();
        System.out.println("merhaba " + yazi + ",nasilsin?");
        if(yazi.equalsIgnoreCase("ali")){
            System.out.println("amcan nasil?");
        }

    }
}
