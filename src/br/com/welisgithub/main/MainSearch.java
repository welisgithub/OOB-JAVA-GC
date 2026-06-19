package br.com.welisgithub.main;

import br.com.welisgithub.exception.ErrorAgeException;
import br.com.welisgithub.models.Titles;
import br.com.welisgithub.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = leitura.nextLine();

        String chave = "bb9f170a";
        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+")
                + "&apikey=" + chave;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers
                    .ofString());
            System.out.println(response.body());

            String json = response.body();
            System.out.println(json);
            System.out.println(" ");


            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            System.out.println(" ");

            Titles meuTitulo = new Titles(meuTituloOmdb);
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço.");
        } catch (ErrorAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}
