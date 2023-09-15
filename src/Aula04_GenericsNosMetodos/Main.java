package Aula04_GenericsNosMetodos;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lang = Arrays.asList("Java", "PHP", "Python", "C#");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4 ,5, 6);

        String ultimaLinguagem = (String) ListaUtil.getUltimoGenerc(lang);
        System.out.println(ultimaLinguagem);

        Integer ultimoInteiro = (Integer) ListaUtil.getUltimo(nums);
        System.out.println(ultimoInteiro);





    }
}
