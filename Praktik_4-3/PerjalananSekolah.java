import java.util.Scanner;
public class PerjalananSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah peserta: ");
        int peserta = input.nextInt();
        int jumlahBus = peserta / 45;
        int jumlahVan = peserta % 45;
        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Jumlah orang yang naik van: " + jumlahVan);
        input.close();
    }
}