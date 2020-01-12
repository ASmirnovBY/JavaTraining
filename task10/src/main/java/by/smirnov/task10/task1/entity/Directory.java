package by.smirnov.task10.task1.entity;

import java.util.Objects;

public class Directory {
    private String pathParent;

    public Directory(String pathParent) {
        this.pathParent = pathParent;
    }

    public String getPathParent() {
        return pathParent;
    }

    public void setPathParent(String pathParent) {
        this.pathParent = pathParent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(pathParent, directory.pathParent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathParent);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "pathParent='" + pathParent + '\'' +
                '}';
    }
}
