
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 30562534
 */
public class _Shop 

{
    public static void main(String[] args) {
    DBManager db = new DBManager();
        // create array, pick class, define var = the db
        ArrayList<Customer> allCustomers = db.loadCustomers();
        ArrayList<Staff> allStaff = db.loadStaff();
    }
    
}
