package ejer4;

public class ModeloS extends tesla{
	private String superiorcristal;

	public ModeloS(String modelo, int autonomia, String conduccionauto, String superiorcristal) {
		super(modelo, autonomia, conduccionauto);
		this.superiorcristal = superiorcristal;
	}

	public String getSuperiorcristal() {
		return superiorcristal;
	}

	public void setSuperiorcristal(String superiorcristal) {
		this.superiorcristal = superiorcristal;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Cuenta con el techo de cristal " + superiorcristal;
 	}
	
	

}
