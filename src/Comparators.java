import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparators {

  List<Estudiante> estudiantes;
  //Se puede crear la lista como atributo aqui



  public Comparators() {
    List<Estudiante> estudiantes = new ArrayList<>(List.of(
    new Estudiante("E014", "Ana",    20, 8.5, "Computacion"),
    new Estudiante("E003", "Luis",   19, 7.8, "Electronica"),
    new Estudiante("E018", "Maria",  21, 9.2, "Computacion"),
    new Estudiante("E007", "Pedro",  20, 8.5, "Mecatronica"),
    new Estudiante("E001", "Sofia",  18, 9.5, "Computacion"),
    new Estudiante("E012", "Diego",  22, 6.8, "Electronica"),
    new Estudiante("E005", "Ana",    19, 8.5, "Computacion"),
    new Estudiante("E020", "Carlos", 21, 7.8, "Mecatronica"),
    new Estudiante("E009", "Lucia",  20, 9.2, "Electronica"),
    new Estudiante("E016", "Mateo",  18, 7.0, "Computacion"),
    new Estudiante("E002", "Elena",  22, 8.0, "Mecatronica"),
    new Estudiante("E011", "Pablo",  21, 9.5, "Electronica"),
    new Estudiante("E006", "Sara",   19, 6.8, "Computacion"),
    new Estudiante("E019", "Juan",   20, 8.0, "Mecatronica"),
    new Estudiante("E004", "Diana",  18, 9.2, "Electronica"),
    new Estudiante("E015", "Bruno",  22, 7.0, "Computacion"),
    new Estudiante("E008", "Carla",  21, 8.5, "Mecatronica"),
    new Estudiante("E017", "Andres", 19, 9.5, "Electronica"),
    new Estudiante("E010", "Ana",    20, 8.5, "Computacion"),
    new Estudiante("E013", "Luis",   19, 7.8, "Electronica")
));
}

public List<Estudiante> c1() {
  List<Estudiante> listac1 = new ArrayList<>(estudiantes);
  System.out.println("Critero 1: Codigo ascendente");
  // Uso de Comparable en clase Estudiante y su ordenamiento natural
  // Ordenamiento natural -> codigo ascendente
  listac1.sort(null);
  return listac1;
}

public List<Estudiante> c2() {
  List<Estudiante> listac2 = new ArrayList<>(estudiantes);
  System.out.println("Critero 2: Nombre ascendente, Codigo ascendente");
  // Comparator con lambda de dos parametros (manual)
  Comparator<Estudiante> comparador_nc = (e1,e2) -> {
    
    //Comparar por nombre
    int compararNombres = e1.getNombre().compareTo(e2.getNombre());

    //si no empatan devuelve la variable si no sigue
    if (compararNombres != 0) {
      return compararNombres;
    }

    //segunda comparacion si existe empate
    return e1.getCodigo().compareTo(e2.getCodigo());

  };
  listac2.sort(comparador_nc);
  return listac2;
}

public List<Estudiante> c3() {
  List<Estudiante> listac3 = new ArrayList<>(estudiantes);
  System.out.println("Critero 3: Nota ascendente, sin desempate");
  // comparing Double y referencia a metodo
  Comparator<Estudiante> comparador_not = Comparator.comparingDouble(Estudiante::getNota);
  listac3.sort(comparador_not);
  return listac3;
}

public List<Estudiante> c4() {
  List<Estudiante> listac4 = new ArrayList<>(estudiantes);
  System.out.println("Critero 4: Nota descendente, nombre ascendente");
  // reversed y thenComparing
  Comparator<Estudiante> comparador_notd_na = Comparator.comparingDouble(Estudiante::getNota)
                   .reversed()
                   .thenComparing(e -> e.getNombre());
  listac4.sort(comparador_notd_na);
  return listac4;
}

public List<Estudiante> c5() {
  List<Estudiante> listac5 = new ArrayList<>(estudiantes);
  System.out.println("Critero 5: Edad ascendente, nombre descendente");
  // comparingInt y sentido independiente
  Comparator<Estudiante> comparador_ea_nd = Comparator.comparingInt(Estudiante::getEdad)
            .thenComparing((e1,e2) -> e2.getNombre().compareTo(e1.getNombre()));
  listac5.sort(comparador_ea_nd);
  return listac5;
}
public List<Estudiante> c6() {
  List<Estudiante> listac6 = new ArrayList<>(estudiantes);
  System.out.println("Critero 6: Carrera ascendente, nota descendente, nombre ascendente,codigo ascendente");
  // Composicion de cuatro criterios
  Comparator<Estudiante> comparador6 = Comparator.comparing(Estudiante::getCarrera)
              //Se debe inlcuir el Comparator. si el orden no es natural
              .thenComparing(Comparator.comparingDouble(Estudiante::getNota).reversed())
              .thenComparing(e-> e.getNombre())
              .thenComparing(e-> e.getCodigo());
listac6.sort(comparador6);
return listac6;
}
public List<Estudiante> c7() {
  List<Estudiante> listac6 = new ArrayList<>(estudiantes);
  System.out.println("Critero 6: Nota ajustada descendente,nombre ascendente,codigo ascendente");
  return listac6;
}
}
