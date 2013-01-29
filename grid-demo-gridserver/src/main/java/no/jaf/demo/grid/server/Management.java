package no.jaf.demo.grid.server;

import java.util.Collection;
import com.hazelcast.config.Config;
import com.hazelcast.core.*;

public class Management implements InstanceListener {
    public static void main(String[] args) {
        Management sample = new Management();

        Config cfg = new Config();
        HazelcastInstance hz = Hazelcast.newHazelcastInstance(cfg);
        hz.addInstanceListener(sample);

        Collection<Instance> instances = hz.getInstances();
        for (Instance instance : instances) {
            System.out.println(instance.getInstanceType() + "," + instance.getId());
        }
    }

    public void instanceCreated(InstanceEvent event) {
        Instance instance = event.getInstance();
        System.out.println("Created " + instance.getInstanceType() + "," + instance.getId());
    }

    public void instanceDestroyed(InstanceEvent event) {
        Instance instance = event.getInstance();
        System.out.println("Destroyed " + instance.getInstanceType() + "," + instance.getId());
    }
}