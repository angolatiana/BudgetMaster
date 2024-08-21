import java.time.LocalDate;
import java.util.List;

public class Depenses {
    private String description;
    private int montant;
    private LocalDate date;
    private Categorie categories;

    public Depenses(String description, int montant, LocalDate date, Categorie categories) {
        this.description = description;
        this.montant = montant;
        this.date = date;
        this.categories = categories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Categorie getCategories() {
        return categories;
    }

    public void setCategories(Categorie categories) {
        this.categories = categories;
    }
}
