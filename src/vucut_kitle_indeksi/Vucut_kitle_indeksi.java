//Klavyeden Girilen Boy Ve Kilonun Verilerini İşleyip Kişinin Vücut Kitle İndeksini Hesaplayan program.

/*
Adım 1: Başla.
Adım 2: Kullanıcıdan bOY Ve Kilo Değerlerini Al.
Adım 3: Aldığın Değerleri double indeks =(vucutagirligi/(boy*boy)) Formülü İle Hesapla.
Adım 4: Hesapladığın Değeri Ekrana Yazdır.
Adım 5: Hesapladığın Değerin Hangi Aralıkta Olduğuna Dair Kullanıcıya Bilgi Ver.
Adım 6: Dur.
*/
package vucut_kitle_indeksi;
import java.util.Scanner; //Java'nın Util kütüphanesinden Scanner Class'ı Programımıza import ettik.


public class Vucut_kitle_indeksi {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Consoldan Değer Almak İçin Tanımladık.
        
        System.out.println("Vücut Ağırlığınızı Giriniz :");
        double vucutagirligi = input.nextDouble();
        System.out.println("Boyunuzun Uzunluğunu Santimetre Cinsinden Giriniz : _,__");
        double boy =input.nextDouble();
        
        double indeks =(vucutagirligi/(boy*boy)); //İndeksi =(kg/m^2) Formülü İle Hesapladık.
        
        System.out.println("Vücut Kitle İndeksiniz :" +indeks); //Hesapladığımız Değeri Ekrana Yazdırıdk.
        
        /*
        Ekrana Yazdırıdığımız Değerin Hangi Aralıkta Olduğunu Kullanıcıya Bildirdik Ve
        Bu Aralıklrda Olan Kişilerin Durumunda Açıklama Yaptık.
        */
        
        System.out.println("18, 5 kg/m² ‘nin altındaki sonuçlar: İdeal kilonun altında ,");
        System.out.println("18, 5 kg/m² ile 24, 9 kg/m² arasındaki sonuçlar: İdeal kiloda ,");
        System.out.println("25 kg/m² ile 29, 9 kg/m² arasındaki sonuçlar: İdeal kilonun üstünde ,");
        System.out.println("30 kg/m² ile 39, 9 kg/m² arasındaki sonuçlar: İdeal kilonun çok üstünde (Obez) ,");
        System.out.println("40 kg/m² üzerindeki sonuçlar: İdeal kilonun çok üstünde (Morbid Obez) .");
        
        
    }
    
}
