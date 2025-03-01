package dev.hyunec.javachange.java8.interfacedefaultmethod;

import java.time.ZonedDateTime;

public class J8Class3 implements J8Interface {

    @Override
    public String getTime() {
        return ZonedDateTime.now(java.time.ZoneId.of("UTC")).toString();
    }
}
