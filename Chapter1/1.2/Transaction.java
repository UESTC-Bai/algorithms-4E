public class Transaction {
    private String who; // customer
    private date when; // date
    private double amount; // amount
    public Transaction(String who, date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public Transaction(String transaction) {
        String[] fields = transaction.split("\\s+");
        who = fields[0];
        when = new date(fields[1]);
        amount = Double.parseDouble(fields[2]);
    }
    public String getWho() {
        return who;
    }
    public void setWho(String who) {
        this.who = who;
    }
    public date getWhen() {
        return when;
    }
    public void setWhen(date when) {
        this.when = when;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    /**
     * Exercise 1.2.14
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Transaction that = (Transaction) obj;
        if (!this.who.equals(that.who)) {
            return false;
        }
        if (this.when.year()!=that.when.year() || this.when.month()!=that.when.month() || this.when.day()!=that.when.day()) {
            return false;
        }
        if (this.amount != that.amount) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("Turing", new date(5, 22, 1939), 11.99);
        Transaction transaction2 = new Transaction("Turing 5/22/1939 11.99");
        System.out.println(transaction1.equals(transaction2));
    }
}
