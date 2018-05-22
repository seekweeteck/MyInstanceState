package my.edu.tarc.myinstancestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName, editTextPhone;
    private static String INPUT_NAME="name", INPUT_PHONE="phone";
    private String mName, mPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // recovering the instance state
        if (savedInstanceState != null) {
            mName = savedInstanceState.getString(INPUT_NAME);
            mPhone = savedInstanceState.getString(INPUT_PHONE);
        }


        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextPhone = (EditText)findViewById(R.id.editTextPhone);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        editTextName.setText(mName);
        editTextPhone.setText(mPhone);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(INPUT_NAME, editTextName.getText().toString());
        outState.putString(INPUT_PHONE, editTextPhone.getText().toString());
    }
}
