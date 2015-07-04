package com.mypet.rayeldatu.mypet;

import java.util.UUID;

public class Pet {

    //Fields
    private UUID mId;
    private String mPetName;
    private String mPetType;

    //Constants
    private final String[] mPetCategories = new String[]{"Cat", "Dog", "Bird"};

    // End of Declaration

    public Pet() {
        mId = UUID.randomUUID();
    }

    // Getter and Setter Methods
    public String getPetType() {
        return mPetType;
    }

    public void setPetType(int type) {
        mPetType = mPetCategories[type];
    }

    public String getPetName() {
        return mPetName;
    }

    public void setPetName(String petName) {
        mPetName = petName;
    }
}
