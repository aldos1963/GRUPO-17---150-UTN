package tpJava; //Se declara el paquete.

//Nombre de la clase.
public class Equipo 
{
	//Atributos de la clase.
	private String nombre;
	private String descripcion;
	
	//Constructor con el mismo nombre de la clase.
	//No pedimos los atributos en el constructor por que nuestros atributos son privados.
	//Que sean privados significa que solo se pueden acceder desde la misma clase.
	//Utilizamos los metodos publicos Set y Get para darle valores o leer a los atributos en lugar del constructor.
	public Equipo(){} 
	
	//Metodos de la clase.
	public String getNombre()  //Metodo para obtener el nombre del equipo.
	{
		return nombre;
	}
	
	public void setNombre(String nombre) //Metodo para darle un nombre al equipo.
	{
		this.nombre = nombre;
	}
	
	public String getDescripcion() //Metodo para obtener la descripcion del equipo.
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) //Metodo para darle una descripcion al equipo.
	{
		this.descripcion = descripcion;
	}
}