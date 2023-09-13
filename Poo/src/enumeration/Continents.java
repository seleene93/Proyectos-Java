
package enumeration;

public enum Continents {
    AFRICA(54),
    EUROPA(50),
    ASIA(48),
    AMERICA(35),
    OCEANIA(14);
    
    private final int countries;
    
    private Continents(int countries) {
        this.countries = countries;
    }
    
    public int getCountries() {
        return this.countries;
    }
}
