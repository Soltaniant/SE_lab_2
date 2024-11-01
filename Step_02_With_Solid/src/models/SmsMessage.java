package models;

import java.util.regex.Pattern;

public class SmsMessage extends Message {

    private static final String phoneNumberRegex = "^[0-9]{11}$";
    private static final Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);

    @Override
    public boolean isValid() {
        return phoneNumberPattern.matcher(source).matches() && phoneNumberPattern.matcher(target).matches();
    }
}
