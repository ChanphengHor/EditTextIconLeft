package chanphenghor.com.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by ChanPheng Hor on 4/9/2018.
 */

public class EditTextIconLeft extends LinearLayout{
    private Context context;
    private EditText editText;
    private ImageView edt_icon;
    private int showBorder;
    private int focusBorder;
    private int showDrawable;
    private int focusDrawable;
    public EditTextIconLeft(final Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View titlebar = View.inflate(context,R.layout.edittext_iconleft,null);
        addView(titlebar, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.Options, 0, 0);
        Drawable drawable = a.getDrawable(R.styleable.Options_iconSrc);
        String hint = a.getString(R.styleable.Options_hint);
        findViewById(R.id.edt_icon).setBackgroundDrawable(drawable);
        int width = ViewGroup.LayoutParams.MATCH_PARENT; //Always Match Parent
        float height = a.getDimension(R.styleable.Options_height,ViewGroup.LayoutParams.WRAP_CONTENT);
        editText =findViewById(R.id.edt_edittext);
        editText.setHint(hint);
        edt_icon = findViewById(R.id.edt_icon);
        a.recycle();
        findViewById(R.id.ll_main).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.isEnabled()){
                    editText.requestFocus();
                }
                if(!editText.isEnabled()){
                    return;
                }else {
                    InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
                }
            }
        });
        //int heightdp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, height,getResources().getDisplayMetrics());
        // Gets linearlayout
        RelativeLayout layout = findViewById(R.id.ll_border);
        // Gets the layout params that will allow you to resize the layout
        LayoutParams params = (LayoutParams) layout.getLayoutParams();
        // Changes the height and width to the specified *pixels*
        params.height = (int) height;
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        layout.setLayoutParams(params);
        setBorderFocus(
                R.drawable.border_gray,
                R.drawable.border_focus,
                R.drawable.empty_gray,
                R.drawable.empty_focus
        );
    }
    public void setBorder(Drawable outSideBorder){
        findViewById(R.id.ll_border).setBackgroundDrawable(outSideBorder);
    }
    public void setBorder(int outSideBorder){
        findViewById(R.id.ll_border).setBackgroundColor(outSideBorder);
    }
    public void setBorderResource(int outSideBorder){
        findViewById(R.id.ll_border).setBackgroundResource(outSideBorder);
    }
    public void setSrc(int drawable){
        findViewById(R.id.edt_icon).setBackgroundResource(drawable);
    }

    public void setBorderFocus(final int showBorder, final int focusBorder, final int showDrawable, final int focusDrawable){
        this.showBorder     = showBorder;
        this.focusBorder    = focusBorder;
        this.showDrawable   = showDrawable;
        this.focusDrawable  = focusDrawable;
        findViewById(R.id.ll_border).setBackgroundResource(showBorder);
        edt_icon.setImageResource(showDrawable);
        findViewById(R.id.edt_edittext).setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(editText.isEnabled()){
                    if(b){
                        edt_icon.setImageResource(focusDrawable);
                        findViewById(R.id.ll_border).setBackgroundResource(focusBorder);
                        //InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
                        //imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
                    }else {
                        edt_icon.setImageResource(showDrawable);
                        findViewById(R.id.ll_border).setBackgroundResource(showBorder);
                    }
                }else {
                    ifItsNotEnable();
                }
            }
        });
    }

    private void ifItsEnable(){
        edt_icon.setColorFilter(null);
        findViewById(R.id.ll_border).setBackgroundResource(this.showBorder);
        edt_icon.setImageResource(focusDrawable);
    }
    private void ifItsNotEnable(){
        setBorderFocus(R.drawable.border_gray);
        edt_icon.setColorFilter(setColorFilter());
    }
    public void setBorderFocus(int showBorder){
        findViewById(R.id.ll_border).setBackgroundResource(showBorder);
    }
    public void setBorderResourceFocus(int showBorder,int focusBorder){
        findViewById(R.id.ll_border).setBackgroundResource(showBorder);
    }
    public void setSrcFocus(int drawable){
        findViewById(R.id.edt_icon).setBackgroundResource(drawable);
    }
    public Editable getText(){
        if(editText == null){
            return null;
        }else {
            return editText.getText();
        }
    }
    public EditText editText(){
        if(editText ==null){
            return null;
        }else {
            return editText;
        }
    }

    @Override
    public boolean isEnabled(){
        if(editText.isEnabled()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void setEnabled(boolean enabled){
        if(enabled){
            ifItsEnable();
            editText.setEnabled(true);
        }else {
            editText.setEnabled(false);
            ifItsNotEnable();
        }
    }
    public ImageView iconLeft(){
        if(edt_icon ==null){
            return null;
        }else {
            return edt_icon;
        }
    }
    private ColorFilter setColorFilter(){
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);

        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        //iconLeft().setColorFilter(filter);
        return filter;
    }
}
