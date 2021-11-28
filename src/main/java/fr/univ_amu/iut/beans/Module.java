package fr.univ_amu.iut.beans;

import java.io.Serializable;

public class Module implements Serializable {
    private String code;
    private String libelle;
    private int hCoursPrev;
    private int hCoursRea;
    private int hTpPrev;
    private int hTpRea;
    private String discipline;
    private int coefTest;
    private int coefCc;
    private Prof responsable;
    private Module pere;

    public Module() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCoefCc() {
        return coefCc;
    }

    public void setCoefCc(int coefCc) {
        this.coefCc = coefCc;
    }

    public int getCoefTest() {
        return coefTest;
    }

    public void setCoefTest(int coeffTest) {
        this.coefTest = coeffTest;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int gethCoursPrev() {
        return hCoursPrev;
    }

    public void sethCoursPrev(int hCoursPrev) {
        this.hCoursPrev = hCoursPrev;
    }

    public int gethCoursRea() {
        return hCoursRea;
    }

    public void sethCoursRea(int hCoursRea) {
        this.hCoursRea = hCoursRea;
    }

    public int gethTpPrev() {
        return hTpPrev;
    }

    public void sethTpPrev(int hTpPrev) {
        this.hTpPrev = hTpPrev;
    }

    public int gethTpRea() {
        return hTpRea;
    }

    public void sethTpRea(int hTpRea) {
        this.hTpRea = hTpRea;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Module getPere() {
        return pere;
    }

    public void setPere(Module pere) {
        this.pere = pere;
    }

    public Prof getResponsable() {
        return responsable;
    }

    public void setResponsable(Prof responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Module [" + (code != null ? "code=" + code + ", " : "")
                + (libelle != null ? "libelle=" + libelle + ", " : "")
                + "hCoursPrev=" + hCoursPrev + ", hCoursRea=" + hCoursRea
                + ", hTpPrev=" + hTpPrev + ", hTpRea=" + hTpRea + ", "
                + (discipline != null ? "discipline=" + discipline + ", " : "")
                + "coeffTest=" + coefTest + ", coefCc=" + coefCc + ", "
                + (responsable != null ? "responsable=" + responsable.getNomProf() + ", " : "")
                + (pere != null ? "pere=" + pere.getCode() : "") + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + coefCc;
        result = prime * result + coefTest;
        result = prime * result + ((discipline == null) ? 0 : discipline.hashCode());
        result = prime * result + hCoursPrev;
        result = prime * result + hCoursRea;
        result = prime * result + hTpPrev;
        result = prime * result + hTpRea;
        result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
        result = prime * result + ((pere == null) ? 0 : pere.hashCode());
        result = prime * result + ((responsable == null) ? 0 : responsable.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Module other = (Module) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (coefCc != other.coefCc)
            return false;
        if (coefTest != other.coefTest)
            return false;
        if (discipline == null) {
            if (other.discipline != null)
                return false;
        } else if (!discipline.equals(other.discipline))
            return false;
        if (hCoursPrev != other.hCoursPrev)
            return false;
        if (hCoursRea != other.hCoursRea)
            return false;
        if (hTpPrev != other.hTpPrev)
            return false;
        if (hTpRea != other.hTpRea)
            return false;
        if (libelle == null) {
            if (other.libelle != null)
                return false;
        } else if (!libelle.equals(other.libelle))
            return false;
        if (pere == null) {
            if (other.pere != null)
                return false;
        } else if (!pere.equals(other.pere))
            return false;
        if (responsable == null) {
            if (other.responsable != null)
                return false;
        } else if (!responsable.equals(other.responsable))
            return false;
        return true;
    }

    
}
