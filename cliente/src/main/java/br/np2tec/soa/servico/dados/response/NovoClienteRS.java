package br.np2tec.soa.servico.dados.response;

/**
 * Created with IntelliJ IDEA.
 * User: Felipe
 * Date: 06/04/12
 * Time: 01:10
 * To change this template use File | Settings | File Templates.
 */
public class NovoClienteRS {
    private boolean sucesso;
    private int errorCode;
    private String errorMessage;

    public NovoClienteRS() {
        super();
    }

    public NovoClienteRS(boolean sucesso, int errorCode, String errorMessage) {
        super();
        this.sucesso = sucesso;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
