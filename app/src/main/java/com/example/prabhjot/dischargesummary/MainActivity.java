package com.example.prabhjot.dischargesummary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DischargeSummaryModel> al = new ArrayList<>();
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.recycler_view);

        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));
        /*
        al.add(new DischargeSummaryModel("Discharge diagnosis", "asjsbajvbjavajjvbasvjasvasvbasbvjasbvsabvjjbasvbasvbsavbasvbasbvsabvsbavjbavsbavuuvg" +
                "JSABVJAJBJJ SABVJSABVJABVJABV" +
                "AVKJBSJVBAS JBVJVb subvwuivwyectacacvvbibnn  BJJBV" +
                "SJBVSJVBJASV BAJSBVJSABVJJSABVHBSDBVSUII VBIhuvusvuuvyyvJBV" +
                "VAJBVAJSVBJAVB  JJVBJJVBJAVKJBAVKJBAVBA VBJBVJSBJSBVJJSBAVJSBJV" +
                "yvbvhsbvh bBSJSBSBBBDSVJBVHJSHV BHSVBHSBVJ"));
        al.add(new DischargeSummaryModel("Discharge diagnosis", "asjsbajvbjavajjvbasvjasvasvbasbvjasbvsabvjjbasvbasvbsavbasvbasbvsabvsbavjbavsbavuuvg" +
                "JSABVJAJBJJ SABVJSABVJABVJABV" +
                "AVKJBSJVBAS JBVJVb subvwuivwyectacacvvbibnn  BJJBV" +
                "SJBVSJVBJASV BAJSBVJSABVJJSABVHBSDBVSUII VBIhuvusvuuvyyvJBV" +
                "VAJBVAJSVBJAVB  JJVBJJVBJAVKJBAVKJBAVBA VBJBVJSBJSBVJJSBAVJSBJV" +
                "yvbvhsbvh bBSJSBSBBBDSVJBVHJSHV BHSVBHSBVJ"));
        al.add(new DischargeSummaryModel("Discharge diagnosis", "asjsbajvbjavajjvbasvjasvasvbasbvjasbvsabvjjbasvbasvbsavbasvbasbvsabvsbavjbavsbavuuvg" +
                "JSABVJAJBJJ SABVJSABVJABVJABV" +
                "AVKJBSJVBAS JBVJVb subvwuivwyectacacvvbibnn  BJJBV" +
                "SJBVSJVBJASV BAJSBVJSABVJJSABVHBSDBVSUII VBIhuvusvuuvyyvJBV" +
                "VAJBVAJSVBJAVB  JJVBJJVBJAVKJBAVKJBAVBA VBJBVJSBJSBVJJSBAVJSBJV" +
                "yvbvhsbvh bBSJSBSBBBDSVJBVHJSHV BHSVBHSBVJ"));
        al.add(new DischargeSummaryModel("Discharge diagnosis", "asjsbajvbjavajjvbasvjasvasvbasbvjasbvsabvjjbasvbasvbsavbasvbasbvsabvsbavjbavsbavuuvg" +
                "JSABVJAJBJJ SABVJSABVJABVJABV" +
                "AVKJBSJVBAS JBVJVb subvwuivwyectacacvvbibnn  BJJBV" +
                "SJBVSJVBJASV BAJSBVJSABVJJSABVHBSDBVSUII VBIhuvusvuuvyyvJBV" +
                "VAJBVAJSVBJAVB  JJVBJJVBJAVKJBAVKJBAVBA VBJBVJSBJSBVJJSBAVJSBJV" +
                "yvbvhsbvh bBSJSBSBBBDSVJBVHJSHV BHSVBHSBVJ"));
        al.add(new DischargeSummaryModel("Discharge diagnosis", "asjsbajvbjavajjvbasvjasvasvbasbvjasbvsabvjjbasvbasvbsavbasvbasbvsabvsbavjbavsbavuuvg" +
                "JSABVJAJBJJ SABVJSABVJABVJABV" +
                "AVKJBSJVBAS JBVJVb subvwuivwyectacacvvbibnn  BJJBV" +
                "SJBVSJVBJASV BAJSBVJSABVJJSABVHBSDBVSUII VBIhuvusvuuvyyvJBV" +
                "VAJBVAJSVBJAVB  JJVBJJVBJAVKJBAVKJBAVBA VBJBVJSBJSBVJJSBAVJSBJV" +
                "yvbvhsbvh bBSJSBSBBBDSVJBVHJSHV BHSVBHSBVJ"));
        al.add(new DischargeSummaryModel("Discharge diagnosis", "asjsbajvbjavajjvbasvjasvasvbasbvjasbvsabvjjbasvbasvbsavbasvbasbvsabvsbavjbavsbavuuvg" +
                "JSABVJAJBJJ SABVJSABVJABVJABV" +
                "AVKJBSJVBAS JBVJVb subvwuivwyectacacvvbibnn  BJJBV" +
                "SJBVSJVBJASV BAJSBVJSABVJJSABVHBSDBVSUII VBIhuvusvuuvyyvJBV" +
                "VAJBVAJSVBJAVB  JJVBJJVBJAVKJBAVKJBAVBA VBJBVJSBJSBVJJSBAVJSBJV" +
                "yvbvhsbvh bBSJSBSBBBDSVJBVHJSHV BHSVBHSBVJ"));
        al.add(new DischargeSummaryModel("Discharge diagnosis", "asjsbajvbjavajjvbasvjasvasvbasbvjasbvsabvjjbasvbasvbsavbasvbasbvsabvsbavjbavsbavuuvg" +
                "JSABVJAJBJJ SABVJSABVJABVJABV" +
                "AVKJBSJVBAS JBVJVb subvwuivwyectacacvvbibnn  BJJBV" +
                "SJBVSJVBJASV BAJSBVJSABVJJSABVHBSDBVSUII VBIhuvusvuuvyyvJBV" +
                "VAJBVAJSVBJAVB  JJVBJJVBJAVKJBAVKJBAVBA VBJBVJSBJSBVJJSBAVJSBJV" +
                "yvbvhsbvh bBSJSBSBBBDSVJBVHJSHV BHSVBHSBVJ"));
                */
        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));
        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));
        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));
        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));
        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));
        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));
        al.add(new DischargeSummaryModel("Discharge diagnosis", ""));

        DischargeSummaryAdapter mAdapter = new DischargeSummaryAdapter(al, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setAdapter(mAdapter);

    }
}
