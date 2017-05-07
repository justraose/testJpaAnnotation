package relation;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by lzhijun on 2017/5/7.
 */
@Entity
public class Animal {

    private Long id;

    private String name;

    private List<Person> personList;

    @ManyToMany(mappedBy = "animals")
    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
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
