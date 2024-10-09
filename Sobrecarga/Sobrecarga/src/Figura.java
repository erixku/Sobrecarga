/**
 * Classe para demonstrar o recurso de Sobrecarga de métodos
 * @author Erick Gomes Barbosa
 */
public class Figura {
    int a, b, c, d;
    
    //Construtor para um ponto
    public Figura(int a){
        this.a = a;
    }
    
    //Construtor para uma linha
    public Figura(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //Construtor para um triângulo
    public Figura(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Construtor para um retângulo
    public Figura(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    //Método comum para exibir os dados de um ponto
    public void exibirFigura(int x){
        System.out.println("É um ponto de valor: " + a);
    }
    
    //Método comum para exibir os dados de uma linha
    public void exibirFigura(String w, float p){
        System.out.println("É uma linha de coordenadas: " + a + " e " + b);
    }
    
    //Método comum para exibir dados de um triângulo
    public void exibirFigura(int f, float v, int n){
        System.out.println("É um triangulo de coordenadas: " + a + ", " + b + " e " + c);
    }
    
    //Método comum para exibir dados de um retângulo
    public void exibirFigura(float v, int f, float g, int o){
        System.out.println("É um retângulo de coordenadas: " + a + ", " + b + ", " + c + " e " + d);
    }
}
