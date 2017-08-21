
import java.util.ArrayList; 

public abstract class DatosJugador {
  
ArrayList jugador;
ArrayList password; 
// crear constructor 
    public DatosJugador(ArrayList jugador, ArrayList password) {
        this.jugador = jugador;
        this.password = password;
        
    }
// crear getter y setter
    public ArrayList getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList jugador) {
        this.jugador = jugador;
    }

    public ArrayList getPassword() {
        return password;
    }

    public void setPassword(ArrayList password) {
        this.password = password;
    }
    public abstract void JugadorIn (String jugador);
    public abstract void PasswordIn (String password);
   
    
}

   

