package in.co.goog1e.rnd.microservices.primer.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value="limits-service")
public class Configuration {

	private int minimum;
	private int maximum;
	
	protected Configuration() {
		
	}
	/**
	 * @param minimum
	 * @param maximum
	 */
	public Configuration(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	@Override
	public String toString() {
		return "Configuration [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	
}
