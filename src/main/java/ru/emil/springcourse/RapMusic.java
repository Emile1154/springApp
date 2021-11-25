package ru.emil.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Oxxxymiron - Last call";
    }
}
