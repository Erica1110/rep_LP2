package DataE;

public class Data {
    private int dia;
    private int mes;
    private int ano;


    public Data(int mes, int dia, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return (dia < 10 ? "0" : " ") + dia + "/" + (mes < 10 ? "0" : " ") + mes + "/" + ano;
    }

}
