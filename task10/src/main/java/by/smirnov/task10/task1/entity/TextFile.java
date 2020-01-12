package by.smirnov.task10.task1.entity;

import java.io.*;

public class TextFile extends File {
    private static final String PROPERTY_TEXT_FILE = ".txt";

    public TextFile() {
        super();
    }

    public TextFile(Directory directory, String name) {
        super(directory, name);
    }

    @Override
    public boolean createNewFile() throws IOException {
        return this.toFile().createNewFile();
    }

    @Override
    public boolean deleteFile() {
        return this.toFile().delete();
    }

    @Override
    public boolean renameFile(String newName) {
        java.io.File renameFile = new java.io.File(getDirectoryPath(),
                (newName + PROPERTY_TEXT_FILE));
        return this.toFile().renameTo(renameFile);
    }

    @Override
    public String readFile() throws IOException {
        String text = "";
        try (FileReader fileReader = new FileReader(this.toFile());
             BufferedReader br = new BufferedReader(fileReader);) {
            String textLine;
            while ((textLine = br.readLine()) != null) {
                text += textLine + "\n";
            }
        } catch (IOException e) {
            throw new IOException();
        }

        return text;
    }

    @Override
    public void addToFile(String text) throws IOException {
        try (FileWriter fileWriter = new FileWriter(this.toFile(), true);
             BufferedWriter bw = new BufferedWriter(fileWriter);) {
            //bw.write("\n");//Добавить с новой строки
            bw.write(text);
        } catch (IOException ex) {
            throw new IOException();
        }
    }

    @Override
    protected java.io.File toFile() {
        return new java.io.File(getDirectoryPath(),
                super.name + PROPERTY_TEXT_FILE);
    }

    public String getAbsoluteFilePath() {
        return toFile().getAbsolutePath();
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "name='" + name + '\'' +
                ", directory=" + directory +
                '}';
    }


}
