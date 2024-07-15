public class arrays {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "mehmet";
        ogrenciler[1] = "ahmet";
        ogrenciler[2] = "bugra";
   //1.yöntem
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        //2.yöntem
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }}
