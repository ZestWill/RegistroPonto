public class Gerente extends Funcionario {
    private String login;
    private String senha;

    public String getLogin(){
        return login;
    }
    public void setLogin(String l){
        login = l;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String s){
        senha = s;
    }
}
