public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double cash = service.calculate(1, 1_000_000);

        System.out.println("Ежемесячный платеж при сроке кредита 1 год:");
        System.out.println(Math.round (service.calculate(1, 1_000_000)));
        System.out.println();

        System.out.println("Ежемесячный платеж при сроке кредита 2 года:");
        System.out.println(Math.round (service.calculate(2, 1_000_000)));
        System.out.println();

        System.out.println("Ежемесячный платеж при сроке кредита 3 года:");
        System.out.println(Math.round(service.calculate(3, 1_000_000)));

    }
}