import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
//        String pattern = "[Pa-z!.]+";           // checks 1st letter for capital p, then any letter b/w a-z & then ! or .
        String pattern = "\\bto\\b";              // checks only to separate from other words
        String check = "Hello, Praveen Welcome! to Javato Programming.";
        Pattern p = Pattern.compile(pattern);
        Matcher c = p.matcher(check);
        while (c.find()){
//            System.out.println(check.substring(c.start(),c.end()));
            System.out.println("Pattern matches: "+c.group()+" at "+c.start());
        }
    }
}
