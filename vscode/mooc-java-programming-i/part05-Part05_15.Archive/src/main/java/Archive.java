public class Archive {
    private String name;
    private String id;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Archive)) {
            return false;
        }

        Archive comparedObj = (Archive) obj;

        if (this.id.equals(comparedObj.id)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }
}
