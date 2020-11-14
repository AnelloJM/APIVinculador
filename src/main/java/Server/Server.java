package Server;

import Estructuras.IngresoEgreso;
import java.util.ArrayList;
import java.util.List;
import spark.Spark;
import spark.debug.DebugScreen;

public class Server {
    public static void main(String[] args){
        Spark.port(9000);
        Router.init();
        DebugScreen.enableDebugScreen();
    }
}
