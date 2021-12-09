// camel-k:


package com.dantesdoesthings.sandbox;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class CamelSandbox extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        getContext().getGlobalOptions().put("CamelJacksonEnableTypeConverter", "true");
        getContext().getGlobalOptions().put("CamelJacksonTypeConverterToPojo", "true");

        from("file:C:\\Users\\mbara\\IdeaProjects\\Testing\\src\\main\\resources\\bean1.json")
                .marshal()
                .json(JsonLibrary.Jackson)
                .log(LoggingLevel.INFO, "!=======! Log: " + body().toString())
                .end();

    }
}
