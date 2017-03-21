package fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.tecnoia.matheus.healthdata.R;

/**
 * Created by matheus on 19/03/17.
 */

public class Tabela1 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.tabela1,container,false);

/*
        TextView textView = (TextView) rootView.findViewById(R.id.textViewtTabela1);
        textView.setText("TESTE");
*/
        FloatingActionButton floatingActionButton = (FloatingActionButton)rootView.findViewById(R.id.fab1);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });




        return rootView;

    }


}
