package in.co.goog1e.rnd.microservices.primer.currencyexchangeservice.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="CONVERSION_MULTIPLE")
	private BigDecimal converstionMultiple;
	private int port;
	
	protected ExchangeValue() {
		
	}

	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param converstionMultiple
	 * @param port
	 */
	public ExchangeValue(Long id, String from, String to, BigDecimal converstionMultiple, int port) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.converstionMultiple = converstionMultiple;
		this.port = port;
	}

	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", converstionMultiple="
				+ converstionMultiple + ", port=" + port + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConverstionMultiple() {
		return converstionMultiple;
	}

	public void setConverstionMultiple(BigDecimal converstionMultiple) {
		this.converstionMultiple = converstionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	

}
