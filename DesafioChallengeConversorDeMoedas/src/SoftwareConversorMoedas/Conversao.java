package SoftwareConversorMoedas;

import java.util.Map;

public class Conversao {
    private String base_code;
    private Map<String, Double> conversion_rates;
    private double valorMoeda;
    private double valorMoedaConvertida;
    private String baseMoedaConvertida;

    public Conversao(String base_code, String baseMoedaConvertida, double valorMoeda, double valorMoedaConvertida){
        this.base_code = base_code;
        this.baseMoedaConvertida = baseMoedaConvertida;
        this.valorMoeda = valorMoeda;
        this.valorMoedaConvertida = valorMoedaConvertida;
    }
    public double getTaxa(String moedaConvertida){
        return conversion_rates.getOrDefault(moedaConvertida, 0.0);
    }

    @Override
    public String toString() {
        return "Valor " + valorMoeda + " [" + base_code + "] " + " corresponde ao valor final de =>>> " + valorMoedaConvertida + " [" + baseMoedaConvertida + "] ";
    }

}