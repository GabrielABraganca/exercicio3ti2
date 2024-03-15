package app;

import static spark.Spark.*;

public class Aplicacao {
    public static void main(String[] args) {
        // Configura as rotas
        CamisasTimeService camisasTimeService = new CamisasTimeService(new CamisasTimeDAO());

        // Rota para exibir todas as camisas de time
        get("/camisastime", (request, response) -> camisasTimeService.getAllCamisasTime(request, response));

        // Rota para adicionar uma nova camisa de time
        post("/camisastime", (request, response) -> camisasTimeService.addCamisaTime(request, response));

        // Rota para exibir detalhes de uma camisa de time específica
        get("/camisastime/:id", (request, response) -> camisasTimeService.getCamisaTime(request, response));

        // Rota para atualizar os detalhes de uma camisa de time
        put("/camisastime/:id", (request, response) -> camisasTimeService.updateCamisaTime(request, response));

        // Rota para deletar uma camisa de time
        delete("/camisastime/:id", (request, response) -> camisasTimeService.deleteCamisaTime(request, response));
    }
}
