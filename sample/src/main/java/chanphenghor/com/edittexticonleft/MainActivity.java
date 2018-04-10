package chanphenghor.com.edittexticonleft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import chanphenghor.com.library.EditTextIconLeft;


public class MainActivity extends AppCompatActivity {
    EditTextIconLeft editTextIconLeft1;
    EditTextIconLeft test_disable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextIconLeft1 = findViewById(R.id.test1);
        test_disable = findViewById(R.id.test_disable);
        editTextIconLeft1.setBorderFocus(
                R.drawable.border_gray,
                R.drawable.border_focus,
                R.drawable.user_empty,
                R.drawable.user_empty_focus);
        test_disable.setBorderFocus(
                R.drawable.border_gray,
                R.drawable.border_focus,
                R.drawable.user_empty,
                R.drawable.user_empty_focus);
        test_disable.setEnabled(false);
        findViewById(R.id.btn_enable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(test_disable.isEnabled()){
                    test_disable.setEnabled(false);
                }else {
                    test_disable.setEnabled(true);
                }

            }
        });
    }
}
