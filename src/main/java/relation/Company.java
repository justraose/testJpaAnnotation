package relation;

import org.hibernate.annotations.GenericGenerator;
import test.Students;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by lzhijun on 2017/5/7.
 */
@Entity
public class Company {
    private Long cid;
    private String name;

    private Person person;

    @OneToOne(mappedBy = "company")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Id
    @GeneratedValue(generator = "ass")
    @GenericGenerator(name = "ass", strategy = "assigned")
    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
