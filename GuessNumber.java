import java.util.Scanner;

public class GuessNumber{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int secret, guess;
        boolean pass = false;

        secret = 1 + (int)(Math.random()*10);
        System.out.println("aku lagi mikirin satu nomor dari 1 - 10 di kepala aku");
        System.out.println("coba kamu tebak nomor berapa itu");
        System.out.println("nomor yang kamu tebak :");

        for(int i=0; i < 3 ; i++){
            guess = input.nextInt();
            if(guess == secret){
                System.out.println("HOREE KAMU BENERR!!");
                System.out.println("KAMU BERHASIL BACA PIKIRAN AKU");
                pass = true;
                break;
            }else if(Math.abs(guess - secret) == 1){
                System.out.println("panasss");
            }else if(Math.abs(guess - secret) == 2){
                System.out.println("angett");
            }else{
                System.out.println("dingiinn brrr");
            }
        }
        System.out.println("salahhh");
        System.out.println("nomor yang bener tuh " +secret+ " huuu");
        System.out.println("kamu gabisa baca pikiran akuuu");
        
    }
}