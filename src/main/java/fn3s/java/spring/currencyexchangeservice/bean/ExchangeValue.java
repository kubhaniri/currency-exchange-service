package fn3s.java.spring.currencyexchangeservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {
    @Id
    private Long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    private int port;

    private BigDecimal minBounded;
    private BigDecimal maxBounded;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public BigDecimal getMinBounded() {
        return minBounded;
    }

    public void setMinBounded(BigDecimal minBounded) {
        this.minBounded = minBounded;
    }

    public BigDecimal getMaxBounded() {
        return maxBounded;
    }

    public void setMaxBounded(BigDecimal maxBounded) {
        this.maxBounded = maxBounded;
    }

    @Override
    public String toString() {
        return "ExchangeValue{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionMultiple=" + conversionMultiple +
                ", port=" + port +
                ", minBounded=" + minBounded +
                ", maxBounded=" + maxBounded +
                '}';
    }
}
