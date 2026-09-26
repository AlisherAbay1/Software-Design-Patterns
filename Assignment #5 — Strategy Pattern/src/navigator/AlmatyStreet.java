package navigator;

public enum AlmatyStreet {
    ABAY_AVENUE("Abay Avenue", 7),
    AL_FARABI_AVENUE("Al-Farabi Avenue", 3),
    DOSTYK_AVENUE("Dostyk Avenue", 9),
    FURMANOVA_STREET("Furmanov Street", 1),
    GOGOLYA_STREET("Gogol Street", 5),
    KABANBAY_BATYR_STREET("Kabanbay Batyr Street", 10),
    KUNAEVA_STREET("Kunaev Street", 4),
    MAKATAEVA_STREET("Makataev Street", 8),
    NAZARBAYEV_AVENUE("Nazarbayev Avenue", 2),
    RASKOVOY_STREET("Raskova Street", 6),
    SATPAYEVA_STREET("Satpayev Street", 9),
    SEIFULLINA_AVENUE("Seifullin Avenue", 3),
    TOLE_BI_STREET("Tole Bi Street", 7),
    ZHIBEK_ZHOLY_STREET("Zhibek Zholy Street", 1),
    ZHELTOKSAN_STREET("Zheltoksan Street", 5),
    BOGENBAY_BATYR_STREET("Bogenbay Batyr Street", 10),
    BAYZAKOVA_STREET("Bayzakov Street", 2),
    ROZYBAKIEVA_STREET("Rozybakiev Street", 6),
    NAURYZBAY_BATYR_STREET("Nauryzbay Batyr Street", 4),
    ZHANDOSOVA_STREET("Zhandosov Street", 8);

    private final String displayName;
    private final int distanceFactor;

    AlmatyStreet(String displayName, int distanceFactor) {
        this.displayName = displayName;
        this.distanceFactor = distanceFactor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getDistanceFactor() {
        return distanceFactor;
    }
}