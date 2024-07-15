public class methodders {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
            int[] sayilar = new int[]{1,2,5,7,9,0};
            int aranacak=3;
            boolean varMi=false;
            for (int sayi:sayilar){
                if(sayi==aranacak){
                    varMi=true;
                    break;
                }
            }
            if (varMi){
                System.out.println("sayi mevcuttur:"+aranacak);
            }
            else{
                System.out.println("sayi mevcut değildir:"+aranacak);
            }


        }


}
