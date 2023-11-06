package category;

import java.util.List;

import store.Store;

public class Category {
    private String nameCategory;
    private List<Store> stores;

    public Category(String nameCategory, List<Store> stores) {
        this.nameCategory = nameCategory;
        this.stores = stores;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}


