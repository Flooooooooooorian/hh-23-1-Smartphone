package org.example;

import java.util.Objects;

public class Friend extends Contact{
    String mobile;

    public Friend() {
        super();
    }

    public Friend(String name, String mobile) {
        super(name);
        this.mobile = mobile;
    }

    @Override
    String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend friend)) return false;
        if (!super.equals(o)) return false;

        return Objects.equals(mobile, friend.mobile);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                "} ";
    }
}
