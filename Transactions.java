public class Transactions {
    private String transactionId;
    private String accountNumber;
    private String transactionType;
    private double amount;
    private String timeStamp;

    public Transactions(String transactionId, String accountNumber, String transactionType, double amount, String timeStamp) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimeStamp() {
        return timeStamp;
    }
}
