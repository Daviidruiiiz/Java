package shapeException;

import java.lang.*;


public class TestException {
    
    /**
     * The constructor - invokes a method where an exception occurs 
     * and catches it
     *
     */

    public TestException() {
    	try {
    		methodA();
        }
        catch( ShapeException e ) {
        	System.out.println( "ShapeException caught" );
        	System.out.print( "The message text was: " );
        	System.out.println( e.getMessage() );
        }
    }

    /**
     * Throw a ShapeException so that we can catch it
     *
     * @exception ShapeException always thrown "exception thrown in methodA"
     */

    public void methodA() throws ShapeException {
    	throw new ShapeException( "exception thrown in methodA" );
    }

  
    public static void main( String[] args ) {
    	TestException testa = new TestException();
    }
} 

