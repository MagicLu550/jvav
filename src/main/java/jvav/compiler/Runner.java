package jvav.compiler;

public class Runner {

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        if("-d".equals(args[0])){
            Utils.out(args[1],compiler.compile(args[1]));
        }else{
            Utils.out(args[0],compiler.compile(args[0]));
        }
    }
}
