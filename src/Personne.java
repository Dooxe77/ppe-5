import java.util.Date;

/**
 *
 * @author tony
 */
public class Personne {
    
    private long numPers;
    private String nomPers;
    private String prenomPers;
    private String emailPers;
    private Date date_naiss;
    private String organisation;
    private String observations;

    public Personne(long numPers, String nomPers, String prenomPers, String emailPers, Date date_naiss, String organisation, String observations) {
        this.numPers = numPers;
        this.nomPers = nomPers;
        this.prenomPers = prenomPers;
        this.emailPers = emailPers;
        this.date_naiss = date_naiss;
        this.organisation = organisation;
        this.observations = observations;
    }

    public long getNumPers() {
        return numPers;
    }

    public void setNumPers(long numPers) {
        this.numPers = numPers;
    }

    public String getNomPers() {
        return nomPers;
    }

    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    public String getPrenomPers() {
        return prenomPers;
    }

    public void setPrenomPers(String prenomPers) {
        this.prenomPers = prenomPers;
    }

    public String getEmailPers() {
        return emailPers;
    }

    public void setEmailPers(String emailPers) {
        this.emailPers = emailPers;
    }

    public Date getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(Date date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
    
}
