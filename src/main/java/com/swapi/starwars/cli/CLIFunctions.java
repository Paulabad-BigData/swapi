package com.swapi.starwars.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments) {
        Map<String, Object> params = new HashMap<>();

        params.put("description", cliArguments.getKeyword());
        params.put("name", cliArguments.getName());
        params.put("page", cliArguments.getPage());

        if (cliArguments.isMarkdown()) {
            params.put("markdown", true);
        }

        return params;
    }
}
