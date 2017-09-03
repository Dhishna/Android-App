package taappscom.ta.dhishna;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cleveroad.fanlayoutmanager.FanLayoutManager;
import com.cleveroad.fanlayoutmanager.FanLayoutManagerSettings;
import com.cleveroad.fanlayoutmanager.callbacks.FanChildDrawingOrderCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class MainFragment extends Fragment {

    private FanLayoutManager mFanLayoutManager;

    private SportCardsAdapter mAdapter;
    static int number;
    String filename;
    public List<SportCardsUtils> eventList;


    public static MainFragment newInstance(int n) {
        Bundle args = new Bundle();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        number=n;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvCards);

        FanLayoutManagerSettings fanLayoutManagerSettings = FanLayoutManagerSettings
                .newBuilder(getContext())
                .withFanRadius(true)
                .withAngleItemBounce(8)
                .withViewHeightDp(200)
                .withViewWidthDp(140)
                .build();

        mFanLayoutManager = new FanLayoutManager(getContext(), fanLayoutManagerSettings);

        recyclerView.setLayoutManager(mFanLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new SportCardsAdapter(getContext());
        try {
            this.eventList = new ArrayList();
            switch (number) {
                case 0:
                    filename = "it.json";
                    break;
                case 1:
                    filename = "cs.json";
                    break;
                case 2:
                    filename = "ec.json";
                    break;
                case 3:
                    filename = "ee.json";
                    break;
                case 4:
                    filename = "ce.json";
                    break;
                case 5:
                    filename = "fs.json";
                    break;
                case 6:
                    filename = "me.json";
                    break;
                case 7:
                    filename = "core.json";
                    break;
            }

            JSONArray jsonArray = new JSONObject(loadfromasset()).getJSONArray("events");
            for (int i = 0; i < jsonArray.length(); i++) {

                SportCardsUtils event_instance = new SportCardsUtils();
                JSONObject json = jsonArray.getJSONObject(i);
                event_instance.setImage(json.getString(config.TAG_IMAGE));
                event_instance.setDescription(json.getString(config.TAG_DESCRIPTION));
                event_instance.setDetails(json.getString(config.TAG_DETAILS));

                event_instance.setName(json.getString(config.TAG_NAME));
                event_instance.setPricepool(json.getString(config.TAG_PRICEPOOL));
                //event_instance.setWebsitelink(json.getString(config.TAG_LINK));
                //event_instance.setEventid(json.getString(config.TAG_EVENT_ID));
                //event_instance.setEventformat(json.getString(config.TAG_EVENT_FORMAT));

                // event_instance.setBranch(json.getString(config.Branch));
                //Log.d("ID ", event_instance.getEventid());
                ArrayList<String> rules = new ArrayList();
                JSONArray jArray_rules = json.getJSONArray(config.TAG_RULES);
                for (int j = 0; j < jArray_rules.length(); j++)
                {
                    rules.add(((String)jArray_rules.get(j)) + "\n" + "\n" + "\n");
                }
                ArrayList<String> contacts=new ArrayList<>();
                JSONArray jsonArraycontacts=json.getJSONArray(config.TAG_CONTACTS);
                for(int k=0;k<jsonArraycontacts.length();k++)
                {
                    contacts.add((String)jsonArraycontacts.get(k));
                }
                event_instance.setRules(rules);
                event_instance.setContacts(contacts);
                this.eventList.add(event_instance);


            }
        }catch (JSONException j){}

       // if(number==0)
        mAdapter.addAll(SportCardsUtils.generateSportCards(eventList));
       // else if(number==1)
            //set branch wise code here
           // mAdapter.addAll(SportCardsUtils1.generateSportCards());
//SportCardsAdapter instance=new SportCardsAdapter(getContext());
        //use item position to denote event ?
        mAdapter.setOnItemClickListener(new SportCardsAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(int itemPosition, final View view) {
                if (mFanLayoutManager.getSelectedItemPosition() != itemPosition) {
                    mFanLayoutManager.switchItem(recyclerView, itemPosition);
                } else {
                    mFanLayoutManager.straightenSelectedItem(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animator) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                onClick(view, mFanLayoutManager.getSelectedItemPosition());
                            } else {
                                onClick(mFanLayoutManager.getSelectedItemPosition());
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animator) {

                        }
                    });
                }
            }
        });

        recyclerView.setAdapter(mAdapter);

        recyclerView.setChildDrawingOrderCallback(new FanChildDrawingOrderCallback(mFanLayoutManager));

        (view.findViewById(R.id.logo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFanLayoutManager.collapseViews();
            }
        });

    }

    @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onClick(View view, int pos) {
        FullInfoTabFragment fragment = FullInfoTabFragment.newInstance(mAdapter.getModelByPos(pos));

        fragment.setSharedElementEnterTransition(new SharedTransitionSet());
        fragment.setEnterTransition(new Fade());
        setExitTransition(new Fade());
        fragment.setSharedElementReturnTransition(new SharedTransitionSet());

        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .addSharedElement(view, "shared")
                .replace(R.id.root, fragment)
                .addToBackStack(null)
                .commit();
    }

    public void onClick(int pos) {
        FullInfoTabFragment fragment = FullInfoTabFragment.newInstance(mAdapter.getModelByPos(pos));
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root, fragment)
                .addToBackStack(null)
                .commit();
    }

    public boolean deselectIfSelected() {
        if (mFanLayoutManager.isItemSelected()) {
            mFanLayoutManager.deselectItem();
            return true;
        } else {
            return false;
        }
    }
    public String loadfromasset() {
        try {
            InputStream is =getActivity().getAssets().open(filename);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");
            return json;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
