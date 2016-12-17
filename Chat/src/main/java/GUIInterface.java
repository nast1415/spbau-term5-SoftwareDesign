/**
 * Created by n_buga on 03.12.16.
 * This method describes the methods of GUI that Controller needs to work. For example restart if there is a error in
 * interaction.
 */
public interface GUIInterface {
    void restart();
    void handleMsg(Msg msg);
}
