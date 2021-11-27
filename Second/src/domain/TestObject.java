package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestObject {
    private String name;
    private int age;
    private Date birthiday;

    public String getBirStr(){
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String ret = s.format(birthiday);
        return ret;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthiday() {
        return birthiday;
    }

    public void setBirthiday(Date birthiday) {
        this.birthiday = birthiday;
    }

    public TestObject(String name, int age, Date birthiday) {
        this.name = name;
        this.age = age;
        this.birthiday = birthiday;
    }

    public TestObject() {
    }
}
