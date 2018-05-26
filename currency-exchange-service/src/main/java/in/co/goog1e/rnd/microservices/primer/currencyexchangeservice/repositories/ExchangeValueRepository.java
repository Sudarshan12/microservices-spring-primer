package in.co.goog1e.rnd.microservices.primer.currencyexchangeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.goog1e.rnd.microservices.primer.currencyexchangeservice.beans.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
}
