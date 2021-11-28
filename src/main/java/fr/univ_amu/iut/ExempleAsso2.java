package fr.univ_amu.iut;

// Importer les classes jdbc
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.*;

import fr.univ_amu.iut.beans.Etudiant;
import fr.univ_amu.iut.beans.Prof;
import fr.univ_amu.iut.beans.Module;

public class ExempleAsso2 {

    private static final String reqEtudiantsAixois =
    "SELECT NUM_ET, NOM_ET, PRENOM_ET, CP_ET, VILLE_ET, ANNEE, GROUPE  " +
            "FROM ETUDIANT " +
            "WHERE VILLE_ET = 'AIX-EN-PROVENCE'";
public static void main(String[] args) throws SQLException {
    // Connexion a la base de données
    System.out.println("Connexion");
    try (Connection conn = ConnexionUnique.getInstance().getConnection()){
        System.out.println("Connecte\n");
        
        // Creation d'une instruction SQL
        Statement statement = conn.createStatement();
        
        // Execution de la requete
        System.out.println("Execution de la requete : " + reqEtudiantsAixois);
        ResultSet resultSet = statement.executeQuery(reqEtudiantsAixois);
        
        // Affichage du resultat
        ArrayList<Etudiant> ListET_n_Note = new ArrayList<Etudiant>();
        while (resultSet.next()) {

            Etudiant etu = new Etudiant();
            Module sp = new Module();
            sp.setCode(resultSet.getString("MAT_SPEC"));
            etu.setNumEt(resultSet.getInt("NUM_ET"));
            etu.setNomEt(resultSet.getString("NOM_ET"));
            etu.setPrenomEt(resultSet.getString("PRENOM_ET"));
            etu.setCpEt(resultSet.getString("CP_ET"));
            etu.setVilleEt(resultSet.getString("VILLE_ET"));
            etu.setAnnee(resultSet.getInt("ANNEE"));
            etu.setGroupe(resultSet.getInt("GROUPE"));

            System.out.println(etu.toString());

        }
                    

        // Fermeture de l'instruction (liberation des ressources)
        statement.close();
        System.out.println("\nOk.\n");
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println(e.getMessage() + "\n");
    }
        
 }
}