package com.artify;

// Parent class for all artworks
public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;

    private String licenseType; // licensing terms hidden
    protected boolean hasPreview;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this(title, artist, price, licenseType, false);
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price,
                   String licenseType, boolean hasPreview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    protected String getLicenseType() {
        return licenseType;
    }

    public String getTitle() {
        return title;
    }
}
