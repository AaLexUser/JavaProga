package core.people;

import core.Status;
import core.event.EventDoItInterface;

public interface HumanInterface {
    public void setName(String name);

    public String getName();

    public void describe();

    public void setStatus(Status status);

    public Status getStatus();

    public void run(EventDoItInterface act, boolean i);
}
