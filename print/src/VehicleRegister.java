import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {
    public HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return null;
        }
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Set<String> ownerSet = new HashSet<>(owners.values());

        for (String owner : ownerSet) {
            System.out.println(owner);
        }
    }
}
