public class Ap extends Imoveis_geral implements Comparable<Ap>{
    float taxa = 8.5f;
    int andar;
 /*Construtor*/
    public Ap(String proprietario, String endereco, float area, int ano, int andar) {
        this.setProprietario(proprietario);
        this.setEndereco(endereco);
        this.setArea(area);
        this.setAno(ano);
        this.setAndar(andar);
        this.setIptu(this.getArea()*taxa);
    }
/* Get e Set para o ANDAR*/
    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    /*  Ordenar pelo ANO  */
    @Override
    public int compareTo(Ap outra){
        if(this.getAno()<outra.getAno()){
            return -1;
        }else if (this.getAno()>outra.getAno()){
            return 1;
        }else{
            return 0;
        }
    }


}
