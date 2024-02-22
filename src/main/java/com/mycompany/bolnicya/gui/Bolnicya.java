/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bolnicya.gui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 207380
 */
public class Bolnicya {

    public EntityManager em;

    public static void main(String[] args) {
        new login().setVisible(true);
    }

    public void Session() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_bolnicya_jar_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
    }

}
