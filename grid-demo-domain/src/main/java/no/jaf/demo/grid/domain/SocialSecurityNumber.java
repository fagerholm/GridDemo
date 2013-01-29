package no.jaf.demo.grid.domain;

import java.io.Serializable;

public class SocialSecurityNumber implements Serializable {

    private Long number;

    public SocialSecurityNumber(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }
}
