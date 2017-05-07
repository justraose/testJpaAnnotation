package test;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by lzhijun on 2017/5/7.
 */
@Entity
public class IdCard {

    @Id
    @GeneratedValue(generator = "pid")
    @GenericGenerator(name = "pid", strategy = "assigned")
    private String pid;

    private String idcardNo;

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
