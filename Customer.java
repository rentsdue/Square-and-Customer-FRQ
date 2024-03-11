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

    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {
        int start1 = 0;
        int start2 = 0;
        for (int i = 0; i < result.length; i++) {
            int compare = list1[start1].compareCustomer(list2[start2]);
            if (compare < 0) {
                result[i] = list1[start1];
                start1++;
            } else if (compare > 0){
                result[i] = list2[start2];
                start2++;
            } else {
                result[i] = list1[start1];
                start1++;
                start2++;
            }
        }
    }

}
