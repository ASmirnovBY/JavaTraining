package by.smirnov.task10.task1.entity;
import java.io.IOException;
import java.util.Objects;

public abstract class File {
    protected String name;
    protected Directory directory;

    public File(Directory directory, String name) {
        this.directory = directory;
        this.name = name;
    }

    public File() {

    }

    public abstract boolean createNewFile() throws IOException;

    public abstract boolean deleteFile();

    public abstract boolean renameFile(String newName);

    public abstract String readFile() throws IOException;

    public abstract void addToFile(String text) throws IOException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    protected abstract java.io.File toFile();

    public String getDirectoryPath() {
        return this.directory.getPathParent();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(name, file.name) &&
                Objects.equals(directory, file.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, directory);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", directory=" + directory +
                '}';
    }
}
