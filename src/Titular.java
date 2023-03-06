/**
*<h2>Clase titular</h2>
*
*@author Javier Coque García
*@version 1.0
*/




public class Titular
{
	/**
	*Atributos de la clase.
	*/
    private String nif = "";
    private String nombre = "";
    private String direccion = "";
    private float credito = 0.0f;
	/**
	*Constructor de la clase
	*@author Javier Coque García
	*@param nif Define el nif del titular, es de tipo String
	*/
    public Titular (String nif)
    {
        this.nif = nif;
    }
	/**
	*Modifica el valor del atributo titular
	*@author Javier Coque García
	*@param nombre por el que cambiaremos el titular, es de tipo String
	*/
    public void modificarNombre (String nombre)
    {
        this.nombre = nombre;
    }
	/**
	*Modifica el valor del atributo direccion
	*@author Javier Coque García
	*@param direccion por el que cambiaremos la direccion, es de tipo String
	*/
    public void modificarDireccion (String direccion)
    {
        this.direccion = direccion;
    }
	/**
	*Modifica el valor del atributo credito
	*@author Javier Coque García
	*@param credito por el que cambiaremos el credito de la cuenta, es de tipo float
	*/
    public void modificarCredito (float credito)
    {
        this.credito = credito;
    }
	/**
	*metodo getNif
	*@return devuelve el nif del titular, es de tipo String
	*/
    public String getNif ()
    {
        return nif;
    }
	/**
	*metodo getCredito
	*@return devuelve el credito de la cuenta, es de tipo float
	*/
    public float getCredito ()
    {
        return credito;
    }
}