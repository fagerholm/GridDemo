package no.jaf.demo.grid.server;

import com.hazelcast.core.Hazelcast;
import no.jaf.demo.grid.domain.Person;

import java.util.Map;

public class HazelcastGridServer {

    public static void main(String[] args) {

        Map<Long, Person> mapPersons = Hazelcast.getMap("persons");
    }
}
