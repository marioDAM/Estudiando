import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import transferencia.Transferencia;

public class TransferenciaTest {

    @Test
    private void transferirTest(float saldo, float cantidad, String destino) {
        /**
         * Probamos un valor dentro del rango,es decir esta transferencia la deberia hacer
         */
        float x = Transferencia.transferir(100, 50, "652145896");
        Assertions.assertEquals(150, x);
        /**
         * Probamos un valor en el que el saldo es menor que la cantidad que se quiere ingresar por lo que
         * esta transferencia nose podría realizar
         */
        float y = Transferencia.transferir(50, 100, )
        Assertions.assertEquals(100, 50, "632148975");
        /**
         * Probamos un valor en el que el numero no tiene 9 digitos por lo que no seria válido
         */
        float y = Transferencia.transferir(50, 100, )
        Assertions.assertEquals(300, 50, "63214897");
        /**
         * Probamos un valor en el que el numero no empieza por 6  por lo que no seria válido
         */
        float y = Transferencia.transferir(50, 100, )
        Assertions.assertEquals(300, 50, "53214897");
    }


}
