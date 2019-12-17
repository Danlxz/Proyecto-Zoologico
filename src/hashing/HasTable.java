
package hashing;

import datos.dto.AnimalDTO;
import static java.lang.Math.sqrt;

public class HasTable extends HashTableDAO {

    public HasTable(int nElementos,int tipo_funcion) {
        super(nElementos, tipo_funcion);
    }

    public int funcionHash(Object obj) {
        return (int) (((AnimalDTO) obj).getId_animal() & 0x7fffffff) % numeroDeElementos();
    }
    
    public int funcionHashMulti(Object obj) {     
        int valor = (int) ((int) numeroDeElementos()*(((((AnimalDTO) obj).getId_animal() & 0x7fffffff)*((sqrt(5)-1)/2))%1));
        return valor;
    }

    public int comparar(Object obj1, Object obj2) {
        if (((AnimalDTO) obj1).getId_animal() == ((AnimalDTO) obj2).getId_animal()) {
            return 0;
        } else {
            return 1;
        }
    }
}
