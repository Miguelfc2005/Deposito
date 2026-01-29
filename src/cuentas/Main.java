package cuentas;

public class Main {

    public static void main(String[] args) {

        CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);

        float cantidad = 695;

        operativa_cuenta(cuenta1, cantidad);
    }

    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {

        System.out.println("El saldo actual es " + cuenta1.estado());

        try {
            cuenta1.retirar(cantidad);
            System.out.println("Retirada realizada correctamente");
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            cuenta1.ingresar(cantidad);
            System.out.println("Ingreso realizado correctamente");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }

        System.out.println("Saldo final: " + cuenta1.estado());
    }
}
