package core.event;

import core.people.HumanInterface;

public interface EventDoItInterface {
    public void setWho(HumanInterface who);

    public HumanInterface getWho();

    public void setName(ActionType act);

    public String getName();

    public void Do(String act);

    public void do_it();

    public void do_not_it();
}
