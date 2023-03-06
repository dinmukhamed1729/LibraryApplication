package com.example.libraryapplication;

import android.widget.Filter;

import java.util.ArrayList;

public class FilterCategory extends Filter {
    ArrayList<ModelCategory> filterList;
    AdapterCategory adapterCategory;

    public FilterCategory(ArrayList<ModelCategory> filterList, AdapterCategory adapterCategory) {
        this.filterList = filterList;
        this.adapterCategory = adapterCategory;
    }


    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults filterResults = new FilterResults();
        if(constraint != null && constraint.length() > 0){
            constraint = constraint.toString().toUpperCase();
            ArrayList<ModelCategory> filteredModels = new ArrayList<>();
            for(int i = 0;i < filterList.size();i++){
                 if(filterList.get(i).getCategory().toUpperCase().contains(constraint)){
                     filteredModels.add(filterList.get(i));
                 }
            }
            filterResults.count = filteredModels.size();
            filterResults.values = filteredModels;

        }else{
            filterResults.count = filterList.size();
            filterResults.values = filterList;
        }
        return filterResults;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapterCategory.categoryArrayList = (ArrayList<ModelCategory>) results.values;


        adapterCategory.notifyDataSetChanged();


    }
}
