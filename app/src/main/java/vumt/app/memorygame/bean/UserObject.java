package vumt.app.memorygame.bean;

/**
 * Created by Mac The Vu on 3/10/2017.
 */

public class UserObject {
    public String idUser = null;
    public String userName = null;
    public int hightScore = 0;

    public void setIdUser(String _id) {
        this.idUser = _id;
    }

    public String getIdUser() {
        return this.idUser;
    }

    public void setUserName(String _userName) {
        this.userName = _userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setHightScore(int _hightScore) {
        this.hightScore = _hightScore;
    }

    public int getHightScore() {
        return this.hightScore;
    }
}
