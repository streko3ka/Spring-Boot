package ru.netology.springboot.classes;

import ru.netology.springboot.interfaces.SystemProfile;
public class DevProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
