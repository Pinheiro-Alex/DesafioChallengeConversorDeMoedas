package SoftwareConversorMoedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public Conversao buscaMoeda(String baseMoeda, String moedaConvertida, double valorMoeda) {

        String chave = "ce3eba946c9453cbeb31ad65";
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/"+ chave + "/latest/" + baseMoeda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(moeda)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Conversao conversao = new Gson().fromJson(response.body(), Conversao.class);
            double taxaConversao = conversao.getTaxa(moedaConvertida);
            double valorMoedaConvertida = valorMoeda * taxaConversao;
            return new Conversao(baseMoeda, moedaConvertida, valorMoeda, valorMoedaConvertida);
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro de busca na busca...");
        }
    }
}
