import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main(String[] args) {
        int matematika, bhsInggris, bhsIndonesia, ipa;
        int passingGradeSMK, passingGradeSastra, passingGradeTIK;
        boolean ispassingSMK, ispassingSastra, ispassingTIK;
        double averageUjian, averageBahasa;

        Scanner input = new Scanner(System.in);

        passingGradeSMK = 73;
        passingGradeSastra = 75;
        passingGradeTIK = 50;

        System.out.println("Selamat datang!! mari kita lihat apakah kamu memenuhi syarat PPDB SMK 79. Mari kita cek nilaimu sahabat > y <");

        System.out.print("Berapa nilai ujian matematikamu sahabat? ");
        matematika = input.nextInt();
        System.out.print("Berapa nilai ujian Bahasa Inggris sahabat? ");
        bhsInggris = input.nextInt();
        System.out.print("Berapa nilai ujian Bahasa Indonesia sahabat? ");
        bhsIndonesia = input.nextInt();
        System.out.print("Berapa nilai ujian IPA sahabat? ");
        ipa = input.nextInt();

        averageUjian = (matematika + bhsInggris + bhsIndonesia + ipa) / 4.0;
        averageBahasa = (bhsInggris + bhsIndonesia) / 2.0;

        ispassingSMK = averageUjian >= passingGradeSMK;
        ispassingSastra = averageBahasa >= passingGradeSastra;
        ispassingTIK = matematika >= passingGradeTIK;

        System.out.println("\n\nHasil dari pengecekan nilai untuk syarat PPDB SMK 79 sahabat adalah sebagai berikut:");
        System.out.println("==============================================================================================");
        System.out.println("Apakah sahabat memenuhi syarat masuk SMK 79? " + ispassingSMK);
        System.out.println("Apakah sahabat memenuhi syarat masuk jurusan Sastra? " + ispassingSastra);
        System.out.println("Apakah sahabat masuk jurusan TKJ? " + ispassingTIK);
    }
}
