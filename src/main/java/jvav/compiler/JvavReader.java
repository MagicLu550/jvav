package jvav.compiler;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JvavReader {

    public List<String> getWords(String jvav){
        char[] chars = jvav.toCharArray();
        List<KeyWord> words = KeyWord.values();
        List<String> results = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for(char c : chars){
            if(c == ' '){
                results.add(builder.toString());
                builder = new StringBuilder();
                continue;
            }
            if(c == '\t' || c == '\n'){
                results.add(c+"");
                continue;
            }
            if(c == ';'){
                if(!builder.toString().isEmpty()){
                    results.add(builder.toString());
                    builder = new StringBuilder();
                }
                results.add(c+"");
                continue;
            }
            builder.append(c);
            for(KeyWord word : words){
                if(word.matches(builder.toString())){
                    results.add(word.getWord());
                    builder = new StringBuilder();
                }
            }
        }
        return results;
    }

    public String readJvav(String file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        StringBuilder builder = new StringBuilder();
        int code;
        int inString = 0;
        int before = -1;
        while ((code = inputStream.read()) != -1){
            if(code == '"' || code == '\''){
                inString++;
            }
            //不在字符串里
            if(inString % 2 == 0){
                if(code == '\n' || code == '\t' || code == ' '){
                    if(builder.toString().endsWith(";")){
                        builder.append((char)code);
                    }
                    if(code == ' '){
                        if(before != ' ' ){
                            builder.append((char)code);
                        }
                    }

                }else{
                    builder.append((char) code);
                }
            }else{
                builder.append((char) code);
            }
            before = code;
        }
        return builder.toString();
    }


}
