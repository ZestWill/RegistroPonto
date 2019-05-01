public class Funcionario {
    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    public int getIdFunc(){
        return idFunc;
    }
    public void setFunc(int id){
        idFunc = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String e){
        email = e;
    }

    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String d){
        documento = d;
    }
}
