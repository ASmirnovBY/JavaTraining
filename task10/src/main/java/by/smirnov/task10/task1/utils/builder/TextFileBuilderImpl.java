package by.smirnov.task10.task1.utils.builder;

import by.smirnov.task10.task1.entity.Directory;

public class TextFileBuilderImpl extends FileBaseBuilder {


    public TextFileBuilderImpl(String requestParam) {
        super(requestParam);
    }

    @Override
    public void buildDirectory() {
        file.setDirectory(new Directory(requestParam[0]));
    }

    @Override
    public void buildName() {
        file.setName(requestParam[1]);
    }


}
