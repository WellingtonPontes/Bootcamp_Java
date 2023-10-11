package lista.desafio.smartphone;

public class Smartphone implements AparelhoTelefonico , NavegadorInternet, ReprodutorMusica {

   private boolean tocando;


    public boolean isTocando() {
    return tocando;
    }

    public void setTocando(boolean tocando) {
    this.tocando = tocando;
    }

    @Override
    public void tocar() {
      System.out.println("Tocando musica");
    }

    @Override
    public boolean pausar() {
        if(isTocando()){
            return false;
        }
        return true;
    }

    @Override
    public String selecionarMusica(String musica) {
       return musica;
    }

    @Override
    public void exibirPagina() {
       System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando uma pagina");
    }

    @Override
    public void atender() {
        System.out.println("atendendo Smartphone");
    }

    @Override
    public void ligar() {
        System.out.println("ligando...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correrio de voz...");
    }
    
}
