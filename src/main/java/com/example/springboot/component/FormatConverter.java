package com.example.springboot.component;

import org.openapitools.model.Format;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FormatConverter implements Converter<String, Format> {

    @Override
    public Format convert(String source) {
        try {
            return Format.fromValue(source);
        } catch (Exception e) {
            return Format.JSON;
        }
    }
}
