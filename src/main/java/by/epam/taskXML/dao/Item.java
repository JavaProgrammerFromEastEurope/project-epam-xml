package by.epam.taskXML.dao;

import by.epam.taskXML.application.exception.NotFoundItemException;
import by.epam.taskXML.entity.GemCollection;

import java.util.List;

public interface Item {

    List<GemCollection> get();

    default void add(GemCollection newGem) {
        List<GemCollection> gems = get();
        for (GemCollection gem : gems) {
            if (gem.getId() == newGem.getId()) {
                newGem.setId(
                        gems.get(
                            gems.size() - 1)
                               .getId() + 1);
            }
        }
        gems.add(newGem);
        save(gems);
    }

    default void update(GemCollection newGem) throws NotFoundItemException {
        List<GemCollection> gems = get();
        var index = 0;
        for (GemCollection gem : gems) {
            if (gem.getId() == newGem.getId()) {
                gems.set(index, newGem);
                save(gems);
                return;
            }
            index++;
        }
        throw new NotFoundItemException(newGem.getId());
    }

    default void remove(long id) throws NotFoundItemException {
        List<GemCollection> gems = get();
        for (GemCollection gem : gems) {
            if(gem.getId() == id) {
                gems.remove(gem);
                save(gems);
                return;
            }
        }
        throw new NotFoundItemException(id);
    }

    void save(List<GemCollection> gemCollections);
}
