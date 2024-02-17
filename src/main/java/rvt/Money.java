package rvt;

public class Money {

    private final int euros;
    private final int cents;

    // main constructor
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
        
    }
    public Money(int euros) {
        this(euros, 0);
    }
    public Money() {
        this(0, 0);
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + " EUR";
    }
    public boolean equals(Object c) {
        if (this == c) {
            return true;
        }
        if (!(c instanceof Money)) {
            return false;
        }
        Money o = (Money) c;
        return Double.compare(euros, o.euros) == 0
                && Double.compare(cents, o.cents) == 0;
    }
    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;
        if (totalCents >= 100) {
            totalCents = totalCents - 100;
            totalEuros += 1;

        }
        Money newMoney = new Money(totalEuros, totalCents); // create a new Money object that has the correct worth
    
        // return the new Money object
        return newMoney;
    }
    public Money plus(int euros) {
        return new Money(this.euros + euros, this.cents); // create a new Money object that has the correct worth
    }
    public Money plus(byte cents) {
        int TotalCents = this.cents + cents;
        int TotalEuros = this.euros;
        if (TotalCents >= 100) {
            TotalCents -= 100;
            TotalEuros++;
        }
        return new Money(TotalEuros, TotalCents);
    }

    public boolean lessThan(Money comparison) { // Checks if the object is lesser than the input
        int totalCentsA = this.euros * 100 + this.cents;
        int totalCentsB = comparison.euros * 100 + comparison.cents;
        if (totalCentsA < totalCentsB) {
            return true;
        } else {
            return false;
        }
    }
    public Money minus(Money subtraction) { // Returns the subtraction of A - B and returns 0 if the value is negative
        int totalEuros = this.euros - subtraction.euros;
        int totalCents = this.cents - subtraction.cents;
        Money blankMoney = new Money(0, 0);
        if (totalCents < 0) {
            totalCents = 100 + totalCents;
            totalEuros -= 1;
        }
        Money newMoney = new Money(totalEuros, totalCents);
        if (newMoney.euros < 0 || newMoney.cents < 0) {
            return blankMoney;
        } else {
            return newMoney;
        }
    }
}