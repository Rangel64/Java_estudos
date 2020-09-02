import java.util.Calendar;
import java.util.GregorianCalendar;

class Pessoa {
    private String nome;
    private int ano_nascimento;
    private float altura;

    public Pessoa() {
        this.nome = "";
        this.ano_nascimento = 0;
        this.altura = 0;
    }

    public Pessoa(String nome, int ano_nascimento, float altura) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public int getAno_nascimento() {
        return this.ano_nascimento;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return this.altura;
    }

    public int getIdade(){
        int idade;

        int ano = GregorianCalendar.getInstance().get(Calendar.YEAR);

        idade = ano - this.ano_nascimento;

        return idade;
    }

    public void getDados() {
        System.out.println(" Nome: " + this.nome);
        System.out.println(" Data de nascimento: " + this.ano_nascimento);
        System.out.println(" Altura: " + this.altura);

    }
}

public class Exe1_rev {
    


    public int menu(){
        Scanner leitor = new Scanner(System.in);
        int entrada = 0;

        do{
            System.out.println(" 1. Adcionar pessoa.");
            System.out.println(" 2. Mostrar pessoas.");
            System.out.println(" 0. Sair.");
            System.out.println(" Informe um opcao: ");
            
            
        }while();

        return entrada;

    }

    public static void main(String[] args) {
        String nome = "";
        int ano_nascimento = 0;
        
        Pessoa novaPessoa = new Pessoa(nome, ano_nascimento, altura);
    }
}