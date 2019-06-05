public class Casa_condo extends Imoveis_geral implements Comparable<Casa_condo>{
    float taxa = 9.0f;
    /*Construtor*/
    public Casa_condo(String proprietario, String endereco, float area, int ano) {
        this.setProprietario(proprietario);
        this.setEndereco(endereco);
        this.setArea(area);
        this.setAno(ano);
        this.setIptu(this.getArea()*taxa);
    }


    /*  Ordenar pelo ANO  */
    @Override
    public int compareTo(Casa_condo outra){
        if(this.getAno()<outra.getAno()){

            return -1;
        }else if (this.getAno()>outra.getAno()){
            return 1;
        }else{
            return 0;
        }
    }


}
