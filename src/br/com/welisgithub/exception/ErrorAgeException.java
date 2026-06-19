package br.com.welisgithub.exception;

public class ErrorAgeException extends RuntimeException{

    private String message;

    public ErrorAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
