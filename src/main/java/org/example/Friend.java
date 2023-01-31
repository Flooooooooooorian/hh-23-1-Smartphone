package org.example;

public class Friend extends Contact{
    String mobile;

    @Override
    public String toString() {
        return "Friend{" + getName() +
                " mobile='" + mobile + '\'' +
                "} ";
    }


    public Friend(String name, String mobile) {
        super(name);
        this.mobile = mobile;
    }

    @Override
    String getName() {
        return name;
    }
}
