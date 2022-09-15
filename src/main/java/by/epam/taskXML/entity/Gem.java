package by.epam.taskXML.entity;

import by.epam.taskXML.application.util.Preciousness;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public abstract class Gem implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private Preciousness preciousness;

    public Gem(){}

    public Gem(String name, Preciousness preciousness) {
        this.name = name;
        this.preciousness = preciousness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreciousness(Preciousness preciousness) {
        this.preciousness = preciousness;
    }

    public String getName() {
        return name;
    }

    public Preciousness getPreciousness() {
        return preciousness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gem gems = (Gem) o;
        return Objects.equals(name, gems.name)
                    && preciousness == gems.preciousness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, preciousness);
    }

    @Override
    public String toString() {
        return "Gems{name='%s', preciousness=%s}".formatted(name, preciousness);
    }
}
