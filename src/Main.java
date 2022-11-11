import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);

        int no,sum=0;

        System.out.print("Bir sayı giriniz: ");
        no=inp.nextInt();

        while(no!=0)
        {
            sum+= (no%10);
            no/=10;
        }
        System.out.println("Girilen sayının basamak değerlerinin toplamı: "+sum);
    }
}