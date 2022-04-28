import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logexample {
    private static Logger logger= LoggerFactory.getLogger(Logexample.class);
    public static void main(String []args){

 logger.info("Started main method");
        System.out.println("Iam in printer");
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        System.out.println("Committed");

    }
}
