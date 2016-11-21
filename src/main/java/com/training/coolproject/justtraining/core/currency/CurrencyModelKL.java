package com.training.coolproject.justtraining.core.currency;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyModelKL {

    private Map<String, CurrencyBuySaleModel> data;

    public Map<String, CurrencyBuySaleModel> getData() {
        return data;
    }

    public void setData(final Map<String, CurrencyBuySaleModel> data) {
        this.data = data;
    }

    private static final class CurrencyBuySaleModel {
        @JsonProperty("BUY")
        private CurrencyValues buy;
        @JsonProperty("SALE")
        private CurrencyValues sale;

        public CurrencyValues getBuy() {
            return buy;
        }

        public void setBuy(final CurrencyValues buy) {
            this.buy = buy;
        }

        public CurrencyValues getSale() {
            return sale;
        }

        public void setSale(final CurrencyValues sale) {
            this.sale = sale;
        }
    }

    private static final class CurrencyValues extends HashMap<String, String> {
        public double getValue() {
            return getValue(null);
        }

        public double getValue(String key) {
            return Double.parseDouble(get(StringUtils.isEmpty(key) ? getFirstKey() : key));
        }

        private String getFirstKey() {
            return keySet().iterator().next();
        }
    }
}
