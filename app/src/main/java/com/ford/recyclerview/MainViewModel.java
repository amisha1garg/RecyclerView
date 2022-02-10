package com.ford.recyclerview;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {
    MutableLiveData<ArrayList<Menu>> liveData;
    public ArrayList<Menu> menuArrayList;

    public MainViewModel() {
        liveData = new MutableLiveData<>();

        init();
    }

    public MutableLiveData<ArrayList<Menu>> getUserMutableLiveData(){
        return liveData;
    }

    public void init(){
        populateList();
        liveData.setValue(menuArrayList);
    }

    public void populateList(){

        menuArrayList = new ArrayList<>();
        Menu menu = new Menu();

        menu.setName("Burger");
        menu.setPrice("Rs. 110");
        menu.setImageIcon(R.drawable.burger);
        menuArrayList.add(menu);

        Menu menu1 = new Menu();
        menu1.setName("Pizza");
        menu1.setPrice("Rs. 210");
        menu1.setImageIcon(R.drawable.pizza);
        menuArrayList.add(menu1);

        Menu menu2 = new Menu();
        menu2.setName("Momos");
        menu2.setPrice("Rs. 40");
        menu2.setImageIcon(R.drawable.momos);
        menuArrayList.add(menu2);

        Menu menu3 = new Menu();
        menu3.setName("Sub");
        menu3.setPrice("Rs. 440");
        menu3.setImageIcon(R.drawable.sub);
        menuArrayList.add(menu3);

        Menu menu4 = new Menu();
        menu4.setName("Samosa");
        menu4.setPrice("Rs. 20");
        menu4.setImageIcon(R.drawable.samosa);
        menuArrayList.add(menu4);

        Menu menu5 = new Menu();
        menu5.setName("Sweets");
        menu5.setPrice("Rs. 400");
        menu5.setImageIcon(R.drawable.sweets);
        menuArrayList.add(menu5);

        Menu menu6 = new Menu();
        menu6.setName("Sweet corn");
        menu6.setPrice("Rs. 50");
        menu6.setImageIcon(R.drawable.sweet_corn);
        menuArrayList.add(menu6);

        Menu menu7 = new Menu();
        menu7.setName("Kachori");
        menu7.setPrice("Rs. 50");
        menu7.setImageIcon(R.drawable.kachori);
        menuArrayList.add(menu7);

        Menu menu8 = new Menu();
        menu8.setName("Gol_gappe");
        menu8.setPrice("Rs. 20");
        menu8.setImageIcon(R.drawable.gol_gappe);
        menuArrayList.add(menu8);

        Menu menu9 = new Menu();
        menu9.setName("French_fries");
        menu9.setPrice("Rs. 90");
        menu9.setImageIcon(R.drawable.french_fries);
        menuArrayList.add(menu9);

    }

}
