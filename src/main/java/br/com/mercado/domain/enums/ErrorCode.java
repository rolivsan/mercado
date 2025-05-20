package br.com.mercado.domain.enums;

public enum ErrorCode {

    CATEGORIA_EXISTS("categoria ja existe"),
    GENERIC("erro generico, contate o administrador");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
