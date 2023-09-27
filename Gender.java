import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "gender")
@NamedQueries({
        @NamedQuery(name = "Gender.findAll", query = "SELECT e FROM Gender e"),
        @NamedQuery(name = "Gender.findAllById", query = "SELECT g FROM Gender g where g.id= :id")

})
public class Gender {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy="gender",fetch = FetchType.EAGER)
//    private List<Employee> employees;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
