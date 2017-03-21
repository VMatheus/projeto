package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tecnoia.matheus.healthdata.R;

/**
 * Created by matheus on 19/03/17.
 */

public class Tabela2 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        return inflater.inflate(R.layout.tabela2, container, false);

    }
}
