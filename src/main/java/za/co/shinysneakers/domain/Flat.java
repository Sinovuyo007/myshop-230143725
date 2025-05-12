package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;

@Entity
public class Flat extends Address{
    private short unitNumber;
    private String flatName;

    protected Flat(){super();}
  
    protected Flat(Builder builder){
        this.addressID = builder.addressID;
        this.unitNumber = builder.unitNumber;
        this.flatName = builder.flatName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
    }
    public short getUnitNumber() {
        return unitNumber;
    }

    public String getflatName() {
        return flatName;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "unitNumber=" + unitNumber +
                ", flatName='" + flatName + '\'' +
                '}';
    }
    public static class Builder {
        private short unitNumber;
        private String flatName;
        private long addressID;
        private short streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String province;
        private short postalCode;

        private Builder addressID(long addressID){
            this.addressID = addressID;
            return this;
        }
        public Builder setUnitNumber(short unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder setFlatName(String flatName) {
            this.flatName = flatName;
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

        public Builder copy(Flat flat) {
            this.unitNumber = flat.unitNumber;
            this.flatName = flat.flatName;
            this.streetNumber = flat.streetNumber;
            this.streetName = flat.streetName;
            this.suburb = flat.suburb;
            this.city = flat.city;
            this.province = flat.province;
            this.postalCode = flat.postalCode;
            return this;
        }
        public Flat build() {return  new Flat(this);}
    }
}
