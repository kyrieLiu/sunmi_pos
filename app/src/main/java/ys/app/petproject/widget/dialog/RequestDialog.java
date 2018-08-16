package ys.app.petproject.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;

import ys.app.petproject.R;


/**
 * Created by LYY on 2016/6/10.
 */
public class RequestDialog extends Dialog {



    public RequestDialog(Context activity) {
        super(activity, R.style.Theme_RequestDialog);
        super.setContentView(R.layout.request_dialog);
        Window dialogWindow = getWindow();
        dialogWindow.setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
        init();
    }


    private void init() {
        this.setCanceledOnTouchOutside(true);
        this.setCancelable(true);
//        this.setOnCancelListener(new DisDialog());
    }

//    class DisDialog implements DialogInterface.OnCancelListener{
//        @Override
//        public void onCancel(DialogInterface dialog) {
//           StuApplication.getInstance().cancelPendingRequests(mUrlTag);
//        }
//    }
}
