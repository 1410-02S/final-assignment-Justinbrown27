import java.util.Random;

public class Main {

static Random generator;

static String[] names = {"Reed","Bailey","Bell","Gomez","Kelly","Howard","Ward","Cox","Diaz","Richardson","Wood","Watson","Brooks","Bennett","Gray","James","Reyes","Cruz","Hughes","Price","Myers","Long","Foster","Sanders","Ross","Morales","Powell","Sullivan","Russell","Ortiz","Jenkins","Gutierrez","Perry","Butler","Barnes","Fisher","Henderson","Coleman","Simmons","Patterson","Jordan","Reynolds","Hamilton","Graham","Kim","Gonzales","Alexander","Ramos","Wallace","Griffin","West","Cole","Hayes","Chavez","Gibson","Bryant","Ellis","Stevens","Murray","Ford","Marshall","Owens","Mcdonald","Harrison","Ruiz","Kennedy","Wells","Alvarez","Woods","Mendoza","Castillo","Olson","Webb","Washington"};

static String[] goods = {"food", "water", "money", "clothes"};


    static class Place{
        public int est = 0;
        public String name = "example";
        public int value = 0;


        public int startingNumber = 0;
        NPC[] people;
        String[] goods;
        String[] neighbors;

        NPC[] popular;
        NPC[] unpopular;

        public Place(String inputName, int inputStartingNumber){
            name = inputName;
            startingNumber = inputStartingNumber;
            generateGoods();

            for(int i = 0; i < startingNumber; i++){
                addRandomNPC();
            }


        }

        public Place(String inputName){
            //startingNumber = random number
            generateGoods();
            for(int i = 0; i < startingNumber; i++){
                addRandomNPC();
            }
        }

        public int increaseAge(){
            return ++est;
        }

        public NPC addRandomNPC(){
            return null;
        }

        public String[] generateGoods(){
            //TODO
            return null;
        }

    }

    static class NPC{
        String name = "examplePerson";
        int age = 0;

        String[] feelings;
        String[] thoughts;

        NPC[] friends;
        NPC[] enemies;

        String home = "Base";

        String[] travels;

        String icon = "";
        int happiness = 100;
        int boredom = 50;
        int anger = 0;

        public NPC(){
            //TODO
        }

        public void interact(){

        }

        public void cleanup(){

        }

    }

        static class Character extends NPC{

}

    public static void main(String[] args){
        generator = new Random();

    }


}
