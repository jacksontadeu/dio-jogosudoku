package br.com.jtmjinfo.modelos;

public class Celula {

    private int valor;
    private Boolean isFixo;

    public Celula(Integer valor, Boolean isFixo) {
        this.valor = valor;
        this.isFixo = isFixo;
    }

    public void setValor(Integer valor) {
        if(!isFixo)
            this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public Boolean getFixo() {
        return isFixo;
    }

}
