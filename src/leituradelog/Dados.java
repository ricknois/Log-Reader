package leituradelog;

public class Dados {
    private String navegador;
    private double hora;
    private String ip;
    private String horas;
    public Dados() {
    }
    public Dados(String navegador, double hora, String ip,String horas ) {
        this.navegador = navegador;
        this.hora = hora;
        this.ip = ip;
        this.horas = horas;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    

    @Override
    public String toString() {
        return "IP: " + ip + "   Hora: " + hora + "   Navegador: " +navegador ;
    }

   
}


