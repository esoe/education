package ru.molokoin;

@File (name="noname", size=0, extension=Extension.OTHER)
public class Storage {
    public static void main(String[] args) {
        System.out.println("Storage.main()");
        Storage storage = new Storage();
        AnnotationReseacher.print(storage);
        
        
    }
    private File file;
    /**
     * @param file
     */
    public Storage(File file) {
        this.file = file;
    }
    //Extension extension;
    public Storage(){
        
    }
    
    public Storage(Extension extension){

    }
    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }
    
    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Storage [file=" + file + "]";
    }

}
