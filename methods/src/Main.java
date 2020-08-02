public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMı = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMı = true;
                break;
            }
        }

        String mesaj="";
        if (varMı == false) {
            mesaj="Sayı mevcuttur:"+aranacak;
            mesajVer(mesaj);
            //mesajVer("Sayı mevcuttur:"+aranacak);
        } else {
            mesajVer("Sayı mevcut değildir:"+aranacak);
            //System.out.println("Sayı mevcut değildir:"+aranacak);
        }
    }

    /*public static void mesajVer(int aranacak) { // aranacak başka fonsiyonun yani metodun içinde olduğundan gönderimesi lazım.Buna parametreli metod denir.
        System.out.println("Sayı mevcuttur:"+aranacak);
    }*/
    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
