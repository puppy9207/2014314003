package com.example.puppy.a2014314003;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpFragment extends Fragment {

    EditText et1, et2;
    public static interface TextSendCall{
        public void printText(String tv1, String tv2, int susik);
    }
    public TextSendCall callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof TextSendCall){
            callback = (TextSendCall)context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_up, container, false);
        final Button btn1,btn2,btn3,btn4,btn5;
        btn1 = (Button)root.findViewById(R.id.btn1);
        btn2 = (Button)root.findViewById(R.id.btn2);
        btn3 = (Button)root.findViewById(R.id.btn3);
        btn4 = (Button)root.findViewById(R.id.btn4);
        et1 = (EditText)root.findViewById(R.id.editText);
        et2 = (EditText)root.findViewById(R.id.editText2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.printText(et1.getText().toString(),et2.getText().toString(),v.getId());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.printText(et1.getText().toString(),et2.getText().toString(),v.getId());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.printText(et1.getText().toString(),et2.getText().toString(),v.getId());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.printText(et1.getText().toString(),et2.getText().toString(),v.getId());
            }
        });
        return root;
    }

}
