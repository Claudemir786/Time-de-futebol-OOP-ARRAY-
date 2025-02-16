package POO.exercicios.ARRAYS.TimeDeFutebol;

public class TimeDeFutebol {
    private String nome;
    private String cidade;
    private int vitorias;
    private int derrotas;
    private int empates;

    public TimeDeFutebol(){
        this.nome="indefinido";
        this.cidade="indefinido";
        this.vitorias=0;
        this.derrotas=0;
        this.empates=0;
    }
    public void setNome(String nome){
        this.nome=nome.toUpperCase();
    }
    public void setCidade(String cidade){
        this.cidade=cidade.toUpperCase();
    }
    public void setVitorias(int vitorias){
        this.vitorias=vitorias;
    }
    public void setDerrotas( int derrota){
        this.derrotas=derrota;
    }
    public void setEmpates(int empate){
        this.empates=empate;
    }
    public String getNome(){
        return nome;
    }
    public String getCidade(){
        return cidade;
    }
    public int getVitorias(){
        return vitorias;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public int getEmpates(){
        return empates;
    }
    public int calcularPontos(){
        int pts=0;
        pts=(vitorias*3)+empates;
        return pts;
    }
    public void ExibirInfo(){
        System.out.println("----------INFORMAÇÕES DO TIME-----------");
        System.out.println("Nome: "+getNome());
        System.out.println("Cidade "+getCidade());
        System.out.println("Vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
        System.out.println("Pontos: "+calcularPontos());
        System.out.println("---------------------------------------");

    }
}

