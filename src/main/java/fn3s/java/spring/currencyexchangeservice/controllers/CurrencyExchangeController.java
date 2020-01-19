package fn3s.java.spring.currencyexchangeservice.controllers;

import fn3s.java.spring.currencyexchangeservice.config.Configuration;
import fn3s.java.spring.currencyexchangeservice.bean.ExchangeValue;
import fn3s.java.spring.currencyexchangeservice.service.impl.CurrencyExchangeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Configuration configuration;

    @Autowired
    private CurrencyExchangeServiceImpl exchangeService;


    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    )
    {
        log.info("this CurrencyExchangeController Service: from = {}, to = {}. Value of protocol is: {}", from, to, configuration.getProtolo());

        ExchangeValue exchangeValue = exchangeService.retrieveExchangeValue(from, to);

        return exchangeValue;
    }
}
