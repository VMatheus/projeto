package adapter;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import fragments.Tabela1;
import fragments.Tabela2;
import fragments.Tabela3;
import fragments.Tabela4;
import fragments.Tabela5;

/**
 * Created by matheus on 20/03/17.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                Tabela1 tabela1  = new Tabela1();
                return tabela1;


            case 1 :
                Tabela2 tabela2 = new Tabela2();
                return tabela2;

            case 2:
                Tabela3 tabela3 = new Tabela3();
                return tabela3;
            case 3:
                Tabela4 tabela4 = new Tabela4();
                return tabela4;

            case 4:
                Tabela5 tabela5= new Tabela5();
                return tabela5;

            default:

                return null;

        }
    }

    @Override
    public int getCount() {
        return 5;
    }
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Meus Medicos";
            case 1:
                return "Meus Medicamentos";
            case 2:
                return "Anotações Diarias";
            case 3:
                return "Eventos";
            case 4 :
                return "Outros";
        }
        return null;
    }
}
