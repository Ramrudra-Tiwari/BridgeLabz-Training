package com.artify;

// Printed artwork type
public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price,
                    String licenseType, boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    @Override
    public void purchase(User user) {
        if (user.deductBalance(price + 100)) { // print & shipping charge
            System.out.println("🖼️ Print art purchased: " + title);
        }
    }

    // Polymorphism: print license rules
    @Override
    public void license(User user) {
        System.out.println("📜 Print usage license issued (single display)");
    }
}
