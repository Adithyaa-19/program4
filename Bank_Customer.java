public class Bank_Customer {
    private String cust_name;
    private String customer_id;
    private String customer_address;

    public Bank_Customer(String cust_name, String customer_id, String customer_address) {
        this.cust_name = cust_name;
        this.customer_id = customer_id;
        this.customer_address = customer_address;
    }

    public void display() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Address: " + customer_address);
    }

    public static void main(String[] args) {
        Bank_Customer customer = new Bank_Customer("Amit Sharma", "CUST123", "Delhi, India");
        customer.display();
    }
}
