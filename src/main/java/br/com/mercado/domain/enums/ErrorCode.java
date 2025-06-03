package br.com.mercado.domain.enums;

public enum ErrorCode {

    CATEGORIA_EXISTS("categoria ja existe"),
    MERCADO_NOT_EXISTS("Mercado nao exite"),
    MERCADO_EXISTS("Mercado ja existe"),
    FORNECEDOR_NOT_EXISTS("fornecedor nao existe"),
    FORNECEDOR_EXISTS("fornecedor ja existe"),
    FUNCIONARIO_EXISTS("funcionario ja existe"),
    PRODUTO_EXISTS("produto ja existe"),
    GENERIC("erro generico, contate o administrador");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
