package ru.molokoin;
/**
 * Класс - хранилище
 * предоставляет инструментарий обращения с массивом файлов
 */
public class Storage {
    private File[] files;

    public void setFiles(File[] files) {
        this.files = files;
    }
    public File[] getFiles() {
        return files;
    }


    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.setFiles(new File[1]);
        Extension e = Extension.DOCUMENT;
        e.initDocument("null", 0);
        storage.files[0] = new File("noname", (byte)0, e);
        storage.files[0].print();

    }

}
