/**
 * Classe para instanciar objetos do tipo Figura
 * @author Erick Gomes Barbosa
 */
public class Desenho {
    public static void main(String[] args) {
        Figura f1 = new Figura(500);
        Figura f2 = new Figura(10, 35);
        Figura f3 = new Figura(10, 35, 50);
        Figura f4 = new Figura(30, 40, 20, 10);
        
        f1.exibirFigura(222);
        f2.exibirFigura("www", 1.5f);
        f3.exibirFigura(1, 2, 4);
        f4.exibirFigura(2, 3, 2, 3);
    }//fim do main
}
