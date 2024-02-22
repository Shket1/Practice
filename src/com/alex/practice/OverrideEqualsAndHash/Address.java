package com.alex.practice.OverrideEqualsAndHash;

import java.util.Arrays;

public class Address {
    public String city;
    public String street;
    public int houseNumber;
    public String extraInfo;
    public String[] residents;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (houseNumber != address.houseNumber) return false;
        if (!city.equals(address.city)) return false;
        if (!street.equals(address.street)) return false;
        if (!extraInfo.equals(address.extraInfo)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(residents, address.residents);
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + houseNumber;
        result = 31 * result + (extraInfo != null ? extraInfo.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(residents);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", extraInfo='" + extraInfo + '\'' +
                ", residents=" + Arrays.toString(residents) +
                '}';
    }
}
