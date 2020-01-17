package fn3s.java.spring.currencyexchangeservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("currency-exchange-service")
public class Configuration {
    private String protolo;

    public String getProtolo() {
        return protolo;
    }

    public void setProtolo(String protolo) {
        this.protolo = protolo;
    }
}
