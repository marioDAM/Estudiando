package transferencia;

public class Transferencia {

    public static float transferir(float saldo, float cantidad, String destino) {
        if (cantidad >= 0.5 || cantidad <= 500) {
            if (saldo > cantidad) {
            } else {
                System.out.println("No se puede realizar la operacion debido a" +
                        " que la cantidad de envio es mayor que el saldo ");
            }
            System.out.println("Transferencia realizada con éxito");
        }
        if (destino.startsWith("6") && destino.length() == 9) {
            System.out.println("La direccion de destino es válida");

        } else {
            System.out.println("La dirección de destino es inválida");
        }
        System.out.println("saldo actual de la cuenta " + (cantidad + saldo));
        return cantidad + saldo;
    }

    public static void main(String[] args) {
        //Dejamos por defecto un main, para ver que el programa funciona
        float x = transferir(300, 200, "652145895");

    }
}
