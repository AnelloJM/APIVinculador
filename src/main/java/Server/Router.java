package Server;

import model.ControllerVinculador;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import utils.BooleanHelper;
import utils.HandlebarsTemplateEngineBuilder;

public class Router {
    private static HandlebarsTemplateEngine engine;

    private static void initEngine() {
        Router.engine = HandlebarsTemplateEngineBuilder
                .create()
                .withDefaultHelpers()
                .withHelper("isTrue", BooleanHelper.isTrue)
                .build();
    }

    public static void init() {
        Router.initEngine();
        Spark.staticFileLocation("/public");
        Router.configure();
    }

    private static void configure(){
        ControllerVinculador unControllerDeVinculacion = new ControllerVinculador();
        Spark.get("/api", (request, response) -> "<h1><center> Api en funcionamiento </center></h1>");
        Spark.post("/vincular", unControllerDeVinculacion::estaEntreFechas);
    }
}