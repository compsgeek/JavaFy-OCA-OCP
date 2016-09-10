package in.compsgeek.javafyocaocp.topics;

import android.content.Context;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import in.compsgeek.javafyocaocp.R;

import static in.compsgeek.javafyocaocp.R.color.colorAccent;
import static in.compsgeek.javafyocaocp.R.color.colorPrimary;
import static in.compsgeek.javafyocaocp.R.color.whitetext;

public class lesson0topic1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson0topic1);
        final Toolbar toolbar = (Toolbar)findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("Features of JAVA");

        Context context = this;
        Context context1 = this;
        Context context2 = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context,R.color.colorPrimary));
        collapsingToolbarLayout.setExpandedTitleColor(ContextCompat.getColor(context2,R.color.whitetext));
        collapsingToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(context1,R.color.whitetext));

    }
}
