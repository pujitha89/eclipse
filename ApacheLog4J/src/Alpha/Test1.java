package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {
   private static Logger log=LogManager.getLogger(Test1.class.getName());
	public static void main(String[] args) {

log.debug("hi hello");
log.error("this is error");
	}

}
