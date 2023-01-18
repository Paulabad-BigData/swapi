package com.swapi.starwars;

import com.beust.jcommander.JCommander;
import com.swapi.starwars.api.APIStarWars;
import com.swapi.starwars.cli.CLIArguments;
import com.swapi.starwars.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.swapi.starwars.CommanderFunctions.builCommanderWithName;
import static com.swapi.starwars.CommanderFunctions.parseArguments;
import static com.swapi.starwars.api.APIFunctions.buildAPI;

public class StarWars {
    public static void main(String[] args) {
        JCommander jCommander = builCommanderWithName("swapi", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliArgumentsOptional =
                streamOfCLI.filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getKeyword() != null)
                        .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(StarWars::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }

    private static Stream<StarPersonages> executeRequest(Map<String, Object> params) {
        APIStarWars api = buildAPI(APIStarWars.class, "https://swapi.dev/");
        return Stream.of(params)
                .map(api::personage)
                .flatMap(Collection::stream);
    }
}
