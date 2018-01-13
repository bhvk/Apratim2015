package fest.ccet.com.apratim;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.Intent.getIntent;

public class CustomAdapter extends BaseExpandableListAdapter {

    private Context c;
    private ArrayList<Event> event;
    private LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<Event> event){
        this.c=c;
        this.event=event;
        inflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return event.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        // TODO Auto-generated method stub
        return event.get(groupPosition).titles.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        // TODO Auto-generated method stub
        return event.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return event.get(groupPosition).titles.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void onGroupCollapsed(int groupPosition)
    {
        super.onGroupCollapsed(groupPosition);
    }

    @Override
    public void onGroupExpanded(int groupPosition)
    {
        super.onGroupExpanded(groupPosition);
    }


    @Override
    public long getChildId(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public View getGroupView(final int groupPosition, final boolean isExpanded,
                             View convertView, final ViewGroup parent) {
        // TODO Auto-generated method stub
        Event t=(Event)getGroup(groupPosition);
        if(convertView==null)
        {

            convertView = inflater.inflate(R.layout.events, parent, false);
        }

        TextView nameTv=(TextView) convertView.findViewById(R.id.textView1);
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView1);
        final TextView nameTv1=(TextView) convertView.findViewById(R.id.textView1);
ImageView im=(ImageView)convertView.findViewById(R.id.imageView2);
        String name=t.Name;
        nameTv.setText(name);
        int imageResourceId = isExpanded ? android.R.drawable.arrow_up_float : android.R.drawable.arrow_down_float;
        im.setImageResource(imageResourceId);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isExpanded) ((ExpandableListView) parent).collapseGroup(groupPosition);
                else ((ExpandableListView) parent).expandGroup(groupPosition, true);

                Context context = v.getContext();
                Intent i = new Intent(context, EventOnClick.class);

                if (nameTv1.getText().toString().compareToIgnoreCase("Group Discussions") == 0) {
                    i.putExtra("ACTIVITY", "GD");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("Conventional Debate") == 0) {
                    i.putExtra("ACTIVITY", "DEBATE");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("JAM") == 0) {
                    i.putExtra("ACTIVITY", "JAMING");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("Parliamentary Debate") == 0) {
                    i.putExtra("ACTIVITY", "NPD");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("Exuberance") == 0) {
                    i.putExtra("ACTIVITY", "FOLK");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("Trapasso") == 0) {
                    i.putExtra("ACTIVITY", "FASHION");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("Rhythmika") == 0) {
                    i.putExtra("ACTIVITY", "GRPDANCE");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("Fifa 14") == 0) {
                    i.putExtra("ACTIVITY", "FIFA");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("Counter Strike 1.6") == 0) {
                    i.putExtra("ACTIVITY", "CS");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                } else if (nameTv1.getText().toString().compareToIgnoreCase("NFS:Most Wanted") == 0) {
                    i.putExtra("ACTIVITY", "NFS");
                    Toast.makeText(c.getApplicationContext(), "" + nameTv1.getText().toString(), Toast.LENGTH_SHORT).show();
                    context.startActivity(i);
                }
                  return ;
               // context.startActivity(i);
            }


        });



        if(name=="Dramatics")
        {
            img.setImageResource(R.drawable.dramatics);
        }else if(name=="Dance")
        {
            img.setImageResource(R.drawable.dances);
        }else if(name=="Fine Arts")
        {
            img.setImageResource(R.drawable.art);
        }else if(name=="Music")
        {
            img.setImageResource(R.drawable.musics);
        }else if(name=="CSE")
        {
            img.setImageResource(R.drawable.comp);
        }else if(name=="ECE")
        {
            img.setImageResource(R.drawable.elec);
        }else if(name=="CIVIL")
        {
            img.setImageResource(R.drawable.civil);
        }else if(name=="MECHANICAL")
        {
            img.setImageResource(R.drawable.mech);
        }else if(name=="Parliamentary Debate")
        {
            img.setImageResource(R.drawable.npd);
        }else if(name=="JAM")
        {
            img.setImageResource(R.drawable.jam);
        }else if(name=="Conventional Debate")
        {
            img.setImageResource(R.drawable.cd);
        }else if(name=="Group Discussions")
        {
            img.setImageResource(R.drawable.gd);
        }else if(name=="Exuberance")
        {
            img.setImageResource(R.drawable.folk);
        }else if(name=="Trapasso")
        {
            img.setImageResource(R.drawable.fashion);
        }else if(name=="Rhythmika")
        {
            img.setImageResource(R.drawable.grp);
        }
       /* else if(name=="Sunburn")
        {
            img.setImageResource(R.drawable.sunburn);
        }
        else if(name=="Star Night")
        {
            img.setImageResource(R.drawable.starnight);
        }*/
        else if(name=="Counter Strike 1.6")
        {
            img.setImageResource(R.drawable.cs);
        }else if(name=="Fifa 14")
        {
            img.setImageResource(R.drawable.fifa);
        }else if(name=="NFS:Most Wanted")
        {
            img.setImageResource(R.drawable.nfs);
        }
        convertView.setBackgroundColor(Color.TRANSPARENT);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        if(convertView==null){
            convertView=inflater.inflate(R.layout.title,parent,false);
        }
        String child=(String) getChild(groupPosition, childPosition);

        final TextView nameTv=(TextView) convertView.findViewById(R.id.textView1);


        nameTv.setText(child);

        nameTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = v.getContext();
                Intent i = new Intent(context, EventOnClick.class);

                if(nameTv.getText().toString().compareToIgnoreCase("Aarohan (Street Play)")==0){
                    i.putExtra("ACTIVITY","STREET");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }
                else if (nameTv.getText().toString().compareToIgnoreCase("Pratibimb (Stage Play)")==0){
                    i.putExtra("ACTIVITY","STAGE");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                } else if (nameTv.getText().toString().compareToIgnoreCase("Sab bikta hai (Ad Mad)")==0){
                    i.putExtra("ACTIVITY","AD");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                } else if (nameTv.getText().toString().compareToIgnoreCase("Abhivyakti (Mime)")==0){
                    i.putExtra("ACTIVITY","MIME");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Short Movie")==0){
                    i.putExtra("ACTIVITY","SHORTMOVIE");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Skit")==0){
                    i.putExtra("ACTIVITY","SKIT");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Sizzle (Solo Dance)")==0){
                    i.putExtra("ACTIVITY","SOLODANCE");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Synchronize (Duet Dance)")==0){
                    i.putExtra("ACTIVITY","DUETDANCE");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("InkD (Tattoo Making)")==0){
                    i.putExtra("ACTIVITY","TATTOO");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Strokes of Genius (Face Painting)")==0){
                    i.putExtra("ACTIVITY","FACEPAINTING");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Kalakriti (Rangoli Making)")==0){
                    i.putExtra("ACTIVITY","RANGOLI");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Potpourri (Collage Making)")==0){
                    i.putExtra("ACTIVITY","COLLAGE");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Graffiti")==0){
                    i.putExtra("ACTIVITY","GRAFFITI");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Coalescence (Fusion Band)")==0){
                    i.putExtra("ACTIVITY","FUSION");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Resonating Strings (Solo Instrumental)")==0){
                    i.putExtra("ACTIVITY","SOLOINST");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Antakshari")==0){
                    i.putExtra("ACTIVITY","ANTAKSHARI");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Melody Height (Solo Singing)")==0){
                    i.putExtra("ACTIVITY","SOLOSING");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("QuizDom")==0){
                    i.putExtra("ACTIVITY","QUIZDOM");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Code Mania")==0){
                    i.putExtra("ACTIVITY","CODE");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Web Masterz")==0){
                    i.putExtra("ACTIVITY","WEB");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Vivify(Photoshop)")==0){
                    i.putExtra("ACTIVITY","PHOTOSHOP");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Brain-Quiilla")==0){
                    i.putExtra("ACTIVITY","BRAINQUIILLA");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Maze Runner")==0){
                    i.putExtra("ACTIVITY","MAZERUNNER");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Game of Drones")==0){
                    i.putExtra("ACTIVITY","GAMEOFDRONES");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Bridge Making")==0){
                    i.putExtra("ACTIVITY","BRIDGEMAKING");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Town Planning")==0){
                    i.putExtra("ACTIVITY","TOWNPLANNING");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Slump it")==0){
                    i.putExtra("ACTIVITY","SLUMPIT");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Robo Race")==0){
                    i.putExtra("ACTIVITY","ROBORACE");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Free Fliers")==0){
                    i.putExtra("ACTIVITY","FREEFLIERS");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Aqua Jet")==0){
                    i.putExtra("ACTIVITY","AQUAJET");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Robo Wars")==0){
                    i.putExtra("ACTIVITY","ROBOWARS");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (nameTv.getText().toString().compareToIgnoreCase("Line Seguidor")==0){
                    i.putExtra("ACTIVITY","LINESEG");
                    Toast.makeText(c.getApplicationContext(),""+nameTv.getText().toString(),Toast.LENGTH_SHORT).show();
                }

                context.startActivity(i);
            }


        });


        String eventName=getGroup(groupPosition).toString();
        if(eventName=="Dramatics")
        {
            if(child=="Aarohan (Street Play)")
            {

            }else if(child=="Pratibimb (Stage Play)")
            {

            }else if(child=="Ad Mad")
            {

            }else if(child=="Abhivyakti (Mime)")
            {

            }else if(child=="Short Movie")
            {

            }else if(child=="Skit")
            {

            }
        }else if(eventName=="Dance")
        {
            if(child=="Sizzle (Solo Dance)")
            {

            }else if(child=="Synchronize (Duet Dance)")
            {

            }
        }else if(eventName=="Fine Arts")
        {
            if(child=="InkD (Tattoo Making)")
            {

            }else if(child=="Strokes of Genius (Face Painting)")
            {

            }else if(child=="Kalakriti (Rangoli Making)")
            {

            }else if(child=="Potpourri (Collage Making)")
            {

            }else if(child=="Graffiti")
            {

            }
        }else if(eventName=="Music")
        {
            if(child=="Coalescence (Fusion Band)")
            {

            }else if(child=="Resonating Strings (Solo Instrumental)")
            {

            }else if(child=="Antakshari")
            {

            }else if(child=="Melody Height (Solo Singing)")
            {

            }
        }else if(eventName=="CSE")
        {
            if(child=="Code Mania")
            {

            }else if(child=="QuizDom")
            {

            }else if(child=="Web Masterz")
            {

            }else if(child=="Vivify(Photoshop)")
            {

            }
        }else if(eventName=="ECE")
        {
            if(child=="Line Seguidor")
            {

            }else if(child=="Brain-Quiilla")
            {

            }else if(child=="Maze Runner")
            {

            }else if(child=="Game of Drones")
            {

            }
        }else if(eventName=="CIVIL")
        {
            if(child=="Bridge Making")
            {

            }else if(child=="Town Planning")
            {

            }else if(child=="Slump it")
            {

            }
        }else if(eventName=="MECHANICAL")
        {
            if(child=="Robo Race")
            {

            }else if(child=="Free Fliers")
            {

            }else if(child=="Aqua Jet")
            {

            }else if(child=="Robo Wars")
            {

            }
        }
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        // TODO Auto-generated method stub
        return true;
    }

}


