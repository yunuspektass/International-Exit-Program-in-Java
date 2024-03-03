public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoş Geldiniz.");

        String sartlar = "Yurtdışu Çıkış Kuralları:\n"
                        +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n"
                        +"15 Tl harç bedelinizi tam olarak yatırmalısnız.\n"
                        +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";


        String message = "Yurt dışı şartlarından hepsini sağlamanız gerekiyor.";

        while (true){
            System.out.println("******************************************");

            System.out.println("******************************************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor.");

            Thread.sleep(3000); //programı 3 saniye bekletir.

           if ( yolcu.yurtdisiHarciKontrol() == false ){

               System.out.println(message);
               continue; // döngünün en başına döndürür
           }
            System.out.println("Siyasi yasak kontrol ediliyor.");

           Thread.sleep(3000);  //programı 3 saniye bekletir

            if (yolcu.siyasiYasakKontrol() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor.");

            Thread.sleep(3000);  //programı 3 saniye bekletir

            if (yolcu.vizeDurumuKontrol() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("İşlemleriniz tamamlandı. Yurt dışına çıkabilirsiniz.");

           break; // döngüyü sonlandırır.

        }
    }
}