import java.util.ArrayList;
import java.util.List;

class UserManager{

    private static UserManager istanza;
    private static List<String> listaUtenti = new ArrayList<>();
    

    private UserManager(){}

    public static UserManager getInstance() {

        if (istanza == null){
            istanza = new UserManager();
        }

        return istanza;
    }

    public static void addUser(String utente){
        listaUtenti.add(utente);
    }

    public static void isContainedByUser(String user){
        for (String utente : listaUtenti) {
          /*   if(utente.getUsername().equalsIgnoreCase(user))
                return true;
        }*/
        
    }

    System.out.println("Ciaoo");
    /*public static int getSizeList(){
        return listaUtenti.size();
    }*/
    System.out.println("XCIAOCIAO");

    /*public void removeUser(Utente utente){
        listaUtenti.remove(utente);
    }*/

    }

}
