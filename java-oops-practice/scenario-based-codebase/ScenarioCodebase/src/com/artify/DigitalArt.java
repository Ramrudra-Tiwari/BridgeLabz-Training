package com.artify;

// Digital artwork type
public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price,
                      String licenseType, boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    // Purchase logic
    @Override
    public void purchase(User user) {
        if (user.deductBalance(price)) {
            System.out.println("🎨 Digital art purchased: " + title);
        }
    }

    // Polymorphism: digital license rules
    @Override
    public void license(User user) {
        System.out.println("📜 Digital license granted: " + getLicenseType());
    }
}
