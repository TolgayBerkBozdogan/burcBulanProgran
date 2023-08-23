import java.util.Scanner;

public class burcBulanProgran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  day;
        String month;
        System.out.print("Doğduğunuz Günü Girin: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz Ayı Giriniz: ");
        month = input.next();
        if (month.equals("Mart")) {
            if((day>= 21) && (day <=31)) {
                System.out.print("Koç");
            }else if(day<=21){
                System.out.print("Balık");
            }else{
                System.out.print("Geçersiz Gün Girdiniz! Lütfen Tekrar Deneyin.");
            }
        }else if (month.equals("Nisan")) {
            if((day>= 21) && (day <=30)) {
                System.out.print("Boğa");
            }else{
                System.out.print("Koç");
            }
        }else if (month.equals("Mayıs")) {
            if((day>= 22) && (day <=31)) {
                System.out.print("İkizler");
            }else{
                System.out.print("Boğa");
            }
        }else if (month.equals("Haziran")) {
            if((day>= 23) && (day <=30)) {
                System.out.print("Yengeç");
            }else{
                System.out.print("İkizler");
            }
        }else if (month.equals("Temmuz")) {
            if((day>= 23) && (day <=31)) {
                System.out.print("Aslan");
            }else{
                System.out.print("Yengeç");
            }
        }else if (month.equals("Ağustos")) {
            if((day>= 23) && (day <=31)) {
                System.out.print("Başak");
            }else{
                System.out.print("Aslan");
            }
        }else if (month.equals("Eylül")) {
            if((day>= 23) && (day <=30)) {
                System.out.print("Terazi");
            }else{
                System.out.print("Başak");
            }
        }else if (month.equals("Ekim")) {
            if((day>= 23) && (day <=31)) {
                System.out.print("Akrep");
            }else{
                System.out.print("Terazi");
            }
        }else if (month.equals("Kasım")) {
            if((day>= 22) && (day <=30)) {
                System.out.print("Yay");
            }else{
                System.out.print("Akrep");
            }
        }else if (month.equals("Aralık")) {
            if((day>= 22) && (day <=31)) {
                System.out.print("Oğlak");
            }else{
                System.out.print("Yay");
            }
        }else if (month.equals("Ocak")) {
            if((day>= 22) && (day <=31)) {
                System.out.print("Kova");
            }else{
                System.out.print("Oğlak");
            }
        }else if (month.equals("Şubat")) {
            if((day>= 20) && (day <=29)) {
                System.out.print("Balık");
            }else{
                System.out.print("Kova");
            }
        }
    }
}
