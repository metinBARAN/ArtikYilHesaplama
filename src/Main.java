import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int artikYil;
        Scanner inp = new Scanner(System.in);

        System.out.println("Yil Giriniz:");
        artikYil = inp.nextInt();


        if (artikYil%100 == 0) {
            if (artikYil%400==0){
                System.out.println(artikYil+" bir artik yil");

            }else{
                System.out.println(artikYil+"  bir artik yil degil");
            }

        }

           else if (artikYil%4 == 0) {
                System.out.println(artikYil+" bir artik yil");
            }else{
                System.out.println(artikYil+" bir artik yil degildir");
            }



    }
}
