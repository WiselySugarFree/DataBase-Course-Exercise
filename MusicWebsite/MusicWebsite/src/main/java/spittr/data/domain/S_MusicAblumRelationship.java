package spittr.data.domain;

/**
 * Created by tanjian on 2016/12/30.
 * 专辑歌曲关系实体
 */
public class S_MusicAblumRelationship {
    private String s_aid;
    private String s_songid;

    public String getS_aid() {
        return s_aid;
    }

    public void setS_aid(String s_aid) {
        this.s_aid = s_aid;
    }

    public String getS_songid() {
        return s_songid;
    }

    public void setS_songid(String s_songid) {
        this.s_songid = s_songid;
    }

    public S_MusicAblumRelationship(String s_aid, String s_songid) {
        this.s_aid = s_aid;
        this.s_songid = s_songid;
    }

    @Override
    public String toString() {
        return "S_MusicAblumRelationship{" +
                "s_aid:" + s_aid + ',' +
                "s_songid:" + s_songid + ',' + '}';
    }
}
