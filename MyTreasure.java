public class MyTreasure {
    private String name;
    private String local;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if(local == null || local.isEmpty()) {
            throw new IllegalArgumentException("location shouldnot be empty.");
        }
        this.local = local;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String toString() {
     return "name: " + getName() + "location -"  + getLocal(); 
    }
}
