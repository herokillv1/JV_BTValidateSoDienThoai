import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberMobile {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String Number_Mobile = "^[(]+[0-9]{2}+[)]+[-]+[(]+[0-9]{10,11}+[)]";

    public NumberMobile(){
    }

    public boolean validate(String regex){
        pattern = Pattern.compile(Number_Mobile);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
