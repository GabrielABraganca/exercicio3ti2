package services;

import com.google.gson.Gson;

import java.util.List;

import static spark.Spark.*;

public class CamisasTimeService {
    private CamisasTimeDAO camisasTimeDAO;
    private Gson gson;

    public CamisasTimeService(CamisasTimeDAO camisasTimeDAO) {
        this.camisasTimeDAO = camisasTimeDAO;
        this.gson = new Gson();
    }

    public String getAllCamisasTime(Request request, Response response) {
        List<CamisasTime> camisasTimeList = camisasTimeDAO.getAllCamisasTime();
        response.type("application/json");
        return gson.toJson(camisasTimeList);
    }

    public String getCamisaTime(Request request, Response response) {
        int id = Integer.parseInt(request.params(":id"));
        CamisasTime camisasTime = camisasTimeDAO.getCamisaTimeById(id);
        if (camisasTime != null) {
            response.type("application/json");
            return gson.toJson(camisasTime);
        } else {
            response.status(404);
            return "Camisa de time não encontrada";
        }
    }

    public String addCamisaTime(Request request, Response response) {
        CamisasTime camisasTime = gson.fromJson(request.body(), CamisasTime.class);
        camisasTimeDAO.addCamisaTime(camisasTime);
        response.status(201);
        return "Camisa de time adicionada com sucesso";
    }

    public String updateCamisaTime(Request request, Response response) {
        int id = Integer.parseInt(request.params(":id"));
        CamisasTime camisasTime = gson.fromJson(request.body(), CamisasTime.class);
        camisasTimeDAO.updateCamisaTime(id, camisasTime);
        return "Camisa de time atualizada com sucesso";
    }

    public String deleteCamisaTime(Request request, Response response) {
        int id = Integer.parseInt(request.params(":id"));
        camisasTimeDAO.deleteCamisaTime(id);
        return "Camisa de time excluída com sucesso";
    }
}
