import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room() {
        room = new ArrayList<>();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person tempPerson = this.room.get(0);
        for (Person person : room) {
            if (person.getHeight() < tempPerson.getHeight()) {
                tempPerson = person;
            }
        }
        return tempPerson;
    }

    public Person take() {
        if (room.isEmpty()) {
            return null;
        }
        Person tempPerson = this.room.get(0);
        for (Person person : room) {
            if (person.getHeight() < tempPerson.getHeight()) {
                tempPerson = person;
            }
        }
        this.room.remove(tempPerson);
        return tempPerson;

    }
}
