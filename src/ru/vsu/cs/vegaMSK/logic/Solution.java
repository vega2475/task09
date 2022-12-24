package ru.vsu.cs.vegaMSK.logic;

import java.util.ArrayList;
import java.util.List;

//4 пп
public class Solution {
    public static ArrayList<Integer> sol(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {//проверка на пустоту листа
            System.out.println("empty array");
            return null;
        }
        int maxSumStartIndex = 0;
        int maxSumLastIndex = 0;
        int maxSum = list.get(0);

        int lastSumStartIndex = 0;
        int lastSum = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            lastSum += list.get(i);

            if (lastSum == list.get(i)) {//доп условие
                lastSumStartIndex = i;
            }

            if (lastSum < list.get(i)) {
                lastSum = list.get(i);
                lastSumStartIndex = i;
            }

            if (maxSum < lastSum) {
                maxSumStartIndex = lastSumStartIndex;
                maxSumLastIndex = i;
                maxSum = lastSum;
            }

            if (lastSum == maxSum) {
                if (i - lastSumStartIndex < maxSumLastIndex - maxSumStartIndex) {
                    maxSumStartIndex = lastSumStartIndex;
                    maxSumLastIndex = i;
                }
            }

        }
        System.out.println("sum( arr[" + maxSumStartIndex + "] .. arr[" + maxSumLastIndex + "] ) = " + maxSum);
        ArrayList<Integer> listCopy = new ArrayList<>();
        for (int i = maxSumStartIndex; i <= maxSumLastIndex; i++) {
            listCopy.add(list.get(i));
            System.out.print(list.get(i) + " ");
        }
        return listCopy;
    }
}