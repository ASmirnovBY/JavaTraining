package by.smirnov.task10.task1.utils.builder;

import by.smirnov.task10.task1.entity.File;
import by.smirnov.task10.task1.entity.TextFile;

public abstract class FileBaseBuilder {
    protected File file = new TextFile();
    protected String request;
    protected String[] requestParam;

    public FileBaseBuilder(String request) {
        this.request = request;
        requestParam = request.split("&");
    }

    abstract void buildDirectory();
    abstract void buildName();

    public File getFile() {
        return file;
    }
}
