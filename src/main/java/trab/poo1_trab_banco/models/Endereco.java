package trab.poo1_trab_banco.models;

public class Endereco {
    private String cidade;
    private String estado;
    private String endereco;

    public Endereco(){
        cidade = "N/D";
        estado = "N/D";
        endereco = "N/D";
    }

    public Endereco(String cidade, String estado, String endereco){
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
    }

    public Endereco(String cidade, String estado){
        this.cidade = cidade;
        this.estado = estado;
        endereco = "N/D";
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getEndToString(){
        return cidade + " - " + estado + " " + endereco;
    }

}
