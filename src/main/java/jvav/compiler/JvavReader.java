package jvav.compiler;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JvavReader {

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
