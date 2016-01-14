package exer6;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {

	private static MessageSupportFactory instance = null;
	private Properties props = null;
	private MessageRenderer renderer = null;
	private MessageProvider provider = null;

	//The recipe for creating this pattern was:
	// - Make the constructor private.
	// - Static variable of its type.
	// - Assign it to the static.
	// - Create a getInstance() method.
	
	private MessageSupportFactory() {
		props = new Properties();

		try {
			
			//bean.properties is the file where we will specify who is the producer and who is
			//the renderer.
			props.load(new FileInputStream("\\Users\\YasserAlejandro\\SDP\\day-2\\SDPday2\\src\\exer6\\bean.properties"));
			
			// get the mame of implementation classes
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");

			//Check how we are casting to the interface and not the implementation class.
			renderer = (MessageRenderer) Class.forName(rendererClass)
					.newInstance();
			provider = (MessageProvider) Class.forName(providerClass)
					.newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	//This is a static constructor block.
	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}

}