package fr.dauphine.zoo;
/**
 * Décrivez votre classe Animal ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Animal {

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private int age;
    private String gender;
    private Responsible responsable;
    private AnimalStates state;

    /**
     * Constructeur d'objets de classe Animal
     */
    public Animal(String name, int age, String gender, Responsible resp, AnimalStates state) {
        // initialisation des variables d'instance
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.responsable=resp;
        this.state=state;
    }

    /*public Animal(String name, int age, String gender) {
        // initialisation des variables d'instance
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.responsable= new Responsible("Amira");
    }*/

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
