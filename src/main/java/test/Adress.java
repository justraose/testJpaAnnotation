package test;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

/**
 * Created by lzhijun on 2017/5/6.
 */
@Embeddable
public class Adress {
    private String adressName;
    private String postcard;
    private String phone;
    private Date hometime;
    @Enumerated(EnumType.STRING)
    private MyEnum myEnum;

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public void setMyEnum(MyEnum myEnum) {
        this.myEnum = myEnum;
    }

    public enum MyEnum {
        FIRST("1", "1"),
        SECOND("2", "2");

        MyEnum(String name, String value) {
            this.name = name;
            this.value = value;
        }

        private String name;
        private String value;

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }

    public static class A {

    }

    public String getAdressName() {
        return adressName;
    }

    public void setAdressName(String adressName) {
        this.adressName = adressName;
    }

    public String getPostcard() {
        return postcard;
    }

    public void setPostcard(String postcard) {
        this.postcard = postcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getHometime() {
        return hometime;
    }

    public void setHometime(Date hometime) {
        this.hometime = hometime;
    }
}
