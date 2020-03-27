package hw12.dao;

import hw12.human.Family;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FamilyDao implements DAO<Family> {

    List<Family> families = new LinkedList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (families.isEmpty()) return null;
        else return families.get(index);
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public boolean deleteFamily(int index) {
        return families.remove(families.get(index));
    }

    @Override
    public void saveFamily(Family family) {
        if (!families.contains(family)) families.add(family);
    }


}
