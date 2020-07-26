package jinjie.day05.demo01;

import java.util.Objects;

public class ObjToString {
    private String name;

//    @Override
//    public String toString() {
//        return "ObjToString{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjToString that = (ObjToString) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjToString(String name) {
        this.name = name;
    }

    public ObjToString() {
    }
}
