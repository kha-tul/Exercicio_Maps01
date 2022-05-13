package br.dio.exercicio.maps;

import java.util.*;

public class exercicioMaps1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas populações: ");
        Map<String, Integer> populacoesEstados = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacoesEstados);


        System.out.println("Substitua a população do RN por: 3.534.165 ");
        populacoesEstados.put("RN", 3534165);
        System.out.println(populacoesEstados);


        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        populacoesEstados.put("PB", 4039277);
        System.out.println(populacoesEstados);


        System.out.println("Exiba a populacao do estado do PE: " + populacoesEstados.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacoesEstados2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacoesEstados2);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacoesEstados3 = new TreeMap<>(populacoesEstados);
        System.out.println(populacoesEstados3);


        System.out.println("Exiba o estado com o menor população (%s) e seu respectivo valor: " );
        Collection<Integer> populacao = populacoesEstados.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry: populacoesEstados.entrySet()){
            if(entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if(entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Estado com menor população: \n" + estadoMenorPopulacao + Collections.min(populacao));
        System.out.printf("Estado com maior população: \n" + estadoMaiorPopulacao + Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacoesEstados.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);







    }
}
