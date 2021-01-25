package practice_iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * File reader class that iterates through a text file
 * by each line. Practicing implementing Iterators
 * @author Blezyl S and Patrick D
 * @version 1.0
 */
public class FileReader implements Iterable<String>{
    private File path;

    /**
     * Declares file given the path
     * @param path the path name of the file
     */
    public FileReader(String path){
        this.path = new File(path);
    }


    @Override
    public Iterator<String> iterator() {
        return new FileReaderIterator(this.path);
    }

    private class FileReaderIterator implements Iterator<String>{
        private Scanner input;

        /**
         * @param path path name
         */
        public FileReaderIterator(File path){
            try {
                input = new Scanner(path);
            } catch (FileNotFoundException e) {
                System.out.println("Unable to find path");
            }
        }
        @Override
        public boolean hasNext() {
            return input.hasNextLine();
        }

        @Override
        public String next() {
            return input.nextLine();
        }

        @Override
        public String toString() {
            return "FileReaderIterator{" +
                    "input=" + input +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "FileReader{" +
                "path=" + path.toString() +
                '}';
    }
}
