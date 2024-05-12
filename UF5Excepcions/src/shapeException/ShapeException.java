package shapeException;

public class ShapeException extends Exception{
	
	private String mensaje;
	
	public ShapeException(String text) {
		super(text);
	}
}
