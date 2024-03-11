package UF4.Vehicles;

import Toolkit.UsersUtil;

import java.util.List;

public class ManageModels {
    private static int lastId = 0;

    public static Model getById(int id, List<Model> sucursales) {
        Model selected = null;
        for (Model sucursal : sucursales) {
            if (sucursal.getId() == id)
                selected = sucursal;
        }
        return selected;
    }

    public static void create(List<Model> models) {
        String brandName = UsersUtil.getStringFromUser("Enter the brand", "Just letters");
        String colour = UsersUtil.getStringFromUser("Enter the colour", "Enter just text");
        int km = UsersUtil.getIntFromUser("Enter km", "Enter just numbers");

        lastId++;
        models.add(new Model(lastId, brandName, colour, km));
    }

    public static void update(List<Model> models) {

    }

    public static void read(List<Model> models) {

    }

    public static void delete(List<Model> models) {

    }
}
