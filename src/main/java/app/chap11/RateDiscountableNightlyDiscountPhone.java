package app.chap11;

import app.chap2.movie.Money;
import java.time.Duration;

public class RateDiscountableNightlyDiscountPhone extends NightDiscountPhone {
    private Money discountAmount;

    public RateDiscountableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds,
                                                Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
