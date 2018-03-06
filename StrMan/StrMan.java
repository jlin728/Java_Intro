
public class StrMan{

    public String trimAndConcat(String string1, String string2) {
        return string1.trim() + string2.trim();
    }

    public Integer getIndexOrNull(String string1, char letter) {
        Integer x = string1.indexOf(letter);

        if (x == -1) {
            return null;
        } else {
            return x;
        }
    }

    public Integer getIndexOrNull(String string1, String string2) {
        Integer x = string1.indexOf(string2);
        
        if (x == -1) {
            return null;
        } else {
            return x;
        }
    }

    public String concatSubstring(String string1, int num1, int num2, String string2) {
        String y = string1.substring(num1, num2).concat(string2);
        return y;

    }

}