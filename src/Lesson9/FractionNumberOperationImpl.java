package Lesson9;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        //
        FractionNumber fractionNumber = new FractionNumberImpl();
        //
        if (a.getDivisor() == b.getDivisor()) {
            fractionNumber.setDividend(a.getDividend() + b.getDividend());
            fractionNumber.setDivisor(a.getDivisor());
            return fractionNumber;
        }
        //
        fractionNumber.setDivisor(a.getDivisor() * b.getDivisor());
        for (int i = 1; i < fractionNumber.getDivisor(); i++) {
            if (i % a.getDivisor() == 0 && i % b.getDivisor() == 0) {
                fractionNumber.setDivisor(i);
            }
        }
        //
        fractionNumber.setDividend((a.getDividend() * b.getDivisor()) + (a.getDivisor() * b.getDividend()));
        //
        for (int i = 1; i < fractionNumber.getDivisor(); i++) {
            if (fractionNumber.getDividend() % i == 0 && fractionNumber.getDivisor() % i == 0) {
                fractionNumber.setDividend(fractionNumber.getDividend() / i);
                fractionNumber.setDivisor(fractionNumber.getDivisor() / i);
            }
        }
        return fractionNumber;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        //
        FractionNumber fractionNumber = new FractionNumberImpl();
        //
        if (a.getDivisor() == b.getDivisor()) {
            fractionNumber.setDividend(a.getDividend() - b.getDividend());
            fractionNumber.setDivisor(a.getDivisor());
            return fractionNumber;
        }
        //
        fractionNumber.setDivisor(a.getDivisor() * b.getDivisor());
        for (int i = 1; i < fractionNumber.getDivisor(); i++) {
            if (i % a.getDivisor() == 0 && i % b.getDivisor() == 0) {
                fractionNumber.setDivisor(i);
            }
        }
        //
        fractionNumber.setDividend((a.getDividend() * b.getDivisor()) - (a.getDivisor() * b.getDividend()));
        //
        for (int i = 1; i < fractionNumber.getDivisor(); i++) {
            if (fractionNumber.getDividend() % i == 0 && fractionNumber.getDivisor() % i == 0) {
                fractionNumber.setDividend(fractionNumber.getDividend() / i);
                fractionNumber.setDivisor(fractionNumber.getDivisor() / i);
            }
        }
        return fractionNumber;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        //
        FractionNumber fractionNumber = new FractionNumberImpl();
        //
        fractionNumber.setDivisor(a.getDivisor() * b.getDivisor());
        for (int i = 1; i < fractionNumber.getDivisor(); i++) {
            if (b.getDividend() % i == 0 && b.getDivisor() % i == 0) {
                fractionNumber.setDividend(b.getDividend() / i);
                fractionNumber.setDivisor(b.getDivisor() / i);
            }
        }

        fractionNumber.setDividend(a.getDividend() * fractionNumber.getDividend());
        fractionNumber.setDivisor(a.getDivisor() * fractionNumber.getDivisor());

        return fractionNumber;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        //
        FractionNumber fractionNumber = new FractionNumberImpl();
        //
        fractionNumber.setDivisor(a.getDivisor() * b.getDivisor());
        for (int i = 1; i < fractionNumber.getDivisor(); i++) {
            if (b.getDividend() % i == 0 && b.getDivisor() % i == 0) {
                fractionNumber.setDivisor(b.getDividend() / i);
                fractionNumber.setDividend(b.getDivisor() / i);
            }
        }
        fractionNumber.setDividend(a.getDividend() * fractionNumber.getDividend());
        fractionNumber.setDivisor(a.getDivisor() * fractionNumber.getDivisor());
        return fractionNumber;
    }
}
