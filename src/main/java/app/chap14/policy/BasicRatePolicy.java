package app.chap14.policy;

import app.chap14.Call;
import app.chap14.Phone;
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
