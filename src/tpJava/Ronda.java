package tpJava;

public class Ronda 
{
	private String nro;
	private Partido[] partidos;
	
	public Ronda(){}
	
	public String getNro() 
	{
		return nro;
	}
	
	public void setNro(String nro) 
	{
		this.nro = nro;
	}
	
	public Partido[] getPartidos()
	{
		return partidos;
	}
	
	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}
}