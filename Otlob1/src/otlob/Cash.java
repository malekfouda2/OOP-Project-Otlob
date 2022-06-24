package otlob;
import java.util.Scanner;
public class Cash implements iPay{
    private static int cashOnHand;
    private static int amountIn;
    private static int cashback;
    Scanner a=new Scanner(System.in);
@Override
    public void payCash() {
        System.out.println("Enter the amount you will pay: ");
        cashOnHand=a.nextInt();
        //el mafrood hena ashan netala3lo ba2y neb2a mzabaten el prices aw neb2a 3amlen variable prices aw object ayan kan
        //3shan ne3raf ne3ml if condition ashan nedelo el ba2y maslaaan
        
    }

    @Override
    public void payVisa() {
    }

    @Override
    public void payDebitCard() {
    }
}
