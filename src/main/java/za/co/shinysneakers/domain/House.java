package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;

@Entity
public class House extends Address {
    private int erfNumber;

    protected House(){super();}

    protected House(Builder builder){
        this.erfNumber = builder.erfNumber;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
    }
    public int getErfNumber() {
        return erfNumber;
    }
    public static class Builder {
        private long addressID;
        private int erfNumber;
        private short streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String province;
        private short postalCode;

        public Builder addressID(long addressID){
            this.addressID = addressID;
            return this;
        }

        public Builder setErfNumber(int erfNumber) {
            this.erfNumber = erfNumber;
            return this;
        }

        public Builder setStreetNumber(short streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(House house) {
            this.addressID = house.addressID;
            this.streetNumber = house.streetNumber;
            this.erfNumber = house.erfNumber;
            this.streetName = house.streetName;
            this.suburb = house.suburb;
            this.city = house.city;
            this.province = house.province;
            this.postalCode = house.postalCode;
            return this;
        }
        public House build() {return new House(this);}
    }
}
