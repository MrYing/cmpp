import org.ne81.sp.cmpp.CmppServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CmppTestServer {
	private final static Logger LOGGER = LoggerFactory.getLogger(LoggerFactory.class);
	public static void main(String args[]) {
		new CmppServer(7890).start();
		LOGGER.debug("app start") ;
	}
}
