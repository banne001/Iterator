package test;

import practice_iterator.FileReader;

public class Test {
    public static void main(String[] args) {
        FileReader reader = new FileReader("files/war_and_peace.txt");
        for (String line: reader){
            System.out.println(line);
        }
    }
}
