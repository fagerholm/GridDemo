package no.jaf.demo.grid.domain;

import junit.framework.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testGetSet() {

        Address address = new Address();
        Assert.assertNotNull(address);
        Assert.assertNull(address.getCity());
        Assert.assertNull(address.getStreetNumber());
        Assert.assertNull(address.getStreetAddress());
        Assert.assertNull(address.getPostalCode());

        address.setStreetNumber("12A");
        address.setStreetAddress("TestStreet");
        address.setPostalCode("1234");
        address.setCity("TestCity");

        Assert.assertEquals("TestStreet", address.getStreetAddress());
        Assert.assertEquals("TestCity", address.getCity());
        Assert.assertEquals("1234", address.getPostalCode());
        Assert.assertEquals("12A", address.getStreetNumber());


    }
}
