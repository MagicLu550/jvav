package jvav.compiler;


import java.io.IOException;
import java.util.List;

public class Compiler {

    private JvavReader reader;

    public Compiler() {
        this.reader = new JvavReader();
    }

    public String compile(String file,List<KeyWord> keyWords){
        StringBuilder builder = new StringBuilder();
        int index = 0;
        try {
            List<String> list = this.reader.getWords(this.reader.readJvav(file),keyWords);
            for(String s : list){
                if(s.equals("")){
                   builder.append(" ");
                }else{
                    builder.append(s);
                }
                index += getClose(s);
                if(s.endsWith("{")||s.endsWith("}"))builder.append("\n");
                if(index % 2 == 0){
                    if(";".equals(s)){
                        builder.append("\n");
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return Utils.pretty(builder.toString());
    }

    public String compile(String file){
        return compile(file,KeyWord.values());
    }

    public String deCompile(String file){
        return compile(file,KeyWord.getDevalues());
    }

    private int getClose(String s){
        int index = 0;
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c == '"' || c == '\''){
                index++;
            }
        }
        return index;
    }
}
