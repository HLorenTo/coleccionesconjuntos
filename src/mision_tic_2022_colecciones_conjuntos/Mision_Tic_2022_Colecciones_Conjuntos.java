package mision_tic_2022_colecciones_conjuntos;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class Mision_Tic_2022_Colecciones_Conjuntos {
    public static void main(String[] args) {
        Set ejemploObjetoConjuntoHashSet = new HashSet();
        ejemploObjetoConjuntoHashSet.add("Elemento_1");
        ejemploObjetoConjuntoHashSet.add("Elemento_3");
        ejemploObjetoConjuntoHashSet.add("Elemento_2");
        ejemploObjetoConjuntoHashSet.add("Elemento_2");
        System.out.println("Conjunto tipo hash");
        mostrar_elementos(ejemploObjetoConjuntoHashSet);
        SortedSet ejemploObjetoConjuntoTreeSet = new TreeSet();
        ejemploObjetoConjuntoTreeSet.add("Elemento_1");
        ejemploObjetoConjuntoTreeSet.add("Elemento_3");
        ejemploObjetoConjuntoTreeSet.add("Elemento_2");
        ejemploObjetoConjuntoTreeSet.add("Elemento_2");
        System.out.println("Conjunto tipo Tree");
        mostrar_elementos(ejemploObjetoConjuntoTreeSet);
    }
    public static void mostrar_elementos(Collection coll){
        Iterator iter = coll.iterator();
        while (iter.hasNext()){
            String elem = (String) iter.next();
            System.out.println(elem+"");
        }
        System.out.println("");
    }
    
}
