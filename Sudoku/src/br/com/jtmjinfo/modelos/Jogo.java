package br.com.jtmjinfo.modelos;

public class Jogo {
    private Board board;

    public Jogo() {
        board = new Board();
    }
    public Boolean isJogadaValida(int linha, int coluna, int valor){
        for (int i = 0; i < 9; i++) {
            if(board.getCelula(linha,i).getValor()== valor)
                return false;
        }
        for (int j = 0; j < 9; j++) {
            if(board.getCelula(coluna,j).getValor()== valor)
                return false;
        }
        int linhaInicial = (linha / 3) * 3;
        int colunaInicial = (coluna /3) *3;
        for (int i = 0; i < linhaInicial; i++) {
            for (int j = 0; j < colunaInicial; j++) {
                if(board.getCelula(i,j).getValor()== valor)
                    return false;
            }
            
        }
        return true;

    }
    public void realizarJogada(int linha, int coluna, int valor){
        if(isJogadaValida(linha,coluna,valor)){
            board.getCelula(linha,coluna).setValor(valor);
        }else
            System.out.println("Mocimento inválido");
    }
    public void mostrarBoard(){
        board.imprimirBoard();;
    }
}
