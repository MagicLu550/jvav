package jvav.compiler;

public class Runner {

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        String dir = "jvav_impl/";
        Utils.out(dir+"Compiler.java",compiler.deCompile(dir+"Compiler.java"));
        Utils.out(dir+"JvavReader.java",compiler.deCompile(dir+"JvavReader.java"));
        Utils.out(dir+"KeyWord.java",compiler.deCompile(dir+"KeyWord.java"));
        Utils.out(dir+"Runner.java",compiler.deCompile(dir+"Runner.java"));
    }
}
