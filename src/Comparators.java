import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparators {
        List<Estudiante> estList;

    public List<Estudiante> c1() {
    
            List<Estudiante> lista = new ArrayList<>(estList);
            lista.sort(null);
            return lista;

        }
         
      public List<Estudiante> c2() {
            List<Estudiante> lista = new ArrayList<>(estList);
             Comparator<Estudiante> comparator = (e1, e2) ->  e1.getCodigo().compareTo(e2.getCodigo());
            lista.sort(comparator);
            return lista;

        }
         
      public List<Estudiante> c3() {
        
            List<Estudiante> lista = new ArrayList<>(estList);
            Comparator<Estudiante> comparator1 = (e1, e2) -> e1.getNombre().compareTo(e2.getNombre());
            lista.sort(comparator1 );
            return lista;

        }
         
      public List<Estudiante> c4() {
            List<Estudiante> lista = new ArrayList<>(estList);
             Comparator<Estudiante> comparator2 = comparingDouble(e1.getEdad(), e2.getEdad());
            lista.sort(comparator2);
            return lista;

        }
         
      public List<Estudiante> c5() {
            List<Estudiante> lista = new ArrayList<>(estList);
            lista.sort();
            return lista;

        }
         


}
