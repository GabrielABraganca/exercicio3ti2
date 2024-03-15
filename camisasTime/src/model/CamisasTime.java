package model;

public class CamisasTime {
    private int id;
    private String nomeTime;
    private String corPrincipal;
    private String corSecundaria;

    public CamisasTime(int id, String nomeTime, String corPrincipal, String corSecundaria) {
        this.id = id;
        this.nomeTime = nomeTime;
        this.corPrincipal = corPrincipal;
        this.corSecundaria = corSecundaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getCorPrincipal() {
        return corPrincipal;
    }

    public void setCorPrincipal(String corPrincipal) {
        this.corPrincipal = corPrincipal;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }

    @Override
    public String toString() {
        return "CamisasTime{" +
                "id=" + id +
                ", nomeTime='" + nomeTime + '\'' +
                ", corPrincipal='" + corPrincipal + '\'' +
                ", corSecundaria='" + corSecundaria + '\'' +
                '}';
    }
}
