package loop_programs;
public class ZomatoOrderSummary {
    public static void main(String[] args) {
        int[] orderAmounts = {250, 480, 320, 190, 610, 450, 370, 220};
        int total = 0;
        int index = 0;

        while (index < orderAmounts.length) {
            total += orderAmounts[index];
            index++;
        }

        System.out.println("Total amount spent this month: $" + total);
    }
}
