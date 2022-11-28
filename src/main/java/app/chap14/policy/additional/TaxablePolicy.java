package app.chap14.policy.additional;

import app.chap14.policy.RatePolicy;
import app.chap14.policy.additional.AdditionalRatePolicy;
import app.chap2.movie.Money;

public class TaxablePolicy extends AdditionalRatePolicy {
    private double taxRatio;

    public TaxablePolicy(RatePolicy next, double taxRatio) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
