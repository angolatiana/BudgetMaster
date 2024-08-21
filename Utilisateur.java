import java.util.List;

public class Utilisateur {
    private String nom;
    private int budjetMensuel;
    private List<Depenses> depenses;

    public Utilisateur(String nom, int budjetMensuel, List<Depenses> depenses) {
        this.nom = nom;
        this.budjetMensuel = budjetMensuel;
        this.depenses = depenses;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getBudjetMensuel() {
        return budjetMensuel;
    }

    public void setBudjetMensuel(int budjetMensuel) {
        this.budjetMensuel = budjetMensuel;
    }

    public List<Depenses> getDepenses() {
        return depenses;
    }

    public void setDepenses(List<Depenses> depenses) {
        this.depenses = depenses;
    }
}