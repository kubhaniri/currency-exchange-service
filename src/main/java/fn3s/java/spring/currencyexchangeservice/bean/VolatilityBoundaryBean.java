package fn3s.java.spring.currencyexchangeservice.bean;

import java.math.BigDecimal;
import java.util.Date;

public class VolatilityBoundaryBean {
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal minBounded;
    private BigDecimal maxBounded;
    private Date dateInsertion;
    private int port;

    public VolatilityBoundaryBean() {
    }

    public VolatilityBoundaryBean(String currencyFrom, String currencyTo, BigDecimal minBounded, BigDecimal maxBounded, Date dateInsertion, int port) {
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.minBounded = minBounded;
        this.maxBounded = maxBounded;
        this.dateInsertion = dateInsertion;
        this.port = port;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
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

    public Date getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(Date dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "VolatilityBoundaryBean{" +
                "currencyFrom='" + currencyFrom + '\'' +
                ", currencyTo='" + currencyTo + '\'' +
                ", minBounded=" + minBounded +
                ", maxBounded=" + maxBounded +
                ", dateInsertion=" + dateInsertion +
                ", port=" + port +
                '}';
    }
}
