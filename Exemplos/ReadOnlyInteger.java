package Exemplos;
public class ReadOnlyInteger {
  public static void main(String[] args) {
    final int n1 = 15;                          // (final) significa que será uma variavel que é imutavél 
    //n1 = 20;                                  // caso tire o comentario no (//myNum = 20;), o progarama irá dar erro
    System.out.println(n1);
  }
}