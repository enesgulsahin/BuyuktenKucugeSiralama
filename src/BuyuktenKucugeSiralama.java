import java.util.Scanner;
public class BuyuktenKucugeSiralama {
    public static void main(String [] args){
    Scanner inp = new Scanner(System.in);
    int a,b,c;
        System.out.print("1.sayı:");
        a = inp.nextInt();
        System.out.print("2.sayı:");
        b = inp.nextInt();
        System.out.print("3.sayı:");
        c = inp.nextInt();
            if((a > b) && (a > c)) {
                if (b > c) {
                    System.out.print("a > b > c");
                }else{
                    System.out.print("a > c > b");
                }
            }else if((b > a) && (b > c)){
                if (a > c){
                    System.out.print("b > a > c");
                }else{
                    System.out.print("b > c > a");
                }
            }else {
                if(a > b){
                    System.out.print("c > a > b");
                }else{
                    System.out.print("c > b > a");
                }
            }
    }
}
