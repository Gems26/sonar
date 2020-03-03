package com.mycompany.app;
import java.util.logging.Logger;



/**
 * Hello world!
 */
public class App
{
	public static final Logger logger = Logger.getLogger(App.class.getName());
    
    public static final String M = "Hello World!";

    public App() {//shduahus
    	}
    

    public static void main(String[] args) {
        Logger.info(new App().getMessage());
    }

    private final String getMessage() {
        return M;
    }

}
