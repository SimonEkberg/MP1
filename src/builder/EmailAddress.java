package builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    String emailString;

    public EmailAddress(String emailString){
        setEmail(emailString);
    }
    public String getEmailString(){
        return this.emailString;
    }
    public void setEmail(String emailString) {
        if(isValid(emailString))
            System.out.println("Invalid email");
        this.emailString = emailString;
    }
    private boolean isValid(String emailString){
        Matcher matcher = pattern.matcher(emailString);
        return matcher.matches();
    }
}
