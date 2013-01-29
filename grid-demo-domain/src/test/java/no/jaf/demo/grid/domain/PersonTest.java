package no.jaf.demo.grid.domain;

import junit.framework.Assert;
import org.junit.Test;

import java.awt.*;

public class PersonTest {

    @Test
    public void testGetSet() {

        Person person = new Person();

        Assert.assertNotNull(person);
        Assert.assertNull(person.getName());
        Assert.assertNull(person.getSocialSecurityNumber());
        Assert.assertNull(person.getAddress());

        person.setName("TestName");
        person.setSocialSecurityNumber(new SocialSecurityNumber(12345678901L));
        person.setAddress(new Address());

        Assert.assertEquals("TestName", person.getName());
        Assert.assertEquals(12345678901L, person.getSocialSecurityNumber().getNumber().longValue());
        Assert.assertNotNull(person.getAddress());
    }
}
