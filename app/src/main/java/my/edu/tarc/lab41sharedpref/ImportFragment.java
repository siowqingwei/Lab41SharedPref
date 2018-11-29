package my.edu.tarc.lab41sharedpref;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {
    private TextView textViewMessage;

    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view;
        Button buttonShowMessage;
        view = inflater.inflate(R.layout.fragment_import, container, false);
        textViewMessage = view.findViewById(R.id.textViewMessage);
        buttonShowMessage = view.findViewById(R.id.buttonShowMessage);
        buttonShowMessage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                textViewMessage.setText("Hello");
            }
        });
        return view;
    }

}
