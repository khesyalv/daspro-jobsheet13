import java.util.Scanner;

public class UcapanTerimaKasih16 {
    public static String PenerimaUcapan() {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + namaOrang + " for being the best teacher in the world.\n" 
        + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();

        // Menambahkan ucapan tambahan
        String ucapanTambahan = "Semoga sukses selalu!";
        UcapanTambahan(ucapanTambahan);
    }
}
