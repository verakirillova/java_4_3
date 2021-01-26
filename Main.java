public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();

        long calculete1 = service.calculate(1000000, 9.99f,12);
        System.out.println(calculete1);

        long calculete2 = service.calculate(1000000, 9.99f,24);
        System.out.println(calculete2);

        long calculete3 = service.calculate(1000000, 9.99f,36);
        System.out.println(calculete3);

    }

}
