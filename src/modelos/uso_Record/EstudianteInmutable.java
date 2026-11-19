package modelos.uso_Record;

public record EstudianteInmutable(String codigo, String nombre, int edad, double nota, String carrera) implements
                                    Comparable<EstudianteInmutable> {

    @Override
    public int compareTo(EstudianteInmutable einm) {
        //Comparacion  natural por codigo acendente
        return this.codigo.compareTo(einm.codigo());
    }

}
