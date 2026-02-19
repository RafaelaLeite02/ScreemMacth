package br.com.alura.screenmatch.exception;

public class ErrorAnoException extends RuntimeException {
    private String mensagem;

    public ErrorAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
