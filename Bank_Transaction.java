public class Bank_Transaction {
    private String account_name;
    private String accountholder_name;
    private String account_type;
    private String account_number;
    private double balance;

    public Bank_Transaction(String account_name, String accountholder_name, String account_type,
                            String account_number, double balance) {
        this.account_name = account_name;
        this.accountholder_name = accountholder_name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Name: " + account_name);
        System.out.println("Account Holder Name: " + accountholder_name);
        System.out.println("Account Type: " + account_type);
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Bank_Transaction transaction = new Bank_Transaction("SBI", "Amit Sharma", "saving",
                "SBIN0001234", 50000.0);
        transaction.display();
    }
}
