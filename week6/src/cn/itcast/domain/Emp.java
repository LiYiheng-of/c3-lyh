package cn.itcast.domain;

public class Emp {
    public String SNO;
    public String Name;
    public int Age;
    public String College;
    public Emp(String SNO, String name, int age, String college) {
        this.SNO = SNO;
        Name = name;
        Age = age;
        College = college;
    }

    @Override
    public String toString() {
        return SNO+","+Name+","+String.valueOf(Age)+","+College;    }
}
