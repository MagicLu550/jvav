package jvav.compiler;

public class Runner {

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        System.out.println(compiler.compile("test.jvav"));
    }
}
