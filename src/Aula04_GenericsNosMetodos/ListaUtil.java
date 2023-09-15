package Aula04_GenericsNosMetodos;

import java.util.List;

public class ListaUtil {

    public static Object getUltimo(List<?> lista){
        return lista.size() -1;

    }
    public static <Tipo> Tipo getUltimoGenerc(List<Tipo> lista){
        return lista.get(lista.size() - 1);
    }
}
