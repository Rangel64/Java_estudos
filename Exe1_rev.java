
class Pessoa{
    private String nome;
    private String data_nascimento;
    private float altura;

    public Pessoa(){
        this.nome = "";
        this.data_nascimento = "";
        this.altura = 0;
    }
    
    public Pessoa(String nome, String data_nascimento, float altura){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.altura = altura;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setData_Nascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public String getData_Nascimento(){
        return this.data_nascimento;
    }

    public void setAltura(float altura){
        this.altura = altura;    
    }

    public float getAltura(){
        return this.altura;
    }
}



public class Exe1_rev{
    public static void main(String[] args) {
        
    }
}