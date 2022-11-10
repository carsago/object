package app.chap2.movie.policy;

import app.chap2.movie.Screening;

public interface DiscountCondition {
    public  boolean isSatisfiedBy(Screening screening);
}
