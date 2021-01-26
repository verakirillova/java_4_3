public class CreditPaymentService {
    public long calculate(int sk, float ps, int n) {
        double psMonth = (double) (ps/ 100 / 12);
        double credit = ((double)sk)*psMonth/(1-Math.pow(1+psMonth,(double)-n));
        return (long) credit;

    }

    }
