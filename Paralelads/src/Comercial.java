public class Comercial extends Imoveis_geral implements Comparable<Comercial>{
    float taxa = 10.7f;
    /*Construtor*/
    public Comercial(String proprietario, String endereco, float area, int ano) {
        this.setProprietario(proprietario);
        this.setEndereco(endereco);
        this.setArea(area);
        this.setAno(ano);
        this.setIptu(this.getArea()*taxa);
    }



    /*  Ordenar pelo ANO  */
    @Override
    public int compareTo(Comercial outra){
        if(this.getAno()<outra.getAno()){
            return -1;
        }else if (this.getAno()>outra.getAno()){
            return 1;
        }else{
            return 0;
        }
    }

}
