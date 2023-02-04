package com.iainschmitt.perdiction;

public class NotAuthorizedException extends RuntimeException{
    public NotAuthorizedException(String message) {
        super(message);
    }
    public NotAuthorizedException(String messageTemplate, String templatedValue) {
        super(String.format(messageTemplate, templatedValue));
    }
    public NotAuthorizedException(){}
}
