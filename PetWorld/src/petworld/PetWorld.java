/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petworld;

/**
 *
 * @author 65130500219 Pipatpol Jirawatpapha
 */
public class PetWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pet p1 = new Pet("Leub", 111, "female");
        System.out.println(p1.name + " " + p1.getGender());
        Pet p2 = new Pet("Deng", 112, "Mixing");
        System.out.println(p2.name + " " + p2.getGender());
//      p2.gender = "Mixer"; 
//      after set private then gender cannot access directly
        p2.setGender("Mixer");
        System.out.println(p2.name + " " + p2.getGender());
        p2.setType("raptor");
        System.out.println(p2.name + " " + p2.getType());
        p1.setType("crocodile");
        System.out.println(p1.name + " " + p1.getType());
        Vaccine v1 = new Vaccine("GK26", "CoViD", "Pfizu", 5);
        Vaccine v2 = new Vaccine("GT11", "Cancer", "Moderne", 100);
        System.out.println(v2.getCompany() + " " + v2.getDose());
        p1.vaccinate(v2);
        p1.vaccinate(v1);
        System.out.println(p1.getVaccineCount());
        System.out.println(p2.getVaccineCount());
        p1.showAllPreventDiseases();
        p2.showAllPreventDiseases();
    }
    
}