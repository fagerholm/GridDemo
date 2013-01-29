package no.jaf.demo.grid.domain;

import junit.framework.Assert;
import org.junit.Test;

public class SocialSecurityNumberTest {

    @Test
    public void testGetSet(){
        SocialSecurityNumber ssn = new SocialSecurityNumber(12345678901L);

        Assert.assertEquals(12345678901L, ssn.getNumber().longValue());

    }
}
