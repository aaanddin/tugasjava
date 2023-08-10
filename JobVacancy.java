import java.util.Scanner;

public class JobVacancy{
     public static void main(String[] args){
        int umur, pengalaman;
        double penampilan;
        String nama, jeniskelamin, lulusan;
        boolean reqkoor1, reqkoor2, reqadm1, reqadm2;
        boolean passingkoor, passingadm;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di PT.Jeno Aduhay");

        System.out.println("Input data kamu yaaa (jangan bohong awas)");

        System.out.println("jawab 'iya' coba ");
        input.next();

        System.out.println("namamu siapa? ");
        nama = input.next();

        System.out.println("umurmu berapa?" );
        umur = input.nextInt();

        System.out.println("Jenis kelaminmu? (perempuan/laki-laki)" );
        jeniskelamin = input.next();

        System.out.println("lulusan apa nih? (SMK/D3/S1)");
        lulusan = input.next();

        System.out.println("pengalamanmu?" );
        pengalaman = input.nextInt();

        System.out.println("kalo penampilannya?");
        penampilan = input.nextDouble();

        // syarat koordinator 1
        reqkoor1 = jeniskelamin.equalsIgnoreCase("laki-laki") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        // syarat koordinator 2
        reqkoor2 = jeniskelamin.equalsIgnoreCase("laki-laki") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

        // hasil posisi koordinator
        passingkoor = reqkoor1 || reqkoor2;

        // syarat admin 1
        reqadm1 = jeniskelamin.equalsIgnoreCase("wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        // syarat admin 2
        reqadm2 = jeniskelamin.equalsIgnoreCase("wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;

        // hasil posisi admin
        passingadm = reqadm1 || reqadm2;

        // output hasil
        System.out.println();
        System.out.println(nama + ", makasih yaa udah mengikuti lowongan kerja di PT. Jeno Aduhay\n");
        System.out.println("ini dia hasil untuk reqrutmen koordinator dan admin !!  ");
        System.out.println("kelulusan untuk koordinator :" + passingkoor);
        System.out.println("kelulusan untuk admin :" + passingadm);
        



     }


     }
