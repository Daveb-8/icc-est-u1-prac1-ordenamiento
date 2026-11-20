import java.util.ArrayList;
import java.util.List;

import modelos.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {

        Comparators listas = new Comparators();


        List<Estudiante> primerC = listas.c1();
        List<Estudiante> segundoC = listas.c2();

        //List<Estudiante> tercerC = listas.c3();
        List<Estudiante> estabilidadC3 = listas.probarEstabilidadC3();

        List<Estudiante> cuartoC = listas.c4();
        List<Estudiante> quintoC = listas.c5();
        List<Estudiante> sextoC = listas.c6();
        List<Estudiante> septimoC = listas.c7();
        
        List<Estudiante> vacio = new ArrayList<>();
        vacio.sort(null);
        System.out.println("Lista vacia con comparacion natural");
        listas.print(vacio);
        List<Estudiante> listaUnElemento = new ArrayList<>(List.of(primerC.get(0)));
        listaUnElemento.sort(null);
        System.out.println("Lista con un elemento");
        listas.print(listaUnElemento);

        List<Estudiante> sublista = new ArrayList<>();
        List<String> codigosEst = new ArrayList<>(List.of("E014","E005","E010"));
        for (String codigo: codigosEst ) {
            for(Estudiante est: primerC) {
                if (est.getCodigo().equals(codigo)){
                    sublista.add(est);
                }
            }
        }
        listas.c4(sublista);

        //Pritneamos la lista original
        System.out.println("Lista Original");
        listas.print(listas.estudiantes);
               
    }
}
