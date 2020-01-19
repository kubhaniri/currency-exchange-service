package fn3s.java.spring.currencyexchangeservice.service.impl;

import fn3s.java.spring.currencyexchangeservice.bean.ExchangeValue;
import fn3s.java.spring.currencyexchangeservice.bean.VolatilityBoundaryBean;
import fn3s.java.spring.currencyexchangeservice.config.Configuration;
import fn3s.java.spring.currencyexchangeservice.proxy.LimitServiceProxy;
import fn3s.java.spring.currencyexchangeservice.repository.IExchangeValueRepository;
import fn3s.java.spring.currencyexchangeservice.service.CurrencyExchangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private Configuration configuration;

    @Autowired
    private Environment environment;

    @Autowired
    IExchangeValueRepository exchangeValueRepository;

    @Autowired
    LimitServiceProxy limitServiceProxy;

    @Override
    public ExchangeValue retrieveExchangeValue(String from, String to) {

        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        VolatilityBoundaryBean volatilityBoundary = limitServiceProxy.getVolatilityBoundary(from, to);
        log.info("VolatilityBoundaryBean from currency {} to {} is: {}", from, to, volatilityBoundary);
        exchangeValue.setMaxBounded(volatilityBoundary.getMaxBounded());
        exchangeValue.setMinBounded(volatilityBoundary.getMinBounded());
        return exchangeValue;
    }
}
