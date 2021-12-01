package Project.models;
public class Student {
    private int id;
    private String name;
    private String klass;
    private String address;

    private double c;
    private double english;
    private double java;

    public Student() {
    }

    public Student(int id, String name, String klass, String address) {
        this.id = id;
        this.name = name;
        this.klass = klass;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + klass + "," + address + "." ;
    }


}
