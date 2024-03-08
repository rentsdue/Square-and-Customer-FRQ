public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Smith", 1001);
        Customer c2 = new Customer("Anderson", 1002);
        Customer c3 = new Customer("Smith", 1003);
        int ans1= c1.compareCustomer(c1);
        int ans2= c1.compareCustomer(c2);
        int ans3= c1.compareCustomer(c3);
        System.out.println(ans1 + " " + ans2 + " " + ans3);
    }
}
