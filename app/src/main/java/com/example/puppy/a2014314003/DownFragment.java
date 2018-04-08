package com.example.puppy.a2014314003;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DownFragment extends Fragment {

    TextView tv;
    int i1,i2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_down, container, false);
        tv = (TextView)root.findViewById(R.id.textView);

        return root;

    }
    public void calculateText(String tv1, String tv2, int susik){
        i1 = Integer.parseInt(tv1);
        i2 = Integer.parseInt(tv2);
        int a ;
        switch (susik){
            case R.id.btn1:
                a = i2+i1;
                tv.setText("결과는 :"+a);
                break;
            case R.id.btn2:
                a = i2-i1;
                tv.setText("결과는 :"+a);
                break;
            case R.id.btn3:
                a = i2*i1;
                tv.setText("결과는 :"+a);
                break;
            case R.id.btn4:
                a = i2/i1;
                tv.setText("결과는 :"+a);
                break;
        }

    }
}
