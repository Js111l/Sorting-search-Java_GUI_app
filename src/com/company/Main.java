package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.*;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        App app = new App();
    }
}


class App extends JFrame implements ActionListener {

    JButton generate;
    JTextArea field;
    JTextField arrayLength;
    JTextField min;
    JTextField max;
    JLabel labelMin;
    JLabel labelMax;
    JLabel labelArrayLength;
    JLabel sorting;
    JLabel bubblesort;
    JTextArea bubblesortArea;
    JLabel selectionsort;
    JTextArea selectionsortArea;
    JLabel quicksort;
    JTextArea quicksortArea;
    JLabel mergesort;
    JTextArea mergesortArea;
    JLabel bubblesortTime;
    JLabel quicksortTime;
    JLabel selectionsortTime;
    JLabel mergesortTime;
    JButton sortUsingBubblesort;
    JButton sortUsingSelectionsort;
    JButton sortUsingQuicksort;
    JButton sortUsingMergesort;


    JLabel searching;
    JButton search;
    JTextArea seacrhedNumber;
    JTextArea indexInArray;
    JComboBox<String> chooseMethodOfSorting;
    int setSearchMethod;

    int[] array;
    int[] arr1={-1};
    int[] arr2={-1};
    int[] arr3={-1};
    int[] arr4={-1};


    App() {
        generate = new JButton();
        generate.setText("Generate");
        generate.setBounds(450, 30, 100, 30);
        generate.setFocusable(true);
        generate.addActionListener(this);


        field = new JTextArea();
        field.setEditable(false);
        field.setBounds(290, 30, 150, 30);


        min = new JTextField();
        min.setBounds(40, 30, 40, 20);
        min.setEditable(true);

        labelMin = new JLabel();
        labelMin.setBounds(10, 32, 30, 15);
        labelMin.setText("Min: ");
        labelMin.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(labelMin);

        max = new JTextField();
        max.setBounds(120, 30, 40, 20);
        max.setEditable(true);

        labelMax = new JLabel();
        labelMax.setBounds(90, 32, 30, 15);
        labelMax.setText("Max: ");
        labelMax.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(labelMax);

        arrayLength = new JTextField();
        arrayLength.setBounds(220, 30, 40, 20);
        arrayLength.setEditable(true);

        labelArrayLength = new JLabel();
        labelArrayLength.setBounds(170, 32, 50, 15);
        labelArrayLength.setText("Length: ");
        labelArrayLength.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(labelArrayLength);


        sorting = new JLabel();
        sorting.setBounds(40, 100, 150, 60);
        sorting.setText("Sorting: ");
        sorting.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(sorting);

        bubblesort = new JLabel();
        bubblesort.setBounds(50, 130, 90, 60);
        bubblesort.setText("bubblesort: ");
        bubblesort.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(bubblesort);

        bubblesortArea = new JTextArea();
        bubblesortArea.setBounds(200, 145, 200, 30);
        bubblesortArea.setEditable(false);
        this.add(bubblesortArea);

        bubblesortTime = new JLabel();
        bubblesortTime.setBounds(480, 145, 120, 30);
        bubblesortTime.setText("Time(ns): ");
        this.add(bubblesortTime);

        sortUsingBubblesort = new JButton();
        sortUsingBubblesort.setBounds(415, 145, 60, 30);
        sortUsingBubblesort.setText("Sort");
        sortUsingBubblesort.setFont(new Font("Arial", Font.BOLD, 8));
        sortUsingBubblesort.addActionListener(this);
        this.add(sortUsingBubblesort);


        selectionsort = new JLabel();
        selectionsort.setBounds(50, 185, 150, 60);
        selectionsort.setText("selectionsort: ");
        selectionsort.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(selectionsort);

        selectionsortArea = new JTextArea();
        selectionsortArea.setBounds(200, 200, 200, 30);
        selectionsortArea.setEditable(false);
        this.add(selectionsortArea);

        selectionsortTime = new JLabel();
        selectionsortTime.setBounds(480, 200, 120, 30);
        selectionsortTime.setText("Time(ns): ");
        this.add(selectionsortTime);

        sortUsingSelectionsort = new JButton();
        sortUsingSelectionsort.setText("Sort");
        sortUsingSelectionsort.setBounds(415, 200, 60, 30);
        sortUsingSelectionsort.setBounds(415, 200, 60, 30);
        sortUsingSelectionsort.setFont(new Font("Arial", Font.BOLD, 8));
        sortUsingSelectionsort.addActionListener(this);
        this.add(sortUsingSelectionsort);


        quicksort = new JLabel();
        quicksort.setBounds(50, 240, 150, 60);
        quicksort.setText("quicksort: ");
        quicksort.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(quicksort);

        quicksortArea = new JTextArea();
        quicksortArea.setBounds(200, 255, 200, 30);
        quicksortArea.setEditable(false);
        this.add(quicksortArea);

        quicksortTime = new JLabel();
        quicksortTime.setBounds(480, 255, 120, 30);
        quicksortTime.setText("Time(ns): ");
        this.add(quicksortTime);


        sortUsingQuicksort = new JButton();
        sortUsingQuicksort.setBounds(415, 255, 60, 30);
        sortUsingQuicksort.setText("Sort");
        sortUsingQuicksort.setFont(new Font("Arial", Font.BOLD, 8));
        sortUsingQuicksort.addActionListener(this);
        this.add(sortUsingQuicksort);


        mergesort = new JLabel();
        mergesort.setBounds(50, 295, 150, 60);
        mergesort.setText("mergesort: ");
        mergesort.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(mergesort);

        mergesortArea = new JTextArea();
        mergesortArea.setBounds(200, 310, 200, 30);
        mergesortArea.setEditable(false);
        this.add(mergesortArea);

        mergesortTime = new JLabel();
        mergesortTime.setBounds(480, 310, 120, 30);
        mergesortTime.setText("Time(ns): ");
        this.add(mergesortTime);


        sortUsingMergesort = new JButton();
        sortUsingMergesort.setBounds(415, 310, 60, 30);
        sortUsingMergesort.setText("Sort");
        sortUsingMergesort.setFont(new Font("Arial", Font.BOLD, 8));
        sortUsingMergesort.addActionListener(this);
        this.add(sortUsingMergesort);


        searching = new JLabel();
        searching.setBounds(40, 400, 200, 60);
        searching.setFont(new Font("Arial", Font.BOLD, 20));
        searching.setText("Searching: ");

        search = new JButton();
        search.setBounds(40, 470, 80, 30);
        search.setText("Search");
        search.addActionListener(this);

        seacrhedNumber = new JTextArea();
        seacrhedNumber.setBounds(180, 470, 70, 30);

        indexInArray = new JTextArea();
        indexInArray.setBounds(300, 470, 70, 30);
        indexInArray.setEditable(false);

        JLabel label = new JLabel();
        label.setText("Index in array: ");
        label.setBounds(280, 440, 90, 30);
        this.add(label);

        JLabel label1 = new JLabel();
        label1.setText("Search for a number: ");
        label1.setBounds(140, 440, 130, 30);
        this.add(label1);


        chooseMethodOfSorting = new JComboBox<String>();
        chooseMethodOfSorting.setBounds(400, 470, 150, 30);
        JButton BinarySearch = new JButton();


        BinarySearch.setText("BinarySearch");
        chooseMethodOfSorting.addItem("BinarySearch");
        chooseMethodOfSorting.addItem("InterpolationSearch");
        chooseMethodOfSorting.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (chooseMethodOfSorting.getSelectedItem().toString().equals("BinarySearch")) {
                    setSearchMethod = 0;
                }
            }
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (chooseMethodOfSorting.getSelectedItem().toString().equals("InterpolationSearch")) {
                    setSearchMethod = 1;
                }
            }
        });


        this.add(chooseMethodOfSorting);
        this.add(indexInArray);
        this.add(seacrhedNumber);
        this.add(search);
        this.add(searching);
        this.add(generate);

        this.add(arrayLength);
        this.add(max);
        this.add(min);
        this.getContentPane().setBackground(Color.lightGray);
        this.setSize(650, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.add(field);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == generate) {

                if (arrayLength.getText().isEmpty() || max.getText().isEmpty() || min.getText().isEmpty()) {
                    throw new Exception();
                }

                array = new int[Integer.parseInt(arrayLength.getText())];

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < Integer.parseInt(arrayLength.getText()); i++) {
                    array[i] = (int) Math.floor((Math.random() * (Integer.parseInt(max.getText()) -
                            Integer.parseInt(min.getText()) + 1) + Integer.parseInt(min.getText())));
                }


                for (int j : array) {
                    sb.append(j);
                }

                indexInArray.setText("");
                field.setText(sb.toString());

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please, insert required data", "error", JOptionPane.ERROR_MESSAGE);

        }

        try {
            if (e.getSource() == sortUsingBubblesort) {
                if (arrayLength.getText().isEmpty() || max.getText().isEmpty() || min.getText().isEmpty()) {
                    throw new Exception();
                }

                arr1 = array;
                long start = System.nanoTime();

                for (int i = 0; i < arr1.length; i++) {
                    for (int j = i + 1; j < arr1.length; j++) {
                        if (arr1[i] > arr1[j]) {
                            int temp = arr1[j];
                            arr1[j] = arr1[i];
                            arr1[i] = temp;
                        }
                    }
                }
                long time = (System.nanoTime() - start);

                StringBuilder sb = new StringBuilder();

                for (int j : arr1) {
                    sb.append(j);
                }

                bubblesortArea.setText(sb.toString());
                bubblesortTime.setText("Time(ns): " + time);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"You need to generate data first in order to sort it.","Warning",JOptionPane.ERROR_MESSAGE);
        }
        try {
            if (e.getSource() == sortUsingSelectionsort) {
                if (arrayLength.getText().isEmpty() || max.getText().isEmpty() || min.getText().isEmpty()) {
                    throw new Exception();
                }
                arr2 = array;

                long start = System.nanoTime();

                for (int i = 0; i < arr2.length; i++) {
                    int min = i;
                    for (int j = i + 1; j < arr2.length; j++) {
                        if (arr2[min] > arr2[j]) {
                            min = j;
                        }
                    }
                    int temp = arr2[min];
                    arr2[min] = arr2[i];
                    arr2[i] = temp;
                }

                long time = (System.nanoTime() - start);

                StringBuilder sb = new StringBuilder();

                for (int j : arr2) {
                    sb.append(j);
                }

                selectionsortArea.setText(sb.toString());
                selectionsortTime.setText("Time(ns): " + time);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"You need to generate data first in order to sort it.","Warning",JOptionPane.ERROR_MESSAGE);
        }
        try {
            if (e.getSource() == sortUsingQuicksort) {
                if (arrayLength.getText().isEmpty() || max.getText().isEmpty() || min.getText().isEmpty()) {
                    throw new Exception();
                }
                arr3 = array;
                long start = System.nanoTime();


                QuickSort.quickSort(arr3, 0, Integer.parseInt(arrayLength.getText()) - 1);
                long time = (System.nanoTime() - start);

                StringBuilder sb = new StringBuilder();
                for (int j : arr3) {
                    sb.append(j);
                }

                quicksortArea.setText(sb.toString());
                quicksortTime.setText("Time(ns): " + time);


            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"You need to generate data first in order to sort it.","Warning",JOptionPane.ERROR_MESSAGE);
        }
        try {
            if (e.getSource() == sortUsingMergesort) {
                if (arrayLength.getText().isEmpty() || max.getText().isEmpty() || min.getText().isEmpty()) {
                    throw new Exception();
                }
                arr4 = array;
                long start = System.nanoTime();

                MergeSort.mergeSort(arr4, 0, arr4.length - 1);


                long time = (System.nanoTime() - start);

                StringBuilder sb = new StringBuilder();

                for (int j : arr4) {
                    sb.append(j);
                }
                mergesortArea.setText(sb.toString());
                mergesortTime.setText("Time(ns): " + time);
            }
        } catch (Exception ex) {
JOptionPane.showMessageDialog(null,"You need to generate data first in order to sort it.","Warning",JOptionPane.ERROR_MESSAGE);        }

        int [][] sortedArrays={arr1,arr2,arr3,arr4};

        List<int []>arrayForSearch=new ArrayList<>();

        int counter=-1;

        for (int [] array:sortedArrays
             ) {
            if(array.length>1){
                arrayForSearch.add(array);
                counter++;
            }
        }




        try {
            if (e.getSource() == search) {

                if (counter == -1) {
                    throw new Exception();
                }
                try {
                        if(seacrhedNumber.getText().isEmpty()){
                            throw new Exception();
                        }

                    int[] methods = {BinarySearch.binarySearch(arrayForSearch.get(0), 0,
                            array.length - 1, Integer.parseInt(seacrhedNumber.getText())),
                            BinarySearch.interpolationSearch(arrayForSearch.get(0),
                                    0, array.length - 1, Integer.parseInt(seacrhedNumber.getText()))};

                    indexInArray.setText(String.valueOf(methods[setSearchMethod]));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Please, insert the number you want to search","Warning",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "BinarySearch and InterpolationSearch works only on sorted arrays!");
        }
    }
}

class BinarySearch {

    static int binarySearch(int[] array, int low, int high, int k) {

        if (high >= low) {
            int mid = low + ((high - low) / 2);
            if (k == array[mid])
                return mid;
            if (k < array[mid])
                return binarySearch(array, low, mid - 1, k);
            else
                return binarySearch(array, mid + 1, high, k);
        }
        return -1;
    }

    static int interpolationSearch(int[] arr, int low, int high, int k) {

        if (arr[low] <= k && k <= arr[high] && low <= high) {
            int pos = low + (
                    ((k - arr[low]) * (high - low)) / (arr[high] - arr[low])
            );
            if (k == arr[pos])
                return pos;
            if (k < arr[pos])
                return interpolationSearch(arr, low, pos - 1, k);
            else
                return interpolationSearch(arr, pos + 1, high, k);
        }
        return -1;
    }

}





class QuickSort {

    static void quickSort(int[] nums, int low, int high) {

        if (nums.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int i = low;
        int j = high;
        int pivot = nums[low + (high - low) / 2];

        while (i <= j) {
            while (nums[i] < pivot) {
                i++;
            }
            while (pivot < nums[j]) {
                j--;
            }
            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(nums, low, j);
        }
        if (high > i) {
            quickSort(nums, i, high);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


class MergeSort {

    static void mergeSort(int[] array, int low, int high) {

        if (high <= low) {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i + low];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[i + mid + 1];
        }

        int i = 0;
        int j = 0;
        int index = low;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[index] = leftArray[i];
                index++;
                i++;
            } else {
                array[index] = rightArray[j];
                j++;
                index++;
            }

        }
        while (i < leftArray.length) {
            array[index] = leftArray[i];
            i++;
            index++;
        }
        while (j < rightArray.length) {
            array[index] = rightArray[j];
            j++;
            index++;
        }

    }
}



