import lista.exercicio.pacote.SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv SmartTv = new SmartTv(false, 5,25);


        System.out.println("A teve estar ligada? " + SmartTv.isLigada());
        System.out.println("Qual volume da tv? " + SmartTv.getVolume());
        System.out.println("em qual canal estar? : " + SmartTv.getCanal());

        
        if (SmartTv.isLigada()){
            SmartTv.aumentarCanal();
            SmartTv.diminuirVolume();
        }else{
            SmartTv.setLigada(true);
            SmartTv.aumentarCanal();
            SmartTv.diminuirVolume();
        }

        System.out.println("================================================================");
        System.out.println("A teve estar ligada? " + SmartTv.isLigada());
        System.out.println("Qual volume da tv? " + SmartTv.getVolume());
        System.out.println("em qual canal estar? : " + SmartTv.getCanal());

      
    }
}
