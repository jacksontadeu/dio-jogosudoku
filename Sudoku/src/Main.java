import br.com.jtmjinfo.modelos.Jogo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogo j = new Jogo();
        j.mostrarBoard();
        j.realizarJogada(0,0,6);
        j.mostrarBoard();
    }


}