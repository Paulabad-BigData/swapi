package com.swapi.starwars.cli;

import com.beust.jcommander.Parameter;

import javax.xml.transform.Result;
import java.util.List;

public class CLIArguments {
    // Se crea un constructor que no recibe nada así se previene que se creen objetos a partir de está clase

    public CLIArguments() {
    }

    // Anotaciones de JCommander: cada propiedad que es un parametro se puede recibir por terminal
    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD"
    )

    // Se agregan las propiedades (keywords de la busqueda)
    private String keyword;

    @Parameter(
            names = {"--name", "-n"},
            description = "Cada busqueda incluye nombre del Personaje"
    )
    private String name;

    @Parameter(
            names = {"--page", "-p"},
            description = "La API devuelve n resultados, usa un número para la pagina"
    )
    private int page = 0;


    @Parameter(
            names = "--markdown",
            description = "Obtener los resultados en Markdwon"
    )
    private boolean isMarkdown = false;

    @Parameter(
            names = "--help",
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Mostrar ayuda"
    )
    private boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", name='" + name + '\'' +
                ", page=" + page +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    // Se crea función Supplier
    public static CLIArguments newInstance() {
        return new CLIArguments();
    }
}
