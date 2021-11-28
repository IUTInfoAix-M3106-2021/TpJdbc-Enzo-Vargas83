package fr.univ_amu.iut;

// Importer les classes jdbc
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.*;

import fr.univ_amu.iut.beans.Etudiant;

import fr.univ_amu.iut.beans.Etudiant;
import fr.univ_amu.iut.DAO.DAOEtudiant;
import fr.univ_amu.iut.DAO.JDBC.DAOEtudiantJDBC;

public class ExempleDaoEtudiant {    
    public static void main(String[] args) throws SQLException {
        // Connexion a la base de données
        System.out.println("Connexion");
        try {
            DAOEtudiant Dao = new DAOEtudiantJDBC();
            List<Etudiant> listET = new ArrayList<Etudiant>();
            listET = Dao.findAll();

            listET.forEach(etudiant -> System.out.println(etudiant.toString()));
  
            } catch (Exception e) {
            e.printStackTrace();// Arggg!!!
            System.out.println(e.getMessage() + "\n");
        }
    }
}