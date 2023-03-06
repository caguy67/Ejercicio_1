import java.util.Scanner;
/**
*<h2>Clase de banco</h2>
*
*@author Javier Coque García
*@version 1.0
*/
public class Banco
{	
	/**
	*Atributo de la clase
	*/
    private CuentaBancaria cuentaBancaria = null;
	/**
	* Crea una cuenta bancaria
	* Permite modificar los valores cuando se ha creado la cuenta
	* @author Javier Coque García
	*/
    public void menu ()
    {
        Scanner sc = new Scanner (System.in);

        // Crear una CuentaBancaria
		float saldo = 0.0f;
        System.out.print ("Introduzca el saldo de la cuenta: ");
        saldo = sc.nextFloat();
		sc.nextLine();
        String nif = "";
        System.out.print ("Introduzca el nif del titular de la cuenta: ");
        nif = sc.nextLine();
        cuentaBancaria = new CuentaBancaria(new Titular (nif), saldo);

        // Modificar el nombre del titular de dicha cuenta
        System.out.print ("Introduzca el nombre del titular: ");
        cuentaBancaria.getTitular().modificarNombre(sc.nextLine());
	
        // Modificar la dirección del titular de dicha cuenta
        System.out.print ("Introduzca la dirección del titular: ");
        cuentaBancaria.getTitular().modificarDireccion(sc.nextLine());
	
        // Modificar el crédito del titular de dicha cuenta
        System.out.print ("Introduzca el crédito del titular: ");
        cuentaBancaria.getTitular().modificarCredito(sc.nextFloat());
	
        // Ingresar dinero en la cuenta
        System.out.print ("Cuánto dinero desea ingresar en la cuenta? ");
        cuentaBancaria.ingresar(sc.nextFloat());
	    
        // Sacar dinero de la cuenta
        System.out.print ("Cuánto dinero desea retirar en la cuenta? ");
        cuentaBancaria.ingresar(sc.nextFloat());
	    
        // Mostrar el saldo
        cuentaBancaria.mostrarSaldo();

        sc.close();
    }
}
