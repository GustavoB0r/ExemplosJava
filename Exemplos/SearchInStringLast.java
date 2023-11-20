package Exemplos;
public class SearchInStringLast {
    public static void main(String[] args) {
        String txt = "Por favor localize a palavra 'localize' com precisao!";
        System.out.println(txt.lastIndexOf("localize"));              // mostrar a posicao em numero da primeira character da ultima palavra escolhida, no caso "locate"
    }
}