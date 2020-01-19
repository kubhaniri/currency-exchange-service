package fn3s.java.spring.currencyexchangeservice.proxy;

import fn3s.java.spring.currencyexchangeservice.bean.VolatilityBoundaryBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="limits-service", url="localhost:8080")
public interface LimitServiceProxy {

    @GetMapping("/volatility-boundary/currencyfrom/{currencyfrom}/currencyto/{currencyto}")
    VolatilityBoundaryBean getVolatilityBoundary(
            @PathVariable("currencyfrom") String currencyfrom,
            @PathVariable("currencyto") String currencyto
    );
}
