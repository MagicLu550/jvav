package jvav.compiler;

public class Runner {

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        //Utils.out(args[0],compiler.compile(args[0]));
        System.out.println(compiler.deCompile("Compiler.java"));
    }
}
