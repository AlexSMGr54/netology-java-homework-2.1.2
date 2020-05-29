public class Main {
    public static void main(String[] args) {
        int balance = 100_00;
        int transfer = 1_100_00;
        int total = balance + transfer;

        if(transfer > 1_000_00) {
            int bonus = transfer / 100;
            total += bonus;
        }

        System.out.println((double) total / 100);
    }
}
