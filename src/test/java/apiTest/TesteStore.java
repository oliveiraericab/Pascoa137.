//Nome do pacote
package apiTest;

//Bibliotecas
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class TesteStore {
    static String ct = "application/json";
    static String uriStore = "https://petstore.swagger.io/v2/store/";

    public static String lerArquivoJson(String arquivoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(arquivoJson)));
    }

    @Test
    public void testeIncluirStore () throws IOException {
        String jsonBody = lerArquivoJson("src/test/resources/json/store1.json");
        String id = "4857";
        String shipDate = "2023-07-22T15:02:02.092Z";

        given()
                .log().all()
                .contentType (ct)
                .body(jsonBody)
        .when()
                .post(uriStore + id)
        .then()
                .log().all()
                .statusCode (200)
                .body(id, is(id))
                .body(shipDate, is(shipDate))
        ;
    }


}