
import java.util.ArrayList;


public class Extend extends DatosJugador {

    public Extend(ArrayList jugador, ArrayList password) {
        super(jugador, password);
    }
// agrega los jugadores y password
    @Override
    public void JugadorIn(String jugador) {
        super.jugador.add(jugador);
        
    }

    @Override
    public void PasswordIn(String password) {
     super.password.add(password);
    }
    
}
