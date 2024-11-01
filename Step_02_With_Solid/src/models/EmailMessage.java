package models;

import java.util.regex.Pattern;

public class EmailMessage extends Message {

    private static final String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    private static final Pattern emailPattern = Pattern.compile(emailRegex);

    @Override
    public boolean isValid() {
        return emailPattern.matcher(source).matches() && emailPattern.matcher(target).matches();
    }
}
