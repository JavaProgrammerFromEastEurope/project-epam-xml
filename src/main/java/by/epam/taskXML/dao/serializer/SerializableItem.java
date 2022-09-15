package by.epam.taskXML.dao.serializer;

import by.epam.taskXML.dao.Item;
import by.epam.taskXML.entity.GemCollection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

@SuppressWarnings("unchecked")
public class SerializableItem implements Item {
    private static final String PATH = "gems/gems.bin";
    @Override
    public List<GemCollection> get() {
        try (InputStream stream = getClass().getResourceAsStream(format("/%s", PATH))) {
            var ios = new ObjectInputStream(stream);
            return (List<GemCollection>) ios.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void save(List<GemCollection> gemCollections) {
        try {
            var classLoader = getClass().getClassLoader();
            var file = new File(Objects.requireNonNull(classLoader.getResource(PATH)).getFile());
            var oos  = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(gemCollections);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
