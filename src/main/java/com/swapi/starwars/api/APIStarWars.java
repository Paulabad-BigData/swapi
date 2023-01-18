package com.swapi.starwars.api;

import com.swapi.starwars.StarPersonages;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIStarWars {

    @RequestLine("GET /api/people/")
    List<StarPersonages> personage(@QueryMap Map<String, Object> queryMap);
}
