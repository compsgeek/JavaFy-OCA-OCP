package in.compsgeek.javafyocaocp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by CompsGeek on 8/21/2016.
 */
public class MyExListAdapter extends BaseExpandableListAdapter{

    Context context;
    List<String> lessons;
    Map<String, List<String>> topics;


    public MyExListAdapter(Context context, List<String> lessons, Map<String, List<String>> topics) {
        this.context = context;
        this.lessons = lessons;
        this.topics = topics;
    }

    @Override
    public int getGroupCount() {
        return lessons.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return topics.get(lessons.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return lessons.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return topics.get(lessons.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int gtoupPosition) {
        return gtoupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String lessons = (String) getGroup(groupPosition);

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_parent,null);
        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.txtParent);
        txtParent.setText(lessons);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String topic = (String) getChild(groupPosition,childPosition);

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_child,null);
        }

        TextView txtChild = (TextView) convertView.findViewById(R.id.txtChild);
        txtChild.setText(topic);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {

        return true;

    }
}
