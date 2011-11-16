package proj.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FinalProjActivity extends Activity implements View.OnClickListener/*, View.OnLongClickListener*/ {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    
    public void onClick(View v) {
    	/*switch (v.getId()) {
    	case R.id.button
    	}*/
    	Toast.makeText(FinalProjActivity.this, "test", Toast.LENGTH_SHORT).show();
    }
    
 /*   public void onLongClick(View v){
    	Toast.makeText(FinalProjActivity.this, "test", Toast.LENGTH_SHORT).show();
    }*/ 
}