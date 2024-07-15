public class Switchdemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("mükemmel: gectiniz");
                break;
            case 'B':
                System.out.println("Çok güzel: gecriniz");
                break;
            case 'C':
                System.out.println("iyi: gectiniz");
                break;
            case 'D':
                System.out.println("fena değil: gectiniz");
                break;
            case 'f':
                System.out.println("maalesef: kaldınız");
                break;
            default:
                System.out.println("gecersiz not girdiniz");


        }
    }
}
