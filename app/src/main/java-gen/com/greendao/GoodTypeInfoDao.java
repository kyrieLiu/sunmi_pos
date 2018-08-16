package com.greendao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import ys.app.petproject.model.GoodTypeInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GOOD_TYPE_INFO".
*/
public class GoodTypeInfoDao extends AbstractDao<GoodTypeInfo, Long> {

    public static final String TABLENAME = "GOOD_TYPE_INFO";

    /**
     * Properties of entity GoodTypeInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ShopId = new Property(0, String.class, "shopId", false, "SHOP_ID");
        public final static Property Imgurl = new Property(1, String.class, "imgurl", false, "IMGURL");
        public final static Property Allcount = new Property(2, String.class, "allcount", false, "ALLCOUNT");
        public final static Property Count = new Property(3, int.class, "count", false, "COUNT");
        public final static Property Name = new Property(4, String.class, "name", false, "NAME");
        public final static Property Id = new Property(5, long.class, "id", true, "_id");
        public final static Property Select = new Property(6, int.class, "select", false, "SELECT");
        public final static Property RequestTime = new Property(7, long.class, "requestTime", false, "REQUEST_TIME");
        public final static Property Discount = new Property(8, double.class, "discount", false, "DISCOUNT");
        public final static Property ClassifyName = new Property(9, String.class, "classifyName", false, "CLASSIFY_NAME");
        public final static Property VipCardId = new Property(10, Long.class, "vipCardId", false, "VIP_CARD_ID");
        public final static Property ClassifyId = new Property(11, int.class, "classifyId", false, "CLASSIFY_ID");
        public final static Property Type = new Property(12, int.class, "type", false, "TYPE");
        public final static Property CardId = new Property(13, int.class, "cardId", false, "CARD_ID");
    }

    private Query<GoodTypeInfo> vipCardInfo_CardDiscountListQuery;

    public GoodTypeInfoDao(DaoConfig config) {
        super(config);
    }
    
    public GoodTypeInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GOOD_TYPE_INFO\" (" + //
                "\"SHOP_ID\" TEXT," + // 0: shopId
                "\"IMGURL\" TEXT," + // 1: imgurl
                "\"ALLCOUNT\" TEXT," + // 2: allcount
                "\"COUNT\" INTEGER NOT NULL ," + // 3: count
                "\"NAME\" TEXT," + // 4: name
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 5: id
                "\"SELECT\" INTEGER NOT NULL ," + // 6: select
                "\"REQUEST_TIME\" INTEGER NOT NULL ," + // 7: requestTime
                "\"DISCOUNT\" REAL NOT NULL ," + // 8: discount
                "\"CLASSIFY_NAME\" TEXT," + // 9: classifyName
                "\"VIP_CARD_ID\" INTEGER," + // 10: vipCardId
                "\"CLASSIFY_ID\" INTEGER NOT NULL ," + // 11: classifyId
                "\"TYPE\" INTEGER NOT NULL ," + // 12: type
                "\"CARD_ID\" INTEGER NOT NULL );"); // 13: cardId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GOOD_TYPE_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GoodTypeInfo entity) {
        stmt.clearBindings();
 
        String shopId = entity.getShopId();
        if (shopId != null) {
            stmt.bindString(1, shopId);
        }
 
        String imgurl = entity.getImgurl();
        if (imgurl != null) {
            stmt.bindString(2, imgurl);
        }
 
        String allcount = entity.getAllcount();
        if (allcount != null) {
            stmt.bindString(3, allcount);
        }
        stmt.bindLong(4, entity.getCount());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
        stmt.bindLong(6, entity.getId());
        stmt.bindLong(7, entity.getSelect());
        stmt.bindLong(8, entity.getRequestTime());
        stmt.bindDouble(9, entity.getDiscount());
 
        String classifyName = entity.getClassifyName();
        if (classifyName != null) {
            stmt.bindString(10, classifyName);
        }
 
        Long vipCardId = entity.getVipCardId();
        if (vipCardId != null) {
            stmt.bindLong(11, vipCardId);
        }
        stmt.bindLong(12, entity.getClassifyId());
        stmt.bindLong(13, entity.getType());
        stmt.bindLong(14, entity.getCardId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GoodTypeInfo entity) {
        stmt.clearBindings();
 
        String shopId = entity.getShopId();
        if (shopId != null) {
            stmt.bindString(1, shopId);
        }
 
        String imgurl = entity.getImgurl();
        if (imgurl != null) {
            stmt.bindString(2, imgurl);
        }
 
        String allcount = entity.getAllcount();
        if (allcount != null) {
            stmt.bindString(3, allcount);
        }
        stmt.bindLong(4, entity.getCount());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
        stmt.bindLong(6, entity.getId());
        stmt.bindLong(7, entity.getSelect());
        stmt.bindLong(8, entity.getRequestTime());
        stmt.bindDouble(9, entity.getDiscount());
 
        String classifyName = entity.getClassifyName();
        if (classifyName != null) {
            stmt.bindString(10, classifyName);
        }
 
        Long vipCardId = entity.getVipCardId();
        if (vipCardId != null) {
            stmt.bindLong(11, vipCardId);
        }
        stmt.bindLong(12, entity.getClassifyId());
        stmt.bindLong(13, entity.getType());
        stmt.bindLong(14, entity.getCardId());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 5);
    }    

    @Override
    public GoodTypeInfo readEntity(Cursor cursor, int offset) {
        GoodTypeInfo entity = new GoodTypeInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // shopId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // imgurl
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // allcount
            cursor.getInt(offset + 3), // count
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // name
            cursor.getLong(offset + 5), // id
            cursor.getInt(offset + 6), // select
            cursor.getLong(offset + 7), // requestTime
            cursor.getDouble(offset + 8), // discount
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // classifyName
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // vipCardId
            cursor.getInt(offset + 11), // classifyId
            cursor.getInt(offset + 12), // type
            cursor.getInt(offset + 13) // cardId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GoodTypeInfo entity, int offset) {
        entity.setShopId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setImgurl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAllcount(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCount(cursor.getInt(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setId(cursor.getLong(offset + 5));
        entity.setSelect(cursor.getInt(offset + 6));
        entity.setRequestTime(cursor.getLong(offset + 7));
        entity.setDiscount(cursor.getDouble(offset + 8));
        entity.setClassifyName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setVipCardId(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setClassifyId(cursor.getInt(offset + 11));
        entity.setType(cursor.getInt(offset + 12));
        entity.setCardId(cursor.getInt(offset + 13));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(GoodTypeInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(GoodTypeInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GoodTypeInfo entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "cardDiscountList" to-many relationship of VipCardInfo. */
    public List<GoodTypeInfo> _queryVipCardInfo_CardDiscountList(Long vipCardId) {
        synchronized (this) {
            if (vipCardInfo_CardDiscountListQuery == null) {
                QueryBuilder<GoodTypeInfo> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.VipCardId.eq(null));
                vipCardInfo_CardDiscountListQuery = queryBuilder.build();
            }
        }
        Query<GoodTypeInfo> query = vipCardInfo_CardDiscountListQuery.forCurrentThread();
        query.setParameter(0, vipCardId);
        return query.list();
    }

}
