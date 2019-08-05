package mservice.strategy;

public interface ActivityStrategy {

    ActivityStrategy build();

    boolean check();
}
