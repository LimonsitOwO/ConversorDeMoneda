import java.util.Map;

public record ExchangeRateRecord(
        String base_code,
        Map<String, Double> conversion_rates
) { }
