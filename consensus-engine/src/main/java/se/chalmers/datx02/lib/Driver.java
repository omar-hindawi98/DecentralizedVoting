package se.chalmers.datx02.lib;

public interface Driver {

    void Driver(Engine engine);

    void start(String endpoint);

    void stop();
}