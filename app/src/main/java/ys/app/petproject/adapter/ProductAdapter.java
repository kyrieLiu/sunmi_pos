package ys.app.petproject.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.greendao.CommitOrderTempInfoDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.StringUtils;

/**
 * 作者：lv
 * 时间：2017/4/2 16:42
 */

public class ProductAdapter extends BaseAdapter {

    private Context mContext;
    private List<CommitOrderTempInfo> mLists;
    private int num;
    private RxManager mRxManager;

    public ProductAdapter(Context context, List<CommitOrderTempInfo> list) {
        this.mContext = context;
        this.mLists = list;
        this.mRxManager = new RxManager();
    }

    @Override
    public int getCount() {
        return mLists.size();
    }

    @Override
    public Object getItem(int position) {
        return mLists.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        final Viewholder viewholder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.product_item, null);
            viewholder = new Viewholder();
            viewholder.tv_name = (TextView) view.findViewById(R.id.tv_name);
            viewholder.tv_price = (TextView) view.findViewById(R.id.tv_price);
            viewholder.iv_add = (ImageView) view.findViewById(R.id.iv_add);
            viewholder.iv_remove = (ImageView) view.findViewById(R.id.iv_remove);
            viewholder.zengsong_iv = (ImageView) view.findViewById(R.id.zengsong_iv);
            viewholder.tv_count = (TextView) view.findViewById(R.id.tv_count);
            viewholder.oldAmt_rl = (RelativeLayout) view.findViewById(R.id.oldAmt_rl);
            viewholder.oldAmt_tv = (TextView) view.findViewById(R.id.oldAmt_tv);

            view.setTag(viewholder);
        } else {
            viewholder = (Viewholder) view.getTag();
        }

        final CommitOrderTempInfo info = mLists.get(position);
        num = info.getNum();
        StringUtils.filtNull(viewholder.tv_name, info.getName());//商品名称
        if (info.getType()==2||info.getType()==1){
            if (Constants.is_promotion == info.getIsPromotion()) {
                viewholder.oldAmt_rl.setVisibility(View.VISIBLE);
                StringUtils.filtNull(viewholder.tv_price, "促销￥" + AppUtil.formatStandardMoney(info.getPromotionAmt()));//商品价格
                StringUtils.filtNull(viewholder.oldAmt_tv, "￥" + AppUtil.formatStandardMoney(info.getPrice()));//商品原价
            } else {
                viewholder.oldAmt_rl.setVisibility(View.GONE);
                StringUtils.filtNull(viewholder.tv_price, "￥" + AppUtil.formatStandardMoney(info.getRealAmt()));//商品价格
            }
        }else{
            StringUtils.filtNull(viewholder.tv_price, info.getTypeName());
        }


        if(1==info.getIsGift()){
            viewholder.zengsong_iv.setVisibility(View.VISIBLE);
            viewholder.tv_name.setTextColor(Color.parseColor("#999999"));
            viewholder.tv_count.setTextColor(Color.parseColor("#999999"));
            viewholder.tv_price.setTextColor(Color.parseColor("#999999"));
        }else {
            viewholder.zengsong_iv.setVisibility(View.GONE);
            viewholder.tv_name.setTextColor(Color.parseColor("#666666"));
            viewholder.tv_count.setTextColor(Color.parseColor("#666666"));
            viewholder.tv_price.setTextColor(Color.parseColor("#ff1700"));
        }
        viewholder.tv_count.setText(String.valueOf(info.getNum()));//商品数量
        viewholder.iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                qb.where(CommitOrderTempInfoDao.Properties.DbId.eq(info.getDbId()));
                CommitOrderTempInfo entity = (CommitOrderTempInfo) qb.unique();
                int num = entity.getNum() + 1;
                entity.setNum(num);
                commitOrderTempInfoDao.update(entity);
                viewholder.tv_count.setText(num + "");
                mRxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
            }
        });
        viewholder.iv_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CommitOrderTempInfoDao commitOrderTempInfoDao = GreenDaoUtils.getSingleTon().getmDaoSession().getCommitOrderTempInfoDao();
                QueryBuilder qb = commitOrderTempInfoDao.queryBuilder();
                qb.where(CommitOrderTempInfoDao.Properties.DbId.eq(info.getDbId()));
                CommitOrderTempInfo entity = (CommitOrderTempInfo) qb.unique();
                int num = entity.getNum() - 1;
                entity.setNum(num);
                if (num == 0) {
                    commitOrderTempInfoDao.delete(entity);
                } else {
                    commitOrderTempInfoDao.update(entity);
                }
                if (num == 0) {
                    mLists.remove(info);
                    notifyDataSetChanged();
                }
                viewholder.tv_count.setText(num + "");
                mRxManager.post(Constants.bus_db, Constants.type_update_commitOrder_db);
            }
        });

        return view;
    }

    class Viewholder {
        TextView tv_price;
        TextView tv_name;
        ImageView iv_add, iv_remove;
        TextView tv_count;
        RelativeLayout oldAmt_rl;
        TextView oldAmt_tv;
        ImageView zengsong_iv;
    }

}
