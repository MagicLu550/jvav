package jvav.compiler;


import java.io.IOException;
import java.util.List;

public class Compiler {

    private JvavReader reader;

    public Compiler() {
        this.reader = new JvavReader();
    }

    public String compile(String file){
        StringBuilder builder = new StringBuilder();
        try {
            List<String> list = this.reader.getWords(this.reader.readJvav(file));
            for(String s : list){
                builder.append(s).append(" ");
                if(s.endsWith("{")||s.endsWith("}"))builder.append("\n");
                if(";".equals(s)){
                    builder.append("\n");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return Utils.pretty(builder.toString());
    }

}
