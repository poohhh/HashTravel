package edu.android.hashtravel;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import static edu.android.hashtravel.DashBoard.Place;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotPlaceFragment extends Fragment {

    private RecyclerView recyclerView;
    private PlaceDao placeDao = PlaceDao.getInstance();

    public HotPlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hot_place, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        PlaceAdapter adapter = new PlaceAdapter();

        recyclerView.setAdapter(adapter);

        return view;
    }

    public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

        @NonNull
        @Override
        public PlaceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = getLayoutInflater().inflate(R.layout.hotplace_item, parent, false);

            ViewHolder holder = new ViewHolder(itemView);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
            Place placeSite = placeDao.getPlaceList().get(position);

            viewHolder.imageView.setImageResource(placeSite.getPhotoId());
            viewHolder.textView.setText(placeSite.getName());
            viewHolder.ratingBar.setRating(placeSite.getRating());
        }

        @Override
        public int getItemCount() {
            return placeDao.getPlaceList().size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView imageView;
            private TextView textView;
            private RatingBar ratingBar;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.placeImageView);
                textView = itemView.findViewById(R.id.placeTextName);
                ratingBar = itemView.findViewById(R.id.ratingBar);
            }
        }
    }


}
