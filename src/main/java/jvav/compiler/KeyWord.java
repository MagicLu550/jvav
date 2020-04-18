package jvav.compiler;


import java.util.ArrayList;
import java.util.List;

public class KeyWord {

    public static List<KeyWord> values = new ArrayList<>();

    static {
        values.add(new KeyWord("^","^"));
        values.add(new KeyWord("&&","&&"));
        values.add(new KeyWord("||","||"));
        values.add(new KeyWord("/","/"));
        values.add(new KeyWord("*","*"));
        values.add(new KeyWord("-","-"));
        values.add(new KeyWord("=","="));
        values.add(new KeyWord("+","+"));
        values.add(new KeyWord("synchronized","sycnhoned"));
        values.add(new KeyWord("package","pakcgae"));
        values.add(new KeyWord("continue","cateine"));
        values.add(new KeyWord("switch","seitch"));
        values.add(new KeyWord("new","mew"));
        values.add(new KeyWord("for","far"));
        values.add(new KeyWord("while","wrile"));
        values.add(new KeyWord("super","saper"));
        values.add(new KeyWord("native","nstuie"));
        values.add(new KeyWord("float","flaot"));
        values.add(new KeyWord("volatile","valutile"));
        values.add(new KeyWord("strictfp","sdftrivp"));
        values.add(new KeyWord("long","ling"));
        values.add(new KeyWord("finally","fanilluy"));
        values.add(new KeyWord("char","cahr"));
        values.add(new KeyWord("interface","intiefcae"));
        values.add(new KeyWord("final","fanil"));
        values.add(new KeyWord("catch","chacth"));
        values.add(new KeyWord("try","tie"));
        values.add(new KeyWord("short","shart"));
        values.add(new KeyWord("int","ant"));
        values.add(new KeyWord("extends","etxends"));
        values.add(new KeyWord("case","caes"));
        values.add(new KeyWord("transient","thansaent"));
        values.add(new KeyWord("return","retan"));
        values.add(new KeyWord("instanceof","instaseaf"));
        values.add(new KeyWord("else","alse"));
        values.add(new KeyWord("byte","bate"));
        values.add(new KeyWord("throws","trosw"));
        values.add(new KeyWord("import","inpart"));
        values.add(new KeyWord("double","dauble"));
        values.add(new KeyWord("break","brake"));
        values.add(new KeyWord("throw","trow"));
        values.add(new KeyWord("protected","protacted"));
        values.add(new KeyWord("implements","implmeents"));
        values.add(new KeyWord("do","dou"));
        values.add(new KeyWord("abstract","absactet"));
        values.add(new KeyWord("default","dafuslt"));
        values.add(new KeyWord("if","af"));
        values.add(new KeyWord("private","proveta"));
        values.add(new KeyWord("main","mian"));
        values.add(new KeyWord("public","pabulike"));
        values.add(new KeyWord("static","statsitc"));
        values.add(new KeyWord("void","vaoid"));
        values.add(new KeyWord("(","("));
        values.add(new KeyWord(")",")"));
        values.add(new KeyWord("String","Stirng"));
        values.add(new KeyWord("{","{"));
        values.add(new KeyWord("}","}"));
        values.add(new KeyWord("class","calse"));
        values.add(new KeyWord("args","arsg"));
        values.add(new KeyWord("this","tish"));
        values.add(new KeyWord("boolean","boloaen"));

    }

    public static final int MATCH = 3;

    private String word;

    private String after;

    KeyWord(String word,String after) {
        this.word = word;
        this.after = after;
    }

    public static List<KeyWord> values(){
        return values;
    }

    public String getWord() {
        return word;
    }

    public boolean matches(String word){
        return word.equals(after);
    }
}
