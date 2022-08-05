public class player {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public player(String name, String country, String role, double price_in_crores) {
        this.name = name;
        this.country = country;
        this.role = role;
        this.price_in_crores = price_in_crores;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getPrice_in_crores() {
        return price_in_crores;
    }

    public void setPrice_in_crores(double price_in_crores) {
        this.price_in_crores = price_in_crores;
    }

    String name;
    String country;

    @Override
    public String toString() {
        return "player{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", role='" + role + '\'' +
                ", price_in_crores=" + price_in_crores +
                '}';
    }

    String role;
    double price_in_crores;
}
