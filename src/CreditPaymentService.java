public class CreditPaymentService {
    public double calculate (double year, double bodyCredit) {
        double percent = 9.99; // Процентная ставка
        double r = percent / 100 / 12; // Ставка в месяц
        double m = bodyCredit * ((r * Math.pow((1 + r), 12 * year)) / (Math.pow((1 + r), 12 * year) - 1));

        return m;


    }
}
