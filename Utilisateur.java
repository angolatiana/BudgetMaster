import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return budjetMensuel == that.budjetMensuel && Objects.equals(nom, that.nom) && Objects.equals(depenses, that.depenses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, budjetMensuel, depenses);
    }

    public void nouvelleDepense(Depenses depense){
        depenses.add(depense);
    }

    public void depenceParCategorie(Categorie categorie){
        List<Depenses> depenses1= new ArrayList<>();
        for (Depenses depense : depenses) {
            if (depense.equals(categorie)){
                depenses1.add(depense);
            }
        }
        System.out.println(depenses1);
    }
}