package fn3s.java.spring.currencyexchangeservice.service;

import fn3s.java.spring.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.web.bind.annotation.PathVariable;

public interface CurrencyExchangeService {
    ExchangeValue retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    );
}
