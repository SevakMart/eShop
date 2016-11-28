package action;

/**
 * Created by forjava on 11/8/2016.
 */
public class LogoutAction extends BaseAction {

    @Override
    public String execute() throws Exception {
        invalidate();
        return SUCCESS;
    }
}
