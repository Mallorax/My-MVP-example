package pl.mallorax.mvp_test;

// PlaceHolder class used to fill RecyclerView with objects

public class PlaceHolder {
    private String name;
    private int imageResource;

    public PlaceHolder(int imageResource, String name) {
        this.imageResource = imageResource;
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
