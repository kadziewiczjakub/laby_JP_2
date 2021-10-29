package com.company;

import java.util.*;

public class Collections{
    static HashSet<Person> hashSet=new HashSet<>();
    static TreeSet<Person> treeSet=new TreeSet<>(new TreeSetComparator());
    static ArrayList<Person> arrayList=new ArrayList<>();
    static LinkedList<Person> linkedList=new LinkedList<>();
    static HashMap<Integer,Person> hashMap=new HashMap<>();
    static TreeMap<Integer,Person> treeMap=new TreeMap<>();

    static class TreeSetComparator implements Comparator<Person>
    {
        @Override
        public int compare(Person p1, Person p2){
            return 0;
        }
    }

    public static void addElementToALlCollections()
    {
        Person person=new Person();
        addArrayListElement(person);
        addLinkedListElement(person);
        addHashSetElement(person);
        addTreeSetElement(person);
        addHashMapElement(person);
        addTreeMapElement(person);
    }

    public static void addTwoElementsToAllCollections()
    {
        Person person=new Person();
        addArrayListElement(person);
        addLinkedListElement(person);
        addHashSetElement(person);
        addTreeSetElement(person);
        addHashMapElement(person);
        addTreeMapElement(person);
        addArrayListElement(person);
        addLinkedListElement(person);
        addHashSetElement(person);
        addTreeSetElement(person);
        addHashMapElement(person);
        addTreeMapElement(person);
    }

    public static void removeElementFromAllCollections(Person person)
    {
        removeArrayListElement(person);
        removeLinkedListElement(person);
        removeHashSetElement(person);
        removeTreeSetElement(person);
        removeHashMapElement(Integer.valueOf(person.hashCode()));
        removeTreeMapElement(Integer.valueOf(person.hashCode()));
    }

    public static void displayAllCollections()
    {
        System.out.println("\nArray List\n");
        displayArrayList();
        System.out.println("\nLinked List\n");
        displayLinkedList();
        System.out.println("\nHash Set\n");
        displayHashSet();
        System.out.println("\nTree Set\n");
        displayTreeSet();
        System.out.println("\nHash Map\n");
        displayHashMap();
        System.out.println("\nTree Map\n");
        displayTreeMap();
    }

    public static void addArrayListElement(Person person)
    {
        arrayList.add(person);
    }

    public static void removeArrayListElement(Person person)
    {
        arrayList.remove(person);
    }

    public static void displayArrayList()
    {
        for (Person person:arrayList)
        {
            System.out.println(String.format("/ %15s / %15s / %3d / %8s /", person.getName(), person.getSurname(), person.getAge(), person.getJob()));
        }
    }

    public static void addLinkedListElement(Person person)
    {
        linkedList.add(person);
    }

    public static void removeLinkedListElement(Person person)
    {
        linkedList.remove(person);
    }

    public static void displayLinkedList()
    {
        for (Person person:linkedList)
        {
            System.out.println(String.format("/ %15s / %15s / %3d / %8s /", person.getName(), person.getSurname(), person.getAge(), person.getJob()));
        }
    }

    public static void addHashSetElement(Person person)
    {
        hashSet.add(person);
    }

    public static void removeHashSetElement(Person person)
    {
        hashSet.remove(person);
    }

    public static void displayHashSet()
    {
        for (Person person:hashSet)
        {
            System.out.println(String.format("/ %15s / %15s / %3d / %8s /", person.getName(), person.getSurname(), person.getAge(), person.getJob()));
        }
    }

    public static void addTreeSetElement(Person person)
    {
        treeSet.add(person);
    }

    public static void removeTreeSetElement(Person person)
    {
        treeSet.remove(person);
    }

    public static void displayTreeSet()
    {
        for (Person person:treeSet)
        {
            System.out.println(String.format("/ %15s / %15s / %3d / %8s /", person.getName(), person.getSurname(), person.getAge(), person.getJob()));
        }
    }

    public static void addHashMapElement(Person person)
    {
        hashMap.put(Integer.valueOf(person.hashCode()),person);
    }

    public static void removeHashMapElement(Integer key)
    {
        hashMap.remove(key);
    }

    public static void displayHashMap()
    {
        for (Person person:hashMap.values())
        {
            System.out.println(String.format("/ %15s / %15s / %3d / %8s /", person.getName(), person.getSurname(), person.getAge(), person.getJob()));
        }
    }

    public static void addTreeMapElement(Person person)
    {
        treeMap.put(Integer.valueOf(person.hashCode()),person);
    }

    public static void removeTreeMapElement(Integer key)
    {
        treeMap.remove(key);
    }

    public static void displayTreeMap()
    {
        for (Person person:treeMap.values())
        {
            System.out.println(String.format("/ %15s / %15s / %3d / %8s /", person.getName(), person.getSurname(), person.getAge(), person.getJob()));
        }
    }
}
