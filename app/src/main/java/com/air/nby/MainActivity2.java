package com.air.nby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        final EditText mEditText = (EditText) findViewById(R.id.editText);


        EditTextTools editTextTools= new EditTextTools(mEditText,10,2);
        editTextTools.setOnEmptyListener(new EditTextTools.OnEmptyListener() {
            @Override
            public void onEmpty() {

            }

            @Override
            public void onNoEmpty() {

            }
        });
        editTextTools.setOnBeforeAfterChangedListener(new EditTextTools.OnBeforeAfterChangedListener() {
            @Override
            public void onBeforeAfterChanged(String s) {

            }
        });
        // mEditText.addTextChangedListener(mTextWatcher);

    }


}
