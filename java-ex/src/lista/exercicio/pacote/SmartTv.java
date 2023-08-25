package lista.exercicio.pacote;

public class  SmartTv{
    boolean  ligada = false;
    int canal = 0;
    int volume= 0;

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public SmartTv(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public boolean ligarTv(){
        setLigada(true);
        return isLigada();
    }
    public int aumentarCanal(){
        setCanal(getCanal()+1);
        return getCanal();
    }
    public int diminuirCanal(){
        setCanal(getCanal() -1);
        return getCanal();
    }
    public int aumentarVolume(){
        setVolume(getVolume()+1);
        return getVolume();
    }
    public int diminuirVolume(){
        setVolume(getVolume()+1);
        return getVolume();

        
    }



 
    
}