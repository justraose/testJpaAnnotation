package relation;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by lzhijun on 2017/5/7.
 */
@Entity
public class Person {

    private Long id;

    private String name;

    private Company company;

    private ClassRoom classRoom;

    private List<Animal> animals;

    // 已
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "person_animal",
            joinColumns = {@JoinColumn(name = "sId", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "aId", referencedColumnName = "id")}
    )
    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "classId", referencedColumnName = "id")
    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "caid", unique = true)
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Id
    @GeneratedValue(generator = "ass")
    @GenericGenerator(name = "ass", strategy = "assigned")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
