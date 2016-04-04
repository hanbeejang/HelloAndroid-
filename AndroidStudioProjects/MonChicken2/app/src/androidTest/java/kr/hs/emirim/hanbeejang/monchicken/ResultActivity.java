package kr.hs.emirim.hanbeejang.monchicken;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by appcreator38 on 2016. 3. 28..
 */
public class ResultActivity  extends AppCompatActivity {
    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult=(TextView)findViewById(B.id.result);
        mResult.setText("결과");
    }
}
