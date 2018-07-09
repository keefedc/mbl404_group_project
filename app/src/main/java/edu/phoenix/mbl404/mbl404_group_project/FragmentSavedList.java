package edu.phoenix.mbl404.mbl404_group_project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentSavedList extends Fragment {

    private View view;
    private RecyclerView.Adapter rvAdapter;

    public FragmentSavedList() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_saved_list, null);

        rvAdapter = new SavedViewAdapter(container.getContext(), MainActivity.savedData);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.saved_list);
        rv.setLayoutManager(new LinearLayoutManager(container.getContext()));
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.addItemDecoration(new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL));
        rv.setAdapter(rvAdapter);



        return view;
    }


}
