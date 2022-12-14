import java.util.Scanner;

public class AdvancedCalc {

    static void plus (int a, int b) {
        int result = a + b ;
        System.out.println("Toplam : "+result);
    }
    static void minus(int a,int b){
        int result = a-b;
        System.out.println("Çıkarma : "+result);
    }
    static void times(int a,int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
    }
    static void divided(int a ,int b){
        if(b == 0){
            System.out.println("b sayısı 0'dan farklı olmalıdır");
        }else{
            int result = a/b;
            System.out.println("Bölme : " +result);
        }
    }
    static void power(int a,int b){
        int result = 1;
        for(int i = 1;i <= b;i++){
            result *= a;
        }
            System.out.println("Üs alma işlemi : "+result);
    }
    static void fact(int a){
        int result = 1;
        for(int i = 1;i <= a ;i++){
            result *= i;
        }
            System.out.println("Faktoriyel : "+result);
    }
    static void mod(int a,int b){
        int result = a % b;
        System.out.println("Mod sonucu : " + result);
    }
    static void calc(int a,int b){
        int alan =a*b;
        int cevre = 2*(a+b);
        System.out.println("Alan : "+alan);
        System.out.println("Çevre : "+cevre);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while(true){
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();
            if (select == 0 ){
                break;
            }
            System.out.print("İlk sayı : ");
            int a = scan.nextInt();
            System.out.print("İkinci sayı : ");
            int b = scan.nextInt();

            switch(select){
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    fact(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Yanlış bir tuşlama yaptınız");



            }
        }
        System.out.println("İyi günler !");

    }


    }

