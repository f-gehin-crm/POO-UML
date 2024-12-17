public class Labouteille implements Cloneable{

    // attributs

    private boolean ouvert;
    private float contenantEnMl;
    private String marque;
    private float tailleEnCm;
    private String materiaux;
    private String contenu;
    private float contenuEnPourcentage;
    private float poidsEnGr;


    // Constructeur par défaut

    public Labouteille () {   
    }

    // Constructeur classique 
    // This. sert à indiquer un objet particulier
    public Labouteille (boolean ouvert, float contenantEnMl, 
    String marque, float tailleEnCm, String materiaux, String contenu, float contenuEnPourcentage, float poidsEnGr) {
        this.ouvert = ouvert;
        this.contenantEnMl = contenantEnMl;
        this.marque = marque;
        this.tailleEnCm= tailleEnCm;
        this.materiaux = materiaux;
        this.contenu =contenu;
        this.contenuEnPourcentage= contenuEnPourcentage;
        this.poidsEnGr = poidsEnGr;
    }

        // Constructeur par clonage version jessy
        public Object clone() {
                Object o = null;
                try {
                    // On récupère l'instance à renvoyer par l'appel de la
                    // méthode super.clone()
                    o = super.clone();
                } catch (CloneNotSupportedException cnse) {
                    // Ne devrait jamais arriver, car nous implémentons
                    // l'interface Cloneable
                    cnse.printStackTrace(System.err);
                }
                // on renvoie le clone
                return o;
            
        }

    /*    // Constructeur par clonage 
         public Labouteille ( Labouteille labouteille1) */





        
    }


