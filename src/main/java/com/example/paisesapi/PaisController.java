package com.example.paisesapi;

import com.example.paisesapi.Pais;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/restricciones")
public class PaisController {
    private Map<String, Pais> paises;


    public PaisController() {
        paises = new HashMap<>();


        Pais ecuador = new Pais("Ecuador");
        ecuador.agregarRestriccionDeVisa("Venezuela", "Se requiere que lleven consigo una prueba de solvencia económica");
        ecuador.agregarRestriccionDeVisa("Cuba", "Se debe obtener una tarjeta de turista");



        Pais chile = new Pais("Chile");
        chile.agregarRestriccionDeVisa("Mexico", "Se requiere formulario migratorio");
        chile.agregarRestriccionDeVisa("Venezuela", "Se requiere visa");
        chile.agregarRestriccionDeVisa("Belice", "Se requiere visa");



        Pais colombia = new Pais("Colombia");
        colombia.agregarRestriccionDeVisa("Cuba", "Se debe obtener una tarjeta de turista");
        colombia.agregarRestriccionDeVisa("Mexico", "Se requiere formulario migratorio");
        colombia.agregarRestriccionDeVisa("Belice", "Se requiere visa");
        colombia.agregarRestriccionDeVisa("Guyana Francesa", "Se requiere visa");


        Pais brasil = new Pais("Brasil");
        brasil.agregarRestriccionDeVisa("Surinam", "Se requiere visa");

        Pais argentina = new Pais("Argentina");
        argentina.agregarRestriccionDeVisa("Ecuador", "Se requiere visa");


        Pais costa_rica = new Pais("Costa Rica");
        costa_rica.agregarRestriccionDeVisa("Cuba", "Se debe obtener visa de turista");
        costa_rica.agregarRestriccionDeVisa("Nicaragua", "Se requiere visa");


        Pais cuba = new Pais("Cuba");
        cuba.agregarRestriccionDeVisa("Mexico", "Se requiere visa de turista");
        cuba.agregarRestriccionDeVisa("Colombia", "Se requiere visa");

        Pais el_salvador = new Pais("El Salvador");
        el_salvador.agregarRestriccionDeVisa("Nicaragua", "Se requiere visa");

        Pais guatemala = new Pais("Guatemala");

        Pais guyana = new Pais("Guyana");
        guyana.agregarRestriccionDeVisa("Surinam", "Se requiere visa");
        guyana.agregarRestriccionDeVisa("Venezuela", "Se requiere visa");

        Pais honduras = new Pais("Honduras");


        Pais mexico = new Pais("Mexico");
        mexico.agregarRestriccionDeVisa("Cuba", "Se requiere visa");


        Pais nicaragua = new Pais("Nicaragua");
        nicaragua.agregarRestriccionDeVisa("Costa Rica", "Se requiere visa");

        Pais panama = new Pais("Panama");
        panama.agregarRestriccionDeVisa("Venezuela", "Se requiere visa");

        Pais paraguay = new Pais("Paraguay");


        Pais peru = new Pais("Peru");


        Pais republica_dominicana = new Pais("Republica Dominicana");
        republica_dominicana.agregarRestriccionDeVisa("Cuba", "Se requiere visa");


        Pais surinam = new Pais("Surinam");
        surinam.agregarRestriccionDeVisa("Guyana", "Se requiere visa");
        surinam.agregarRestriccionDeVisa("Brasil", "Se requiere visa");

        Pais uruguay = new Pais("Uruguay");


        Pais venezuela = new Pais("Venezuela");
        venezuela.agregarRestriccionDeVisa("Chile", "Se requiere visa");

        // Agregar los países al mapa
        paises.put("Ecuador", ecuador);
        paises.put("Chile", chile);
        paises.put("Colombia", colombia);
        paises.put("Brasil", brasil);
        paises.put("Argentina", argentina);
        paises.put("Costa Rica", costa_rica);
        paises.put("Cuba", cuba);
        paises.put("El Salvador", el_salvador);
        paises.put("Guatemala", guatemala);
        paises.put("Guyana", guyana);
        paises.put("Honduras", honduras);
        paises.put("Mexico", mexico);
        paises.put("Nicaragua", nicaragua);
        paises.put("Panama", panama);
        paises.put("Paraguay", paraguay);
        paises.put("Peru", peru);
        paises.put("Republica Dominicana", republica_dominicana);
        paises.put("Surinam", surinam);
        paises.put("Uruguay", uruguay);
        paises.put("Venezuela", venezuela);
    }


    @PostMapping("/verificar")
    public String obtenerRequisitos(@RequestBody RestriccionSolicitud solicitud) {
        String paisOrigen = solicitud.getPaisOrigen();
        String paisDestino = solicitud.getPaisDestino();

        Pais pais = paises.get(paisOrigen);

        if (pais != null) {
            String restriccion = pais.getRestriccionesDeVisa().get(paisDestino);
            if (restriccion != null) {
                return "Para viajar de " + paisOrigen + " a " + paisDestino + ", " + restriccion;
            } else {
                return "No se encuentran restricciones de visa para " + paisDestino + " desde " + paisOrigen;
            }
        } else {
            return "País de origen no encontrado";
        }
    }
}