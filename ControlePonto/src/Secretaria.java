public class Secretaria extends Funcionario {
    private String telefone;
    private String ramal;

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String t){
        telefone = t;
    }

    public String getRamal(){
        return ramal;
    }
    public void setRamal(String r){
        ramal = r;
    }
}
