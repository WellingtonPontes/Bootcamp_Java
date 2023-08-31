package lista.exercicio.cases;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // Array com a lista de candidatos
        String[] candidateArray = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        ArrayList<String> candidatos =  new ArrayList<>(Arrays.asList(candidateArray));
        HashMap<String, Double> selecionados = new HashMap<String, Double>();
        // analisandoCandidatos(1900);
        // analisandoCandidatos(2100);
        // analisandoCandidatos(2000);
        int seleçãoCandidatos = 0;
        int contador= 0;
        while (seleçãoCandidatos < 5) {
            double salarioGerado = ThreadLocalRandom.current().nextDouble(1800,2200);
            if (salarioGerado > 2000){
                contador++;
                if (contador >= candidatos.size())
                contador = 0;

            }else{
                selecionados.put(candidatos.get(contador),salarioGerado);
                candidatos.remove(contador);
                contador ++;
                if (contador >= candidatos.size())
                contador = 0;
                seleçãoCandidatos++;
            }
        }
        System.out.println("Lista de candidatos e seus salarios");
            for (Map.Entry<String, Double> entry : selecionados.entrySet()) {
                // String key = entry.getKey();
                // Double value = entry.getValue();
                System.out.printf("Nome: " + entry.getKey() + ", Salario: %.2f%n", entry.getValue());
            }
    }

    
    public static void analisandoCandidatos(double salario_pretendido){
        double salario = 2000;
        if(salario == salario_pretendido){ 
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else if(salario > salario_pretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    
 
}
