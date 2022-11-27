package app.chap11.policy;

import app.chap2.movie.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
