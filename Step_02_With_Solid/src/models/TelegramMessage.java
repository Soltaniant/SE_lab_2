package models;

import java.util.regex.Pattern;

public class TelegramMessage extends Message {

    private static final String userNameRegex = "^[a-zA-Z][a-zA-Z0-9_]{4,}$";
    private static final Pattern userNamePattern = Pattern.compile(userNameRegex);

    @Override
    public boolean isValid() {
        return userNamePattern.matcher(source).matches() && userNamePattern.matcher(target).matches();
    }
}
