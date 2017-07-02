package ru.medvedovo.vkclient.adapters.holders;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

import butterknife.BindView;
import butterknife.ButterKnife;

import ru.medvedovo.vkclient.R;
import ru.medvedovo.vkclient.models.newsfeed.Attachment_;
import ru.medvedovo.vkclient.models.newsfeed.Item;
import ru.medvedovo.vkclient.utils.DownloadImageTask;

public class NewsfeedPostHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.post_source_picture)
    ImageView postSourcePicture;

    @BindView(R.id.post_source_name)
    TextView postSourceName;

    @BindView(R.id.post_date)
    TextView postDate;

    @BindView(R.id.post_description)
    TextView postDescription;

    @BindView(R.id.post_picture)
    ImageView postPicture;

    @BindView(R.id.post_social)
    TextView postSocial;

    public NewsfeedPostHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public static void bind(NewsfeedPostHolder holder, Activity activity, Item item, String sourcePictureUrl, String sourceName) {
        holder.postSourceName.setText(sourceName);
        new DownloadImageTask(holder.postSourcePicture).execute(sourcePictureUrl);
        if (item.getDate() != null) {
            holder.postDate.setText(getDateCurrentTimeZone(item.getDate()));
        }
        holder.postDescription.setText(item.getText());
        holder.postSocial.setText(String.format(Locale.getDefault(), "Лайки: %d Репосты: %d",
                item.getLikes() != null ? item.getLikes().getCount() : 0, item.getReposts() != null ? item.getReposts().getCount() : 0));

        // Формирование превью в зависимости от типа поста
        if (Objects.equals(item.getType(), "wall_photo") && item.getPhotos() != null && !item.getPhotos().getItems().isEmpty()) {
            new DownloadImageTask(holder.postPicture).execute(item.getPhotos().getItems().get(0).getPhoto604());
        }
        if (Objects.equals(item.getType(), "post") && item.getAttachments() != null && !item.getAttachments().isEmpty()) {
            Attachment_ attachment = item.getAttachments().get(0);
            String pictureSource = "";
            switch (attachment.getType()) {
                case "photo":
                    pictureSource = attachment.getPhoto().getPhoto604();
                    break;
                case "video":
                    pictureSource = attachment.getVideo().getPhoto320();
                    break;
            }
            new DownloadImageTask(holder.postPicture).execute(pictureSource);
        }
    }

    private static String getDateCurrentTimeZone(long timestamp) {
        try {
            Calendar calendar = Calendar.getInstance();
            TimeZone tz = TimeZone.getDefault();
            calendar.setTimeInMillis(timestamp * 1000);
            calendar.add(Calendar.MILLISECOND, tz.getOffset(calendar.getTimeInMillis()));
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.yyyy", Locale.getDefault());
            Date currenTimeZone = calendar.getTime();
            return sdf.format(currenTimeZone);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
