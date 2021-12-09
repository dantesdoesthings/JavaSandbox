package com.dantesdoesthings.sandbox;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum DeviceType {
    @JsonAlias({"pc", "personal computer"})
    PERSONAL_COMPUTER("Personal Computer"),
    TABLET("Tablet"),
    PHONE("Phone");

    private String description;
}