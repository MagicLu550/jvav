package jvav.compiler;

public class Runner {

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        compiler.compile(args[0]);
    }
}
