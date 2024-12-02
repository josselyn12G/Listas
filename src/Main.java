import java.util.*;

/* 
    Una colección es un objeto que permite agrupar otros objetos.
    En una colección se pueden realizar operaciones sobre los objetos
    que están almacenados en su interior.
    1. Solo usa OBJETOS que pueden ser modificados.
    2. Se utiliza el framework java.util
    3. ¿Qué es una lista?
   - Es una estructura de datos secuencial. Cada elemento puede tener posición o índice y permite duplicados.
   - Se puede buscar por contenido o índice.
*/

/*
   La lista resultante no es una ArrayList común; es una lista de tamaño fijo respaldada por el array original.
   El código crea un array de String, lo convierte en una List mediante Arrays.asList,
   y almacena esa lista en listaNombres. Esto permite manipular el array de forma similar a una lista,
   aunque NO SE PUEDE CAMBIAR EL TAMAÑO.

*/
public class Main {
    public static void main(String[] args) {

        // Creación de un ArrayList.
        List<String>  listaColores = new ArrayList<>(); // Es un constructor propio de la clase Object.

        /*  En listas puedo añadir, eliminar, modificar
            1. No tenemos posición.
            2. Buscamos por contenido.
            3. Cuando un objeto está vacío sale NULL. */

        //Creación mediante la clase Arrays.,
        String[] nombres ={ "Arturo", "Daniel", "Pamela"}; // Creo un vector (NO ES UN OBJETO) de tipo Clase String y luego le paso a una lista.
        List<String> listaNombres = Arrays.asList(nombres); // Esta función convierte el arreglo como parte de la lista.

        // Adición de elementos individuales
        listaColores.add("Verde");
        listaColores.add("Amarrilo");

        // Construir lista a partir de otra lista.
        System.out.println("Lista de colores añadido a lista de elementos");
        List<String> listaElementos = new ArrayList<>(listaColores); // En el constructor estamos incluyendo la lista Colores
        System.out.println(listaElementos);


        // Adición de elementos a otra colección.
        // listaElementos.add(listaColores.toString());
        listaElementos.addAll(listaNombres); // Recordar el addALL.
        System.out.println(listaElementos); //[Verde, Amarrilo, [Verde, Amarrilo]]

        //Cuando se intenta acceder a una posición que no existe se alcanza la excepción: java.lang.ArrayIndexOutOfBoundsException

        // Iteración de elementos individuales
        ListIterator<String> iterador1 = listaColores.listIterator();








        // For EACH saca todos los elementos de la lista.
        listaColores.forEach(System.out::println);

        //+++++++++++++++++++++++++++++++++++++++++ LISTA DE ELEMENTOS +++++++++++++++++++++++++++++++++++++++++++++++++++++
        ListIterator<String> iterador2 = listaElementos.listIterator();

        System.out.println("Recorrido con Iterador hacia adelante");
        while(iterador2.hasNext()){
            System.out.println("Elemento: " + iterador2.next());
        }

        System.out.println("Recorrido con Iterador hacia atrás");
        while(iterador2.hasPrevious()){
            System.out.println("Elemento: " + iterador2.previous());
        }
        System.out.println("Recorrido con Iterador eliminación dinámica");
        while (iterador2.hasNext()) {
            if (iterador2.next().equals("Pamela")) {
                iterador2.remove();
            }
        }

        listaElementos.forEach(System.out::println);
        // Cada metodo iterator debe ser para cada lista.




    }
}

/* RECUPERAR UN ELEMENTO.
        objeto = (Object) listaA.get(3);
        Recupera el elemento que se encuentra en la posición espeficicada.

        ELIMINAR UN ELEMENTO EN LA POSIICÓN
        listaA.remove(2);

        ELIMINAR ALL
        listaA.clear();


        TAMAÑO
        listaA.size();

       */