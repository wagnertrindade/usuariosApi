package com.demo.usuariosApi.controle;

public class MensagemErro {

    private String mensagem;

    public MensagemErro(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
