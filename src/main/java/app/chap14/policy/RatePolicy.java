package app.chap14.policy;

import app.chap14.Phone;
import app.chap2.movie.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
