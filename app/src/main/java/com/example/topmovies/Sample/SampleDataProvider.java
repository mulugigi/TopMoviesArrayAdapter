package com.example.topmovies.Sample;

import com.example.topmovies.Movies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {

    //Create the two types of static fields
    public static List<Movies> dataItemList;
    public static Map<String, Movies> dataItemMap;

    //We need a static initializer block
    static {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new Movies("1", "Quinoa Salmon Salad",
                "Our quinoa salad is served with quinoa.", "quinoa_salad.jpg"));
        addItem(new Movies("2", "Chef's Salad", "The chef’s salad has cucumber, tomatoes, red onions, mushrooms, hard-boiled eggs, cheese, and hot grilled chicken on a bed of romaine lettuce.", "chef_salad.jpg"));
        addItem(new Movies("3", "House Salad", "Our house salad is made with romaine lettuce and spinach, topped with tomatoes, cucumbers, red onions and carrots. Served with a dressing of your choice.", "house_salad.jpg"));
        addItem(new Movies("4", "Garden Buffet", "Choose from our fresh local, organically grown ingredients to make a custom salad.", "garden_buffet.jpg"));
        addItem(new Movies("5", "Mini Cheeseburgers", "These mini cheeseburgers are served on a fresh baked pretzel bun with lettuce, tomato, avocado, and your choice of cheese.", "mini_cheeseburgers.jpg"));
        addItem(new Movies("6", "Panko Stuffed Mushrooms", "Large mushroom caps are filled a savory cream cheese, bacon and panko breadcrumb stuffing, topped with cheddar cheese.", "stuffed_mushrooms.jpg"));
        addItem(new Movies("7", "French Onion Soup", "Caramelized onions slow cooked in a savory broth, topped with sourdough and a provolone cheese blend. Served with sourdough bread.", "french_onion_soup.jpg"));
        addItem(new Movies("8", "Artichokes with Garlic Aeoli", "Our artichokes are brushed with an olive oil and rosemary blend and then broiled to perfection. Served with a side of creamy garlic aioli.", "artichokes.jpg"));
        addItem(new Movies("9", "Parmesan Deviled Eggs", "SOME SAY OUR EGGS ARE DEVILISHLY GOOD. I HAVE TO AGREE.", "deviled_eggs.jpg"));
        addItem(new Movies("10", "Classic Burger", "Our classic burger is made with 100% pure angus beef, served with lettuce, tomatoes, onions, pickles, and cheese of your choice. Veggie burger available upon request.", "classic_burger.jpg"));
    }

    //Add a static method that accept an instance of the
    //data item class and add it both to the list and map
    private static void addItem(Movies movie){
        dataItemList.add(movie);
        dataItemMap.put(movie.getId(), movie);

    }
}
