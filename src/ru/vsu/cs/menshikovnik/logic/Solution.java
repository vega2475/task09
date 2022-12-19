package ru.vsu.cs.menshikovnik.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> arithmeticProgression(ArrayList<Integer> list) {
        boolean found = false;
        ArrayList<Integer> copyList = new ArrayList<>(list);
        Collections.sort(copyList);
        int d = copyList.get(1) - copyList.get(0);
        for (int i = 0;i < copyList.size();i++){
            if (i == copyList.size() - 1) break;
            if (copyList.get(i + 1) - copyList.get(i) == d){
                found = true;
            }
            else return list;
        }
        if (found){
            return copyList;
        }
        return null;
    }
    }