package test;


import org.hibernate.annotations.GenericGenerator;
import relation.Company;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lzhijun on 2017/5/5.
 */
@Entity
@Table(name = "t_student", schema = "testmysql")
public class Students {

    private Integer id;
    private Integer sid;
    private String sName;
    private String gender;
    private Date birthday;
    private String majore;
    private Adress address;
    private String testz;

    private TestEnum testEnum;

    @Enumerated
    public TestEnum getTestEnum() {
        return testEnum;
    }

    public void setTestEnum(TestEnum testEnum) {
        this.testEnum = testEnum;
    }

    private enum TestEnum {
        FIRST, SCEND;
    }


    private IdCard idCard;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pid", unique = true)
    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "myWay")
    @GenericGenerator(name = "myWay", strategy = "assigned")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMajore() {
        return majore;
    }

    public void setMajore(String majore) {
        this.majore = majore;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public String getTestz() {
        return testz;
    }

    public void setTestz(String testz) {
        this.testz = testz;
    }
}
