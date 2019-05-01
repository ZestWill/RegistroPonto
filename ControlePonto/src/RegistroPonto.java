import java.time.LocalDateTime;

public class RegistroPonto{
    private long idRegPonto;
    private Funcionario func;
    private LocalDateTime dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegPonto(){
        return idRegPonto;
    }
    public void setIdRegPonto(long id){
        idRegPonto = id;
    }

    public Funcionario getFunc(){
        return func;
    }
    public void setFunc(Funcionario f){
        func = f;
    }

    public LocalDateTime getDataRegistro(){
        return dataRegistro;
    }
    public void setDataRegistro(LocalDateTime dr){
        dataRegistro = dr;
    }

    public LocalDateTime getHoraEntrada(){
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDateTime he){
        horaEntrada = he;
    }

    public LocalDateTime getHoraSaida(){
        return horaSaida;
    }
    public void setHoraSaida(LocalDateTime hs){
        horaSaida = hs;
    }

    public void apresentarRegistroPonto(){
        System.out.println("Nome: " + func.getNome());
        System.out.println("Data de Registro: " + dataRegistro);
        System.out.println("Hora de Entrada: " + horaEntrada);
        System.out.println("Hora de Saída: " + horaSaida);
    }

}
