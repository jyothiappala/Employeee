import javax.annotation.processing.Generated;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class Employee {
    private @Id @GeneratedValue Long employeeId;

    private String firstName;

    private String lastName;

    private String emailId;

    private BigInteger phoneNumber;

    private Date doj;

    private long salary;

    Employee(){}

    Employee(String firstName,String lastName, String emailId, BigInteger phoneNumber, Date doj, long salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.doj = doj;
        this.phoneNumber = phoneNumber;
        this.salary= salary;
    }
}
