package jvav.compiler

class Utils {


    static List<String> splitCode(String code,String chars){
        int index = 0
        def arr = []
        StringBuilder builder = new StringBuilder()
        boolean start = false
        for(int i = 0;i<code.length();i++){
            if(code[i].equals("\"")||code[i].equals("'")) {
                if (!start) {
                    index++
                    start = true
                } else {
                    index--
                    start = false
                }
            }
            if(index == 0){
                if(code[i] == chars){
                    arr.add(builder.toString())
                    builder = new StringBuilder()
                }else{
                    builder.append(code[i])
                }
            }else{
                builder.append(code[i])
            }
        }
        if(!builder.toString().isEmpty())arr.add(builder.toString())
        arr
    }

    static String pretty(String string) {
        StringBuilder builder = new StringBuilder()
        int close = 0 //检验是否在字符串里
        //字符串的数量%2 == 0
        List l = splitCode(string,"\n")
        for(String code in l){
            int clo = getClose(code)
            if(clo < 0){
                close += clo
            }
            builder.append("\t"*close).append(code).append("\n")
            if(clo > 0){
                close += clo
            }
        }
        return builder
    }

    private static int getClose(String code){
        int close = 0
        for(s in code){
            if(s == "'"||s == "\"") {
                close ++
            }
            if(close %2 == 0){
                if(s == "{"){
                    close ++
                }
                if(s == "}"){
                    close --
                }
            }
        }
        close
    }
}
