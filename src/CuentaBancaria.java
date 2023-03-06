/**
*<h2>Clase CuentaBancaria</h2>
*
*@author Javier Coque Garc�a
*@version 1.0
*/

public class CuentaBancaria
{
	
	/**
	*Atributos de la clase.
	*/
    private Titular titular = null;
    private float saldo = 0.0f;
	
	/**
	*Constructor de la clase
	*@author Javier Coque Garc�a
	*@param titular Define el titular de la cuenta, es de tipo Titular
	*@param saldo Define el saldo de la cuenta , es de tipo float
	*/
    public CuentaBancaria (Titular titular, float saldo)
    {
        this.titular = titular;
        this.saldo = saldo;
    }
	
	/**
	*Aumentamos el valor del atributo saldo
	*@author Javier Coque Garc�a
	*@param dinero Valor que se a�adira a saldo
	*/
    public void ingresar (float dinero)
    {
        saldo += dinero;
    }
	/**
	*Disminuye el valor del atributo saldo
	*@author Javier Coque Garc�a
	*@param dinero Valor que se retirara de  saldo
	*/
    public void sacar (float dinero)
    {
        // Comprobamos si podemos retirar la cantidad de dinero solicitada
        if ((saldo - dinero) > titular.getCredito ())
            saldo -= dinero;
        else
            System.out.println ("Error, no puede retirar esa cantidad de dinero");
    }
	/**
	*Mostrara el valor del atributo saldo
	*@author Javier Coque Garc�a
	*/
    public void mostrarSaldo ()
    {
        System.out.printf ("La cuenta bancaria del titular %s tiene un saldo de %.2f�\n", titular.getNif (), saldo);
    }
	/**
	*Mostrara el Titular de la cuenta
	*@author Javier Coque Garc�a
	*@return devuelve el titular de la cuenta
	*/
    public Titular getTitular ()
    {
        return titular;
    }
}
