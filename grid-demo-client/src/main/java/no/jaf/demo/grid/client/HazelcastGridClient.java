package no.jaf.demo.grid.client;

import com.hazelcast.client.ClientConfig;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import no.jaf.demo.grid.domain.Person;
import no.jaf.demo.grid.domain.SocialSecurityNumber;

public class HazelcastGridClient {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.addAddress("127.0.0.1:5701");
        HazelcastInstance client = com.hazelcast.client.HazelcastClient.newHazelcastClient(clientConfig);
        IMap map = client.getMap("persons");
        System.out.println("Map Size:" + map.size());

        Person person1 = new Person();
        person1.setName("Per");
        person1.setSocialSecurityNumber(new SocialSecurityNumber(33345678901L));
        Person person2 = new Person();
        person2.setName("Pål");
        person2.setSocialSecurityNumber(new SocialSecurityNumber(44445678901L));
        Person person3 = new Person();
        person3.setName("Espen");
        person3.setSocialSecurityNumber(new SocialSecurityNumber(55545678901L));

        map.put(System.currentTimeMillis(), person1);
        map.put(System.currentTimeMillis(), person2);
        map.put(System.currentTimeMillis(), person3);

        System.out.println("Map Size:" + map.size());
    }
}
