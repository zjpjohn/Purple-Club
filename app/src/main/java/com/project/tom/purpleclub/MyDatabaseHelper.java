package com.project.tom.purpleclub;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tom on 2016/2/2.
 */
public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_SHOTS = "create table shots ("
            + "id integer primary key autoincrement, "
            + "drawer_position text, "
            + "page_position text, "
            + "shot_id text, "
            + "title text, "
            + "description text, "
            + "width text, "
            + "height text, "
            + "image_big_url text, "
            + "image_normal_url text, "
            + "image_small_url text, "
            + "views_count text, "
            + "likes_count text, "
            + "comments_count text, "
            + "created_at text, "
            + "animated text, "
            + "user_id text, "
            + "name text, "
            + "username text, "
            + "html_url text, "
            + "avatar_url text, "
            + "bio text, "
            + "location text, "
            + "web text, "
            + "twitter text, "
            + "buckets_count text, "
            + "comments_received_count text, "
            + "followers_count text, "
            + "followings_count text, "
            + "user_likes_count text, "
            + "likes_received_count text, "
            + "projects_count text, "
            + "rebounds_received_count text, "
            + "shots_count text, "
            + "teams_count text, "
            + "can_upload_shot text, "
            + "type text, "
            + "pro text, "
            + "team text)";

    public static final String COMMENTS_TABLE = "create table comments ("
            + "id integer primary key autoincrement, "
            + "comment_id text, "
            + "body text, "
            + "likes_count text, "
            + "created_at text, "
            + "user_id text, "
            + "name text, "
            + "username text, "
            + "html_url text, "
            + "avatar_url text, "
            + "bio text, "
            + "location text, "
            + "web text, "
            + "twitter text, "
            + "buckets_count text, "
            + "comments_received_count text, "
            + "followers_count text, "
            + "followings_count text, "
            + "user_likes_count text, "
            + "likes_received_count text, "
            + "projects_count text, "
            + "rebounds_received_count text, "
            + "shots_count text, "
            + "teams_count text, "
            + "can_upload_shot text, "
            + "type text, "
            + "pro text)";

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_SHOTS);
        db.execSQL(COMMENTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + "shots");
        db.execSQL("drop table if exists " + "comments");
        onCreate(db);

    }
}
