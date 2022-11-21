import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Truk truk = new Truk();
        Mobil mobil =new Mobil();



        System.out.println("Masukkan namamu");
        String UN = scanner.nextLine();
        System.out.println("Halo " + UN +" Ini adalah contoh program OOP sederhana ");
        System.out.println("yang akan menampilkan informasi tentang Truk dan mobil");


        System.out.println("1.Mobil");
        System.out.println("2.Truk");
        System.out.println("Masukkan pilihan mu :");
        int pilihan = scanner.nextByte();

        if (pilihan == 1){
            System.out.println("Kamu memilih mobil maka : ");

            Mobil.maju();
            Mobil.mundur();
            Mobil.pabrikasal();
            Mobil.kecepatanmob();

        }
        else if (pilihan == 2){
            System.out.println("Kamu memilih truk maka : ");

            Motor.majutruk();
            Motor.mundurtruk();
            Motor.pabrikasal();
            Motor.kecepatantruk();

        }
        else {
            System.out.println("Maaf pilihan yang anda tidak tersedia");
        }




    }
}