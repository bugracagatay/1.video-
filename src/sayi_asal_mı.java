public class sayi_asal_mı {
    public static void main(String[] args) {
        int number=-9;
        int kalan=number% 2;
        System.out.println(kalan);
        boolean isprime=true;
        if(number==1){
            System.out.println("sayi asal değil");
            return;
        }
        if(number<1){
            System.out.println("gecersiz sayi girdiniz");
        }

        for(int i=2;i<number;i++){
            if(number%i==0){
                isprime=false;
            }

        }
        if(isprime==true){
            System.out.println("sayi asaldir");
        }
        else{
            System.out.println("sayi asal değildir");
        }
    }
}
