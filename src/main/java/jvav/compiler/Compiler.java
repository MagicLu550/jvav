package jvav.compiler;

import java.io.IOException;

public class Compiler {

    public static void main(String[] args) throws IOException {
        JvavReader reader = new JvavReader();
        System.out.println(reader.readJvav("test.jvav"));
    }
}
