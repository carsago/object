package app.chap11.policy;

import app.chap11.Call;
import app.chap2.movie.Money;

public abstract class BasicRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            result.plus((calculateCallFee(call)));
        }
        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}
