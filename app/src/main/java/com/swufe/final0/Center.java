package com.swufe.final0;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import androidx.fragment.app.Fragment;
import android.app.Fragment;
/**
 * Created by Administrator on 2019/4/27.
 */

public class Center extends Fragment {

    TextView textView_wordsbase,textView_explain;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_7_center,null);
        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView_wordsbase = view.findViewById(R.id.self_tv_words);
        textView_explain = view.findViewById(R.id.self_tv_explain);
        //点击单词库
        textView_wordsbase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyList.class);
                startActivity(intent);
            }
        });
        //点击软件说明
        textView_explain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Message.class);
                startActivity(intent);
            }
        });
    }
}
