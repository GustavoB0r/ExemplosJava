package Exemplos;
public class Ifelse{
    public static void main(String[] args) {
int f = 120;

        for (int i = 0; i < f; i++) {
            try {
                Thread.sleep(1000);                         //imaginando o tempo de um filme
                System.out.println("Continuar assistindo");      // continuar fazendo a acao "assistindo" ate acabar o tempo de 1000 definido do filme
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
