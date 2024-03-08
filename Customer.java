public class Customer {

    private String name;
    private int idNum;
    
    public Customer(String name, int idNum) {
        this.name = name;
        this.idNum = idNum;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.idNum;
    }

    public int compareCustomer(Customer other) {
        int checker = name.compareTo(other.getName());
        if (checker !=0 ) {
            return checker;
        } else {
            return idNum - other.getID();
        }
    }

}
