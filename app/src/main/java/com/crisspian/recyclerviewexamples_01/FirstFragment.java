package com.crisspian.recyclerviewexamples_01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.crisspian.recyclerviewexamples_01.adapter.ItemAdapter;
import com.crisspian.recyclerviewexamples_01.databinding.FragmentFirstBinding;
import com.crisspian.recyclerviewexamples_01.model.Item;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment implements ItemAdapter.SendItem {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        RecyclerView mRecyclerView = binding.rvItem;
        ItemAdapter adapter = new ItemAdapter(returnItemList(), getContext(),this);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       // NavHostFragment.findNavController(FirstFragment.this).navigate(directions);
    }



    //Generamos un listado de datos del tipo Item (telefonos y su nombre respectivo.
    private List<Item> returnItemList() {
        List<Item> listItem = new ArrayList<>();
        Item item01 = new Item("Samsung Galaxy A21s 64GB","https://images.samsung.com/is/image/samsung/es-galaxy-a21s-sm-a217fzkoeub-262755098?$PD_GALLERY_L_JPG","167253 PESOS");
        listItem.add(item01);
        Item item02 = new Item("Huawei Nova 7 SE 128GB","https://consumer.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/phones/nova7-se/img/mob/huawei-nova7-se-mob.png","347760 PESOS");
        listItem.add(item02);
        Item item03 = new Item("Apple iPhone 7 32GB","https://daisycon.io/images/mobile-device/?width=250&height=250&color=ffffff&mobile_device_brand=apple&mobile_device_model=iphone+7+32gb&mobile_device_color=silver","323760 PESOS");
        listItem.add(item03);
        Item item04 = new Item("Galaxy Note 20 256GB","https://daisycon.io/images/mobile-device/?width=250&height=250&color=ffffff&mobile_device_brand=samsung&mobile_device_model=Galaxy+note+20+256gb&mobile_device_color=silver","767760 PESOS");
        listItem.add(item04);
        Item item05 = new Item("Xiaomi Redmi 9 64GB","https://mistorechile.cl/wp-content/uploads/2020/06/1366_2000-17254efe-c6bd-47fe-8c4f-bca464358abc.jpg","167760 PESOS");
        listItem.add(item05);
        Item item06 = new Item("Apple iPhone 14 Plus","https://api.cxl8rgz-articulos1-p1-public.model-t.cc.commerce.ondemand.com/medias/REIFSTORE-iPhone14Plus-VIEW1.jpg?context=bWFzdGVyfGltYWdlc3wxOTc3OTJ8aW1hZ2UvanBlZ3xoMGIvaGVjLzkyNjMwMzUwNTYxNTgvUkVJRlNUT1JFX2lQaG9uZTE0UGx1c19WSUVXMS5qcGd8NDNhZjZlMzBhMzAwM2VmMTYzZTdlNGJjNDE0ZDYzOGMxMWFlM2EyMDUzMmY3ZjllM2Y4NDg1NWQ1NWU1NWM5Zg","1119990 PESDS");
        listItem.add(item06);
        Item item07 = new Item("Samsung Galaxy S10 128GB","https://daisycon.io/images/mobile-device/?width=250&height=250&color=ffffff&mobile_device_brand=samsung&mobile_device_model=Galaxy+s10+128gb&mobile_device_color=silver","623760 PESOS");
        listItem.add(item07);
        Item item08 = new Item("Nokia 2.3 32GB","https://images.ctfassets.net/wcfotm6rrl7u/7BhaseqEIFMGpIi3jVzA6P/e9b5ed6e0896f9883ca0190e4a8ab697/1-default-Nokia_2_3-sand.png","95760 PESOS");
        listItem.add(item08);
        Item item09 = new Item("Nokia 6.2 64GB","https://images.ctfassets.net/wcfotm6rrl7u/63Z5h0GE5CFwHTn09dqJYY/261a87f838aeaef89a9749f5e0b9ab51/nokia_6_2-PUREDISPLAY_1-desktop.png","179760 PESOS");
        listItem.add(item09);
        Item item10 = new Item("LG Q6 32GB","https://www.lg.com/us/images/cell-phones/md05902196/gallery/medium05.jpg","107760 PESOS");
        listItem.add(item10);

        return listItem;
    }

    @Override
    public void sendItem(Item item) {
        Bundle bundle = new Bundle();
        bundle.putString("name", item.getItemDescription());
        bundle.putString("url", item.getUrlImage());
        bundle.putString("price", item.getPrice());
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);

    }
}