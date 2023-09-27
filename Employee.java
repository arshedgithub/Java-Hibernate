import javax.persistence.*;

@Entity
@Table(name = "employee")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "select e from Employee e") // HQL => Hibernate Query Language
})
class Employee {

    @Id // Required. For primary keys
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "nic", columnDefinition ="char")
    private String nic;

    @JoinColumn(name = "gender_id", referencedColumnName = "id")
    @ManyToOne
    private Gender gender;

    public Employee(){}

    public int getId(){ return this.id; }
    public void setId(int id){ this.id = id; }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public String getNic(){ return this.nic; }
    public void setNic(String nic){ this.nic = nic; }

    public Gender getGender(){ return this.gender; }
    public void setGender(Gender gender){ this.gender = gender; }
}
