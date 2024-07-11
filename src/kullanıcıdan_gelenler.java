import java.util.Scanner;
public class kullanıcıdan_gelenler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yazi;
        System.out.print("adınız; ");
        yazi=scan.nextLine();
        System.out.println("merhaba " + yazi +",nasilsin?");
        System.out.print("yaşınız: ");
        int yas;
        yas= scan.nextInt();
        int dogum=2024 - yas;
        System.out.println("ooooo " + dogum + " yılında doğmuşsunuz...");


    }
}
