import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("José Wilson");
        g.setLogin("jose");
        g.setSenha("123456");
        RegistroPonto r1 = new RegistroPonto();
        r1.setFunc(g);
        r1.setDataRegistro(LocalDateTime.now());
        r1.setHoraEntrada(LocalDateTime.now());
        r1.apresentarRegistroPonto();
        System.out.println("==================================");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Secretaria s = new Secretaria();
        s.setNome("Maria");
        s.setTelefone("9192-9394");
        s.setRamal("19");
        RegistroPonto r2 = new RegistroPonto();
        r2.setFunc(s);
        r2.setDataRegistro(LocalDateTime.now());
        r2.setHoraEntrada(LocalDateTime.now());
        r2.apresentarRegistroPonto();
        System.out.println("==================================");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Operador o = new Operador();
        o.setNome("João");
        o.setValorHora(30.50);
        RegistroPonto r3 = new RegistroPonto();
        r3.setFunc(o);
        r3.setDataRegistro(LocalDateTime.now());
        r3.setHoraEntrada(LocalDateTime.now());
        r3.apresentarRegistroPonto();
        System.out.println("==================================");

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        r1.setHoraSaida(LocalDateTime.now());
        r1.apresentarRegistroPonto();
        System.out.println("==================================");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        r2.setHoraSaida(LocalDateTime.now());
        r2.apresentarRegistroPonto();
        System.out.println("==================================");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        r3.setHoraSaida(LocalDateTime.now());
        r3.apresentarRegistroPonto();
        System.out.println("==================================");
    }
}
