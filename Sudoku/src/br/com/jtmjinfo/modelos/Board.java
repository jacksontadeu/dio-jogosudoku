package br.com.jtmjinfo.modelos;

public class Board {

    private Celula[][] board;

    public Board() {
        this.board = new Celula[9][9];
        for (int i= 0;i < 9 ; i++){
            for( int j =0; j <9; j++){
                board[i][j]= new Celula(0, false);
            }

        }
    }

    public Celula getCelula(int linha, int coluna){
        return board[linha][coluna];
    }
    public void setCelula(int linha, int coluna, int valor, boolean fixo){
        board[linha][coluna]= new Celula(valor,fixo);
    }

    public void imprimirBoard(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int val = board[i][j].getValor();
                System.out.println(val ==0?" ": val + " ");
            }
            System.out.println();

        }
    }

}
