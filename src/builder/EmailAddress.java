package builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {

    private static final String EMAIL_PATTERN =
            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    String emailString;

    public EmailAddress(String emailString){
        setEmail(emailString);

    }

    private void setEmail(String emailString) {
        if(!isValid(emailString))
            System.out.println("Invalid email");

        this.emailString = emailString;

    }

    private boolean isValid(String emailString){
        Matcher matcher = pattern.matcher(emailString);
        return matcher.matches();
    }

}
