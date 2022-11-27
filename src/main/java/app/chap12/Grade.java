package app.chap12;

public class Grade {
    private String name;
    private int upper;
    private int lower;

    public Grade(String name, int upper, int lower) {
        this.name = name;
        this.upper = upper;
        this.lower = lower;
    }

    public boolean isName(String name) {
        return this.name.equals(name);
    }

    public boolean include(int score) {
        return score >= lower && score <= upper;
    }

    public String getName() {
        return name;
    }

    public int getUpper() {
        return upper;
    }

    public int getLower() {
        return lower;
    }
}
