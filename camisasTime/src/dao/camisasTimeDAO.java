package dao;

import java.util.ArrayList;
import java.util.List;

public class camisasTimeDAO {
    private List<CamisasTime> camisasTimeList;
    private int nextId;

    public CamisasTimeDAO() {
        this.camisasTimeList = new ArrayList<>();
        this.nextId = 1; // Começando com ID 1
    }

    public List<CamisasTime> getAllCamisasTime() {
        return camisasTimeList;
    }

    public CamisasTime getCamisaTimeById(int id) {
        for (CamisasTime camisasTime : camisasTimeList) {
            if (camisasTime.getId() == id) {
                return camisasTime;
            }
        }
        return null; // Retorna null se não encontrar a camisa de time com o ID especificado
    }

    public void addCamisaTime(CamisasTime camisaTime) {
        camisaTime.setId(nextId++);
        camisasTimeList.add(camisaTime);
    }

    public void updateCamisaTime(int id, CamisasTime camisaTime) {
        for (int i = 0; i < camisasTimeList.size(); i++) {
            if (camisasTimeList.get(i).getId() == id) {
                camisaTime.setId(id);
                camisasTimeList.set(i, camisaTime);
                return;
            }
        }
        // Se não encontrar a camisa de time com o ID especificado, não faz nada
    }

    public void deleteCamisaTime(int id) {
        camisasTimeList.removeIf(camisasTime -> camisasTime.getId() == id);
    }
}
